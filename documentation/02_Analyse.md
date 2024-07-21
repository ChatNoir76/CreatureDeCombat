# Analyse

Table des matières:

- [1. Authentification](#1-authentification)
- [2. Création Salle](#2-création-salle)
- [3. Rejoindre Salle](#3-rejoindre-salle)
- [4. Gestion Deck](#4-gestion-deck)
  - [4.1 Chargement](#41-chargement-deck)
  - [4.2 Ajouter Carte](#42-ajouter-carte)
  - [4.3 Retirer Carte](#43-retirer-carte)
  - [4.4 Enregistrement](#44-enregistrement-deck)
- [5. Jouer](#5-jouer)
  - [5.1 Chargement](#51-chargement-plateau-jeu)
  - [5.1 Ajouter Créature Base](#52-ajouter-créature-de-base)
  - [5.1 Fin Actions Optionnelles](#53-fin-actions-optionnelles)
  - [5.1 Attaquer](#54-attaquer)

Pour les risques :

0. pas de problème
1. c'est plutot bien documenté
2. il faudra chercher l'information et expérimenter
3. c'est compliqué car difficile à mettre en place

Pour la pertinence :

0. c'est un nice to have
1. le système reste cohérent sans cette fonctionnalité
2. la majeure partie du système peut fonctionner
3. c'est obligatoire pour que ça fonctionne

| Cas | Risques | Pertinence | Prioritaire |
| -- | -- | -- | -- |
| Consultation Crédit| 0 | 0  | non |
| Jouer | 3 | 3 | oui  |
| Rejoindre Salle | 1 | 2 | oui |
| Créer Salle | 2 | 2 | oui |
| Changement mot de passe| 0 | 1 | non |
| Gestion Deck | 1 | 3 | oui |
| Authentification| 0 | 3 | oui |
| Créer un compte| 0 | 3 | oui|
| Gestion du jeu| 1 | 1 | non |

<div style="page-break-after: always"/>

## 1. Authentification

L'authentification sera géré par un mécanisme interne au framework

```plantuml
@startuml
    class AuthentificationController <<boundary>> {
        login()
    }
    class AuthentificationService <<workflow>> {
        login()
    }
    class AuthentificationRepository <<lifecycle>> {
        findUser()
    }
    class User <<entity>> {
        checkPassword()
    }

    AuthentificationController -> AuthentificationService
    AuthentificationService -> AuthentificationRepository
    AuthentificationService .> User

@enduml
```

```plantuml
@startuml
scale 1
    actor Invité as i
    boundary AuthentificationController as ui
    control AuthentificationService as ct
    participant "AuthentificationRepository" as dao <<LifeCycle>>
    entity "user : User" as u

    i -> i: setLogin()
    i -> i: setPassword()
    i -> ui: login()
    ui -> ct: login()
    ct -> dao: findUser()
    dao-->ct: user
    ct->u: checkPassword()
    u-->ct: true or false
    ct-->i:valid or error
@enduml
```

<div style="page-break-after: always"/>

## 2. Création Salle

La salle permet à deux joueurs de s'affronter

```plantuml
@startuml
    class SalleController <<boundary>> {
        ouvrirSalle()
    }
    class SalleService <<workflow>> {
        openSalle()
    }
    class SalleFactory <<lifecycle>> {
        createSalle()
    }
    class Salle <<entity>> {
        setParticipant()
    }

    SalleController -> SalleService
    SalleService -> SalleFactory
    SalleService .> Salle

@enduml
```

```plantuml
@startuml
actor Joueur as a
boundary SalleController as rc
control SalleService as s
participant "SalleFactory" as f <<LifeCycle>>
entity "salle : Salle" as e

a -> a: setJoueur()
a -> rc: ouvrirSalle()
rc -> s: openSalle()
s -> f: createSalle()
f --> s: salle
s -> e: setParticipant()
e --> a: waiting
@enduml
```

Un objet salle devra gérer les deux participants

<div style="page-break-after: always"/>

## 3. Rejoindre Salle

Pour rejoindre une salle, il est nécessaire qu'un 1er joueur ait créé la salle.
Il ne sera possible de jouer que lorsque deux joueurs seront présents

```plantuml
@startuml
    class SalleController <<boundary>> {
        rejoindreSalle()
    }
    class SalleService <<workflow>> {
        joinSalle()
    }
    class Salle <<entity>> {
        setParticipant()
    }

    SalleController -> SalleService
    SalleService .> Salle

@enduml
```

```plantuml
@startuml
actor Joueur as a
boundary SalleController as rc
control SalleService as s
entity "salle : Salle" as e
note left of a: Salle crée
a -> a: setJoueur()
a -> rc: rejoindreSalle()
rc -> s: joinSalle()
s -> e: setParticipant()
e --> a: playing
@enduml
```

<div style="page-break-after: always"/>

## 4. Gestion Deck

### 4.1. Chargement Deck

Il n'est pas encore décidé si le joueur pourra avoir un ou plusieurs Deck associé à son nom ou bien si le joueur peut le choisir dans une liste de deck ouvert à tous.

```plantuml
@startuml
    class DeckController <<boundary>> {
        
    }
    class DeckService <<workflow>> {
        chargementDeck()
    }
    class DeckRepository <<lifecycle>> {
        findDeck()
    }
    class Deck <<entity>> {
        
    }

    DeckController -> DeckService
    DeckService -> DeckRepository
    DeckService .> Deck

@enduml
```

```plantuml
@startuml
actor Joueur as a
boundary DeckController as rc
control DeckService as s
participant "DeckRepository" as dao <<LifeCycle>>
entity "deck : Deck" as deck
rc -> s: chargementDeck()
s -> dao: findDeck()
dao --> s : deck
s --> a: affichage
@enduml
```

<div style="page-break-after: always"/>

### 4.2. Ajouter Carte

Le Deck doit être chargé au préalable

```plantuml
@startuml
    class AjoutCarteController <<boundary>> {
        ajouterCarte()
    }
    class AjoutCarteService <<workflow>> {
        ajouterCarte()
    }
    class CarteRepository <<lifecycle>> {
        findCarte()
    }
    class Deck <<entity>> {
        insertCarte()
    }

    AjoutCarteController -> AjoutCarteService
    AjoutCarteService -> CarteRepository
    AjoutCarteService .> Deck

@enduml
```

```plantuml
@startuml
actor Joueur as a
boundary AjoutCarteController as rc
control AjoutCarteService as s
participant "CarteRepository" as dao <<LifeCycle>>
entity "deck : Deck" as deck
entity "carte : Carte" as carte
note left of a : Chargement Deck
a -> a: selectionnerCarte()
a -> rc: ajouterCarte()
rc -> s: ajouterCarte()
s -> dao: findCarte()
dao --> s : carte
s --> deck : insertCarte()
deck --> s

s --> a:
@enduml
```

<div style="page-break-after: always"/>

### 4.3. Retirer Carte

Le Deck doit être chargé au préalable

```plantuml
@startuml
    class RetraitCarteController <<boundary>> {
        retirerCarte()
    }
    class RetraitCarteService <<workflow>> {
        retirerCarte()
    }
    class CarteRepository <<lifecycle>> {
        findCarte()
    }
    class Deck <<entity>> {
        deleteCarte()
    }

    RetraitCarteController -> RetraitCarteService
    RetraitCarteService -> CarteRepository
    RetraitCarteService .> Deck

@enduml
```

```plantuml
@startuml
actor Joueur as a
boundary RetraitCarteController as rc
control RetraitCarteService as s
participant "CarteRepository" as dao <<LifeCycle>>
entity "deck : Deck" as deck
entity "carte : Carte" as carte
note left of a : Chargement Deck
a -> a: selectionnerCarte()
a -> rc: retirerCarte()
rc -> s: retirerCarte()
s -> dao: findCarte()
dao --> s : carte
s --> deck : deleteCarte()
deck --> s
s --> a:
@enduml
```

<div style="page-break-after: always"/>

### 4.4. Enregistrement Deck

Le Deck doit être chargé au préalable.

```plantuml
@startuml
    class EnregistrementDeckController <<boundary>> {
        EnregistrerDeck()
    }
    class EnregistrementDeckService <<workflow>> {
        EnregistrerDeck()
    }
    class DeckRepository <<lifecycle>> {
        findDeck()
    }
    class Deck <<entity>> {
        saveDeck()
    }

    EnregistrementDeckController -> EnregistrementDeckService
    EnregistrementDeckService -> DeckRepository
    EnregistrementDeckService .> Deck

@enduml
```

```plantuml
@startuml
actor Joueur as a
boundary DeckController as rc
control DeckService as s
participant "DeckRepository" as dao <<LifeCycle>>
note left of a : Chargement Deck
a -> rc : enregistrerDeck()
rc -> s: saveDeck()
s -> dao: updateDeck()
dao --> a: sauvergardé
@enduml
```

<div style="page-break-after: always"/>

## 5. Jouer

### 5.1. Chargement Plateau Jeu

Le chargement du plateau de jeu sera effectif suite à la création d'une salle par deux joueurs.

```plantuml
@startuml
    class JeuController <<boundary>> {
        
    }
    class JeuService <<workflow>> {
        chargementJeu()
    }
    class JeuFactory <<lifecycle>> {
        generatePlateau()
    }
    class Jeu <<entity>> {
        AjoutJoueurs()
    }

    JeuController -> JeuService
    JeuService -> JeuFactory
    JeuService .> Jeu

@enduml
```

```plantuml
@startuml
actor Joueurs as a
boundary JeuController as rc
control JeuService as s
participant "JeuFactory" as fac <<LifeCycle>>
entity "jeu : Jeu" as jeu
rc -> s: chargementJeu()
s -> fac: generatePlateau()
fac --> s : Jeu
s -> jeu: AjoutJoueurs()
jeu --> s: ok
s --> a: affichage
@enduml
```

<div style="page-break-after: always"/>

### 5.2. Ajouter Créature de Base

Dans l'idée, ce diagramme est commun à l'ensemble des actions optionnelles, soit:

- Faire évoluer Créature
- Ajouter énergie
- Jouer carte dresseur

Le système cherchera la carte dans le deck puis exécutera la méthode du Jeu correspondant à l'action en cours.

```plantuml
@startuml
    class AjoutCreatureBaseController <<boundary>> {
        AjoutCreatureBase()
    }
    class AjoutCreatureBaseService <<workflow>> {
        AjoutCreatureBase()
    }
    class Deck <<entity>> {
        findCarte()
    }
    class Jeu <<entity>> {
        ajoutCarteBase()
    }

    AjoutCreatureBaseController -> AjoutCreatureBaseService
    AjoutCreatureBaseService .> Deck
    AjoutCreatureBaseService .> Jeu

@enduml
```

```plantuml
@startuml
actor Joueur as a
boundary AjoutCreatureBaseController as rc
control AjoutCreatureBaseService as s
entity "deck : Deck" as deck
entity "jeu : Jeu" as jeu
note left of a : Chargement PlateauJeu
note left of a : Chargement Deck
a -> rc: AjoutCreatureBase()
rc -> s: AjoutCreatureBase()
s -> deck: findCarte()
deck --> s : carte
s --> jeu : ajoutCarteBase()
jeu --> s: True ou False
s --> a: Ajouter ou Erreur
@enduml
```

<div style="page-break-after: always"/>

### 5.3. Fin Actions Optionnelles

```plantuml
@startuml
    class ActionController <<boundary>> {
        FinAction()
    }
    class ActionService <<workflow>> {
        FinAction()
    }
    class Deck <<entity>> {
        
    }
    class Jeu <<entity>> {
        FinAction()
    }

    ActionController -> ActionService
    ActionService .> Jeu

@enduml
```

```plantuml
@startuml
actor Joueur as a
boundary ActionController as rc
control ActionService as s
entity "deck : Deck" as deck
entity "jeu : Jeu" as jeu
note left of a : Chargement PlateauJeu
note left of a : Chargement Deck
a -> rc: FinAction()
rc -> s: FinAction()
s -> jeu : FinAction()
jeu --> a: attaque ou fin de tour
@enduml
```

<div style="page-break-after: always"/>

### 5.4. Attaquer

```plantuml
@startuml
    class ActionController <<boundary>> {
        Attaque()
    }
    class ActionService <<workflow>> {
        Attaque()
    }
    class Jeu <<entity>> {
        Attaque()
    }

    ActionController -> ActionService
    ActionService .> Jeu

@enduml
```

```plantuml
@startuml
actor Joueur as a
boundary AttaqueController as rc
control AttaqueService as s
note left of a : Fin Actions Optionnelles
a -> rc: Attaque()
rc -> s: Attaque()
s -> jeu : Attaque()
jeu -> jeu: calculDegat()
jeu --> a: fin de tour
@enduml
```
