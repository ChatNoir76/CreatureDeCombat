-- INSERT INTO degat VALUES (ID, DEGAT, DPRECISION, DRATTAGE, TYPEDEGAT, CALCULDEGAT);

-- DEGAT FIXE ATTAQUE
INSERT INTO degat VALUES ('1', '10', '2', '0', 1, 1);
INSERT INTO degat VALUES ('2', '20', '4', '5', 1, 1);
INSERT INTO degat VALUES ('3', '30', '6', '5', 1, 1);
INSERT INTO degat VALUES ('4', '40', '8', '20', 1, 1);
INSERT INTO degat VALUES ('5', '50', '10', '20', 1, 1);
INSERT INTO degat VALUES ('6', '60', '10', '25', 1, 1);
INSERT INTO degat VALUES ('7', '70', '10', '25', 1, 1);
INSERT INTO degat VALUES ('8', '80', '10', '45', 1, 1);
INSERT INTO degat VALUES ('9', '90', '10', '50', 1, 1);
INSERT INTO degat VALUES ('10', '100', '10', '55', 1, 1);
INSERT INTO degat VALUES ('29', '90', '10', '15', 1, 1);

-- DEGAT RATIO ATTAQUE
INSERT INTO degat VALUES ('11', '10', '1', '0', 1, 2);
INSERT INTO degat VALUES ('12', '15', '2', '0', 1, 2);
INSERT INTO degat VALUES ('13', '20', '3', '0', 1, 2);
INSERT INTO degat VALUES ('14', '25', '4', '5', 1, 2);
INSERT INTO degat VALUES ('15', '30', '5', '5', 1, 2);
INSERT INTO degat VALUES ('16', '35', '5', '10', 1, 2);
INSERT INTO degat VALUES ('17', '40', '10', '10', 1, 2);
INSERT INTO degat VALUES ('18', '45', '10', '25', 1, 2);
INSERT INTO degat VALUES ('19', '50', '15', '25', 1, 2);
INSERT INTO degat VALUES ('20', '80', '15', '40', 1, 2);
INSERT INTO degat VALUES ('30', '65', '8', '15', 1, 2);
INSERT INTO degat VALUES ('31', '70', '50', '20', 1, 2);
INSERT INTO degat VALUES ('32', '45', '20', '40', 1, 2);

-- DEGAT FIXE DEFENSE
INSERT INTO degat VALUES ('21', '10', '0', '0', 2, 1);
INSERT INTO degat VALUES ('22', '30', '0', '0', 2, 1);
INSERT INTO degat VALUES ('23', '50', '0', '0', 2, 1);
INSERT INTO degat VALUES ('24', '75', '0', '0', 2, 1);

-- DEGAT RATIO DEFENSE
INSERT INTO degat VALUES ('25', '30', '0', '0', 2, 2);
INSERT INTO degat VALUES ('26', '40', '0', '0', 2, 2);
INSERT INTO degat VALUES ('27', '60', '0', '0', 2, 2);
INSERT INTO degat VALUES ('28', '100', '0', '0', 2, 2);

INSERT INTO sequence_id VALUES ('degat', '28');