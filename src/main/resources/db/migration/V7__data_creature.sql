-- INSERT INTO carte VALUES (ID_CARTE, NOM, DESCRIPTION, IMAGE)
-- INSERT INTO creature VALUES (ID_CARTE, PV, ID_CATEGORIE, ID_NIVEAU, FK_CREATURE)

INSERT INTO carte VALUES ('6', 'Ptitloup', "Le bébé loup des forêts", '_dd52b226-b159-4fc0-8201-d1825a087e44.jfif');
INSERT INTO creature VALUES ('6', '50', 2, 1, null);
INSERT INTO creature_attaque VALUES (6, 6);

INSERT INTO carte VALUES ('7', 'Louloup', "Le petit loup des forêts", '_cce14fe1-27c0-4bca-9938-c245cd463e99.jfif');
INSERT INTO creature VALUES ('7', '50', 2, 2, 6);
INSERT INTO creature_attaque VALUES (7, 6);

INSERT INTO carte VALUES ('8', 'Grandloup', "Le grand loup des forêts", '_1d55f808-a1d7-4031-81cf-99c77cdbe0ef.jfif');
INSERT INTO creature VALUES ('8', '50', 1, 3, 7);
INSERT INTO creature_attaque VALUES (8, 6);

INSERT INTO carte VALUES ('9', 'Bébédoux', "description", '_1f724c0e-f1a3-49d4-bf4e-b45b7036d577.jfif');
INSERT INTO creature VALUES ('9', '50', 2, 1, null);
INSERT INTO creature_attaque VALUES (9, 6);

INSERT INTO carte VALUES ('10', 'à trouver', "description", '_0cc22204-3dc8-4d78-9056-bdfe3ef84f06.jfif');
INSERT INTO creature VALUES ('10', '50', 2, 2, 9);
INSERT INTO creature_attaque VALUES (10, 6);

INSERT INTO carte VALUES ('11', 'à trouver', "description", '_87a4fd11-9fdf-4d9b-8a36-0fdbbf71715a.jfif');
INSERT INTO creature VALUES ('11', '50', 2, 3, 10);
INSERT INTO creature_attaque VALUES (11, 6);

INSERT INTO carte VALUES ('12', 'à trouver', "description", '_25ea251d-af1c-4de7-bccf-e87bee97dda0.jfif');
INSERT INTO creature VALUES ('12', '50', 4, 1, null);
INSERT INTO creature_attaque VALUES (12, 6);

INSERT INTO carte VALUES ('13', 'à trouver', "description", '_59fa8e86-49ec-46ab-8811-09895b94987a.jfif');
INSERT INTO creature VALUES ('13', '50', 4, 2, 12);
INSERT INTO creature_attaque VALUES (13, 6);

INSERT INTO carte VALUES ('14', 'à trouver', "description", '_9adfaec3-b42e-4ecd-b1d3-cd392d246c79.jfif');
INSERT INTO creature VALUES ('14', '50', 4, 3, 13);
INSERT INTO creature_attaque VALUES (14, 6);

INSERT INTO carte VALUES ('15', 'à trouver', "description", '_17b6a80f-4412-463c-a475-6f39db649270.jfif');
INSERT INTO creature VALUES ('15', '50', 1, 1, null);
INSERT INTO creature_attaque VALUES (15, 6);

INSERT INTO carte VALUES ('16', 'à trouver', "description", '_3337d215-3d48-4666-9f4c-a2bd4c504a46.jfif');
INSERT INTO creature VALUES ('16', '50', 1, 2, 15);
INSERT INTO creature_attaque VALUES (16, 6);

INSERT INTO carte VALUES ('17', 'à trouver', "description", '_1dbdb2d6-b4de-4d19-b94a-d23b1244405e.jfif');
INSERT INTO creature VALUES ('17', '50', 1, 3, 16);
INSERT INTO creature_attaque VALUES (17, 6);

INSERT INTO carte VALUES ('18', 'à trouver', "description", '_228b4611-840c-4e5f-b6c0-4517a3b1b8ed.jfif');
INSERT INTO creature VALUES ('18', '50', 5, 1, null);
INSERT INTO creature_attaque VALUES (18, 6);

INSERT INTO carte VALUES ('19', 'à trouver', "description", '_d5418885-cc24-4ac1-b007-bc1ee7bdc059.jfif');
INSERT INTO creature VALUES ('19', '50', 5, 2, 18);
INSERT INTO creature_attaque VALUES (19, 6);

INSERT INTO carte VALUES ('20', 'à trouver', "description", '_0fb7237a-84db-4d07-8581-2f2dbb00df78.jfif');
INSERT INTO creature VALUES ('20', '50', 5, 3, 19);
INSERT INTO creature_attaque VALUES (20, 6);

INSERT INTO carte VALUES ('21', 'à trouver', "description", '_01e14c1e-0766-4c08-a9b8-66d9f68f403d.jfif');
INSERT INTO creature VALUES ('21', '50', 4, 1, null);
INSERT INTO creature_attaque VALUES (21, 6);

INSERT INTO carte VALUES ('22', 'à trouver', "description", '_1fd4cf3d-1401-4f1d-a483-a6595a21cd07.jfif');
INSERT INTO creature VALUES ('22', '50', 4, 2, 21);
INSERT INTO creature_attaque VALUES (22, 6);

INSERT INTO carte VALUES ('23', 'à trouver', "description", '_3d196378-34c5-477e-b776-9f4c556d895c.jfif');
INSERT INTO creature VALUES ('23', '50', 4, 3, 22);
INSERT INTO creature_attaque VALUES (23, 6);

INSERT INTO carte VALUES ('24', 'à trouver', "description", '_d2cd84a7-c1b6-4a22-8d64-59047db3f3cd.jfif');
INSERT INTO creature VALUES ('24', '50', 1, 1, null);
INSERT INTO creature_attaque VALUES (24, 6);

INSERT INTO carte VALUES ('25', 'à trouver', "description", '_a87d2479-bb1d-423f-ac62-9d40f4cd2e75.jfif');
INSERT INTO creature VALUES ('25', '50', 1, 2, 24);
INSERT INTO creature_attaque VALUES (25, 6);

INSERT INTO carte VALUES ('26', 'à trouver', "description", '_2d2ed76e-fcb7-4737-a45a-c9441f23e169.jfif');
INSERT INTO creature VALUES ('26', '50', 5, 3, 25);
INSERT INTO creature_attaque VALUES (26, 6);

INSERT INTO carte VALUES ('27', 'à trouver', "description", '_4dcadf67-69b4-4fc8-9852-f3a594356e35.jfif');
INSERT INTO creature VALUES ('27', '50', 3, 3, 25);
INSERT INTO creature_attaque VALUES (27, 6);

INSERT INTO carte VALUES ('28', 'à trouver', "description", '_3b7904c9-c5e9-4322-8c5d-5479f9a05d05.jfif');
INSERT INTO creature VALUES ('28', '50', 1, 1, null);
INSERT INTO creature_attaque VALUES (28, 6);

INSERT INTO carte VALUES ('29', 'à trouver', "description", '_6f2f0f0c-9267-47f6-9c23-9d978420f50f.jfif');
INSERT INTO creature VALUES ('29', '50', 1, 2, 28);
INSERT INTO creature_attaque VALUES (29, 6);

INSERT INTO carte VALUES ('30', 'à trouver', "description", '_05c89615-2661-464a-ab89-85c2356cda46.jfif');
INSERT INTO creature VALUES ('30', '50', 4, 3, 29);
INSERT INTO creature_attaque VALUES (30, 6);

INSERT INTO carte VALUES ('31', 'à trouver', "description", '_b4fce7a7-13f9-491c-8a61-99cc37fd7139.jfif');
INSERT INTO creature VALUES ('31', '50', 5, 1, null);
INSERT INTO creature_attaque VALUES (31, 6);

INSERT INTO carte VALUES ('32', 'à trouver', "description", '_789f0e64-6559-4081-8f73-f26760717e9f.jfif');
INSERT INTO creature VALUES ('32', '50', 1, 2, 31);
INSERT INTO creature_attaque VALUES (32, 6);

INSERT INTO carte VALUES ('33', 'à trouver', "description", '_8b14f792-4924-4cb9-8550-a599f9c24626.jfif');
INSERT INTO creature VALUES ('33', '50', 4, 2, 31);
INSERT INTO creature_attaque VALUES (33, 6);

INSERT INTO carte VALUES ('34', 'à trouver', "description", '_08b78ea0-062a-4fdf-bfe7-c7cc0c6ad3be.jfif');
INSERT INTO creature VALUES ('34', '50', 1, 3, 33);
INSERT INTO creature_attaque VALUES (34, 6);

INSERT INTO sequence_id VALUES ('carte', '34');