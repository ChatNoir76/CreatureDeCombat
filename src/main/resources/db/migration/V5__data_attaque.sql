-- INSERT INTO attaque VALUES (ID, ID_DEGAT, NOM, DESCRIPTION, ENERGIE_PRI, ENERGIE_SEC, CATEGORIE);

-- CLASSIQUE
INSERT INTO attaque VALUES ('1', 2, "Claque", "Donne une claque à son adversaire", '0', '0', 1);
INSERT INTO attaque VALUES ('2', 4, "Coup de Pied", "Donne un coup de pied à son adversaire", '1', '0', 1);
INSERT INTO attaque VALUES ('3', 5, "Etouffement", "Avec sa longue queue, il étouffe ses adversaires", '1', '0', 1);
INSERT INTO attaque VALUES ('4', 1, "Boule de Terre", "Lance une boule de terre à son adversaire", '0', '0', 1);
INSERT INTO attaque VALUES ('5', 3, "Coup de Tête", "Déclenchement d'un coup de tête par surprise", '0', '0', 1);

-- ADORABLE
INSERT INTO attaque VALUES ('6', 21, "Bisou Magique", "ça va toujours mieux après un bisou magique", '0', '0', 2);
INSERT INTO attaque VALUES ('7', 13, "Regard Attendrissant", "Vous ne serez plus comme avant après un tel regard", '1', '0', 2);
INSERT INTO attaque VALUES ('8', 1, "Gros Bisou", "Beaucoup d'amour et d'affection en un seul bisou", '1', '1', 2);
INSERT INTO attaque VALUES ('9', 19, "Surcharge Affective", "Les émotions vont bouillir dans votre corps", '3', '0', 2);
INSERT INTO attaque VALUES ('10', 27, "Calin", "Vous serez de nouveau prêt à tout affronter après un gros calin", '1', '0', 2);

-- MAJESTUEUX
INSERT INTO attaque VALUES ('11', 5, "Rayon Cosmique", "Détourne la lumière des étoiles pour infliger des dégats à son adversaire", '1', '1', 3);
INSERT INTO attaque VALUES ('12', 3, "Etourdissement ", "Etourdie son adversaire par son charisme", '0', '1', 3);
INSERT INTO attaque VALUES ('13', 28, "Régénération Syntaxique", "Créer une connexion régénératrice depuis l'au delà", '3', '1', 3);
INSERT INTO attaque VALUES ('14', 14, "Vol Ancestral", "Percute son adversaire suite à une danse majestueuse", '1', '0', 3);
INSERT INTO attaque VALUES ('15', 19, "Force D'excalibur", "Concentre le pouvoir d'Excalibur et le projette sur son adversaire", '2', '0', 3);

-- MALEFIQUE
INSERT INTO attaque VALUES ('16', 7, "Coup de Griffe", "Attaque avec ses griffes de devant", '1', '1', 4);
INSERT INTO attaque VALUES ('17', 20, "Ecrasement Maléfique", "il entre en trans et il écrase tout sur son passage", '3', '1', 4);
INSERT INTO attaque VALUES ('18', 8, "Morsure", "Attaque avec ses dents aiguisées", '1', '1', 4);
INSERT INTO attaque VALUES ('19', 4, "Rayon Gamma", "Récupère l'intensité de la lune pour la restituer sous forme de laser destructeur", '0', '1', 4);
INSERT INTO attaque VALUES ('20', 24, "Marche des Ténèbres", "Appel aux âmes déchues pour se régénérer", '3', '0', 4);

-- WHATTHEFUCK
INSERT INTO attaque VALUES ('21', 15, "Ketchouppy", "Récupère la sauce brulante pour la jeter sur son adversaire", '1', '0', 5);
INSERT INTO attaque VALUES ('22', 10, "Inertie Négative", "Déforme l'espace-temps près du corps de l'adversaire", '3', '0', 5);
INSERT INTO attaque VALUES ('23', 6, "Mal de Ventre", "Projection bactérienne d'aliments en décomposition", '1', '0', 5);
INSERT INTO attaque VALUES ('24', 22, "Gelée gluante", "Concentré de bactérie en gelée régénératif", '2', '0', 5);
INSERT INTO attaque VALUES ('25', 25, "Cocon poisseux", "Protection et régénération via un cocon", '1', '0', 5);

-- Création des loulous
INSERT INTO attaque VALUES ('26', 3, "Feuilles piquantes", "Empoisonne l'adversaire pour le plonger dans un profond sommeil", '0', '0', 1);
INSERT INTO attaque VALUES ('27', 13, "Retournement des feuilles", "Retourne l'attaque de son adversaire contre lui", '0', '1', 1);
INSERT INTO attaque VALUES ('28', 11, "Boule de poils", "Petite boule de poils baveuse qui collent l'adversaire", '0', '1', 2);
INSERT INTO attaque VALUES ('29', 29, "Crachat de lave", "Il crache de la lave sur ses adversaires", '0', '0', 2);
INSERT INTO attaque VALUES ('30', 30, "Dents faucheuses", "Quand il mort il injecte un virus", '0', '0', 2);
INSERT INTO attaque VALUES ('31', 25, "Phoenix", "Il se régénère grace au soleil", '1', '0', 1);
INSERT INTO attaque VALUES ('32', 18, "Tremblement de terre", "Il crée un tremblement de terre en frappant avec sa queue", '1', '0', 1);
INSERT INTO attaque VALUES ('33', 5, "Frappe aile", "frappe son adversaire avec la tranche de son aile", '0', '0', 1);
INSERT INTO attaque VALUES ('34', 7, "Huppe dévastatrice", "frappe son adversaire avec sa huppe", '0', '0', 1);
INSERT INTO attaque VALUES ('35', 22, "Frayeur nocture", "Il se régénère grâce à la peur de ses adversaires", '1', '1', 4);
INSERT INTO attaque VALUES ('36', 3, "Pic brulant", "Il lance ses pics qui repoussent sur son adversaire", '0', '1', 5);
INSERT INTO attaque VALUES ('37', 2, "Griffure", "Griffe ses adversaires avec ses pattes", '0', '0', 1);
INSERT INTO attaque VALUES ('38', 31, "Rayon Gamma royal", "Récupère l'intensité de la lune pour la restituer sous forme de laser destructeur", '0', '1', 4);
INSERT INTO attaque VALUES ('39', 14, "Miaulement", "Qui casse les oreilles de ses adversaires", '0', '0', 1);
INSERT INTO attaque VALUES ('40', 6, "Pompine", "Des épines sortent de son pompon pour les jetter sur son adversaire", '2', '0', 1);
INSERT INTO attaque VALUES ('41', 32, "Roulé Boulet", "Se met en boule pour foncer sur son adversaire tout en faisant ressortir ses pics", '2', '0', 1);
INSERT INTO attaque VALUES ('42', 32, "Lèchouille de la mort", "Lèche son adversaire et répands des bactéries sur tout son corps", '0', '0', 1);
INSERT INTO attaque VALUES ('43', 4, "Charge funeste", "Charge son adversaire pour le renverser", '0', '0', 1);


INSERT INTO sequence_id VALUES ('attaque', '28');
