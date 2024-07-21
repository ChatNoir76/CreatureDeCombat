-- INSERT INTO attaque VALUES (ID, ID_DEGAT, NOM, DESCRIPTION, ENERGIE_PRI, ENERGIE_SEC, CATEGORIE);

-- CLASSIQUE
INSERT INTO attaque VALUES ('1', 2, "Claque", "description...", '0', '0', 1);
INSERT INTO attaque VALUES ('2', 4, "Coup de Pied", "description...", '1', '0', 1);
INSERT INTO attaque VALUES ('3', 5, "Etouffement", "description...", '1', '0', 1);
INSERT INTO attaque VALUES ('4', 1, "Boule de Terre", "description...", '0', '0', 1);
INSERT INTO attaque VALUES ('5', 3, "Coup de Tête", "description...", '0', '0', 1);

-- ADORABLE
INSERT INTO attaque VALUES ('6', 21, "Bisou Magique", "ça va toujours mieux après un bisou magique", '0', '0', 2);
INSERT INTO attaque VALUES ('7', 13, "Regard Attendrissant", "description...", '1', '0', 2);
INSERT INTO attaque VALUES ('8', 1, "Gros Bisou", "description...", '1', '1', 2);
INSERT INTO attaque VALUES ('9', 19, "Surcharge Affective", "description...", '3', '0', 2);
INSERT INTO attaque VALUES ('10', 2, "Calin", "description...", '1', '0', 2);

-- MAJESTUEUX
INSERT INTO attaque VALUES ('11', 5, "Rayon Cosmique", "description...", '1', '1', 3);
INSERT INTO attaque VALUES ('12', 3, "Etourdissement ", "description...", '0', '1', 3);
INSERT INTO attaque VALUES ('13', 28, "Régénération Syntaxique", "description...", '3', '1', 3);
INSERT INTO attaque VALUES ('14', 14, "Vol Ancestral", "description...", '1', '0', 3);
INSERT INTO attaque VALUES ('15', 19, "Force D'excalibur", "description...", '2', '0', 3);

-- MALEFIQUE
INSERT INTO attaque VALUES ('16', 7, "Coup de Griffe", "description...", '1', '1', 4);
INSERT INTO attaque VALUES ('17', 20, "Ecrasement Maléfique", "description...", '3', '1', 4);
INSERT INTO attaque VALUES ('18', 8, "Morsure", "description...", '1', '1', 4);
INSERT INTO attaque VALUES ('19', 4, "Rayon Gamma", "description...", '0', '1', 4);
INSERT INTO attaque VALUES ('20', 24, "Marche des Ténèbres", "description...", '3', '0', 4);

-- WHATTHEFUCK
INSERT INTO attaque VALUES ('21', 15, "Ketchouppy", "description...", '1', '0', 5);
INSERT INTO attaque VALUES ('22', 10, "Inertie Négative", "description...", '3', '0', 5);
INSERT INTO attaque VALUES ('23', 6, "Mal de Ventre", "description...", '1', '0', 5);
INSERT INTO attaque VALUES ('24', 22, "Gelée gluante", "description...", '2', '0', 5);
INSERT INTO attaque VALUES ('25', 25, "Cocon poisseux", "description...", '1', '0', 5);

INSERT INTO sequence_id VALUES ('attaque', '25');
