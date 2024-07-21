# Conception

Table des matières:

1. [Technologies utilisées](#1-technologies-utilisées)
1. [Usecase : Jouer](#2-cas-dutilisation-général--déroulement-un-tour)
    1. [Règle en vigueur](#21-réalisation-dun-tour-selon-les-règles-en-vigueur)
    1. [Diagramme de séquence d'un tour](#22-diagramme-de-séquence-dun-tour)
1. [Diagramme de classe](#3-diagramme-de-classe-du-métier)

<div class="page"/>

## 1. Technologies utilisées

Ce projet sera développé en Java17 LTS qui est la dernière version Java avec support long terme disponible.

L'architecture sera celle de Spring / Spring Boot avec utilisation des ```RestController```

L'utilisation de JPA a été préférée pour la persistance des données.

Thymeleaf sera la technologie utilisée pour le front avec l'ajout de bibliothèques additionnelles comme JQuery ou bien Bootstrap.

Le modèle métier étant la plus grosse partie du projet, l'utilisation de EMF (Eclipse Modelling Framework) sera un gros plus grâce notamment à la génération automatique des classes.

L'objectif de ce projet est d'avoir une approche DDD (Domain Driven Design) afin d'avoir un back qui pilote le front pour la partie déroulement d'un tour.
L'implémentation de ce système passera par du CRUD niveau 3 HATEOAS  
De ce fait, l'objectif du front sera d'afficher ou non certaines actions en fonction de la présence de lien venant du back.

<div class="page"/>

## 2. Cas d'utilisation général : déroulement un tour

### 2.1 Réalisation d'un tour selon les règles en vigueur

![règles](image/tourpokémon.png)

A noté que dans cette version il n'y a pas de talent.

L'étape ```F``` ne sera donc pas représentée

<div class="page"/>

### 2.2 Diagramme de séquence d'un tour

Ce usecase représente la réalisation d'un tour pour un joueur

```plantuml
@startuml
actor Joueur as joueur
actor Système as system
boundary JeuController as jeuController
control JeuService as jeuService
entity "jeu : Jeu" as jeu
entity "deck : Deck" as deck

note left of joueur : Chargement Jeu
note left of joueur : Chargement Deck

system -> jeuService : piocherCarte()
jeuService -> deck : piocher()
deck --> jeuService
jeuService -> jeu : ajoutCarteMain()
jeu --> joueur
    alt Actions optionnelles
        group Option: Ajouter une créature de base
        joueur -> jeuController : ajoutCréatureBase()
        jeuController -> jeuService : ajoutCréatureBase()
        jeuService -> deck : findCarte()
        deck --> jeuService : carte
        jeuService -> jeu : ajoutCréatureBase()
        jeu --> joueur
        end
        group Option: Faire évoluer une créature
        joueur -> jeuController : faireEvoluerCréature()
        jeuController -> jeuService : faireEvoluerCréature()
        jeuService -> deck : findCarte()
        deck --> jeuService : carte
        jeuService -> jeu : faireEvoluerCréature()
        jeu --> joueur
        end
        group Option: Ajouter carte énergie
        joueur -> jeuController : ajouterEnergie()
        jeuController -> jeuService : ajouterEnergie()
        jeuService -> deck : findCarte()
        deck --> jeuService : carte
        jeuService -> jeu : ajouterEnergie()
        jeu --> joueur
        end
        group Option: Ajouter cartes dresseur
            group Option: Ajouter cartes supporteur
            joueur -> jeuController : utilisationSupporteur()
            jeuController -> jeuService : utilisationSupporteur()
            jeuService -> deck : findCarte()
            deck --> jeuService : carte
            jeuService -> jeu : utilisationSupporteur()
            jeu --> joueur
            end
            group Option: Ajouter cartes objets
                loop utilisation des objets
                joueur -> jeuController : ajouterObjet()
                jeuController -> jeuService : ajouterObjet()
                jeuService -> deck : findCarte()
                deck --> jeuService : carte
                jeuService -> jeu : ajouterObjet()
                jeu --> joueur
                end
            end
        end
        group Option: Faire battre en retraite la créature Active
        joueur -> jeuController : retraite()
        jeuController -> jeuService : retraite()
        jeuService -> deck : findCarte()
        deck --> jeuService : carte
        jeuService -> jeu : retraite()
        jeu --> jeuService
        jeuService -> jeu : ajoutCréatureBase()
        jeu --> joueur
        end
    end
    group Option: Attaquer
    joueur -> jeuController : attaquer()
    jeuController -> jeuService : attaquer()
    jeuService -> deck : findCarte()
    deck --> jeuService : carte
    jeuService -> jeu : attaquer()
    jeu -> jeu : calculDégat()
    jeu --> joueur
    end
joueur -> jeuController : finTour()
jeuController -> jeuService : finTour()
jeuService -> jeu : finTour()
jeu --> joueur
@enduml
```

<div class="page"/>

## 3. Diagramme de classe du métier

Le diagramme de classe du métier sera donc :

![diagramme de classe](image/Métier.png)

Le système d'évolution sera managé par trois classes : ```Base```, ```Evolution``` et ```Maitre```

L'interface commune à ces évolutions sera du type ```CreatureComponent```

L'interface ```Carte``` pourra cacher des implémentations de type ```Creature```, ```Energie``` ou bien ```Dresseur``` soit trois types de cartes différentes.

Les actions possibles d'un joueur seront présentes via l'interface ```Action```
