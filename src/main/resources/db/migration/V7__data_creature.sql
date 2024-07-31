-- INSERT INTO carte VALUES (ID_CARTE, NOM, DESCRIPTION, IMAGE)
-- INSERT INTO creature VALUES (ID_CARTE, PV, ID_CATEGORIE, ID_NIVEAU, FK_CREATURE)

INSERT INTO carte VALUES ('6', 'Ptitloup', "Le bébé loup des forêts", '_dd52b226-b159-4fc0-8201-d1825a087e44.jfif');
INSERT INTO creature VALUES ('6', '75', 2, 1, null);
INSERT INTO creature_attaque VALUES (6, 6);

INSERT INTO carte VALUES ('7', 'Louloup', "Le petit loup des forêts", '_cce14fe1-27c0-4bca-9938-c245cd463e99.jfif');
INSERT INTO creature VALUES ('7', '125', 2, 2, 6);
INSERT INTO creature_attaque VALUES (7, 6);

INSERT INTO carte VALUES ('8', 'Grandloup', "Le grand loup des forêts", '_1d55f808-a1d7-4031-81cf-99c77cdbe0ef.jfif');
INSERT INTO creature VALUES ('8', '200', 1, 3, 7);
INSERT INTO creature_attaque VALUES (8, 6);

INSERT INTO carte VALUES ('9', 'Bébédoux', "Petit lapin né dans une salade", '_1f724c0e-f1a3-49d4-bf4e-b45b7036d577.jfif');
INSERT INTO creature VALUES ('9', '50', 2, 1, null);
INSERT INTO creature_attaque VALUES (9, 28);

INSERT INTO carte VALUES ('10', 'Salapin', "Un lapin qui plante de la gentillesse dans ses salades", '_0cc22204-3dc8-4d78-9056-bdfe3ef84f06.jfif');
INSERT INTO creature VALUES ('10', '100', 2, 2, 9);
INSERT INTO creature_attaque VALUES (10, 26);
INSERT INTO creature_attaque VALUES (10, 27);

INSERT INTO carte VALUES ('11', 'Lapinoufeu', "Quand il passe dans un endroit inconnu, il s'enflamme", '_87a4fd11-9fdf-4d9b-8a36-0fdbbf71715a.jfif');
INSERT INTO creature VALUES ('11', '150', 2, 3, 10);
INSERT INTO creature_attaque VALUES (11, 29);
INSERT INTO creature_attaque VALUES (11, 30);

INSERT INTO carte VALUES ('12', 'Arachniflouse', "Vit dans une caverne pour éviter la lumière du soleil", '_25ea251d-af1c-4de7-bccf-e87bee97dda0.jfif');
INSERT INTO creature VALUES ('12', '100', 4, 1, null);
INSERT INTO creature_attaque VALUES (12, 16);
INSERT INTO creature_attaque VALUES (12, 18);

INSERT INTO carte VALUES ('13', 'Arachnipède', "Il sort la nuit et n'a pas peur de combattre car il a la capacité de se régénérer", '_59fa8e86-49ec-46ab-8811-09895b94987a.jfif');
INSERT INTO creature VALUES ('13', '175', 4, 2, 12);
INSERT INTO creature_attaque VALUES (13, 35);
INSERT INTO creature_attaque VALUES (13, 17);

INSERT INTO carte VALUES ('14', 'Arachténèbre', "Créature mystique des ténèbres qui règne en maitre dans les souterrains sombre et obscure", '_9adfaec3-b42e-4ecd-b1d3-cd392d246c79.jfif');
INSERT INTO creature VALUES ('14', '280', 4, 3, 13);
INSERT INTO creature_attaque VALUES (14, 20);
INSERT INTO creature_attaque VALUES (14, 19);
INSERT INTO creature_attaque VALUES (14, 17);

INSERT INTO carte VALUES ('15', 'Plousillon', "A partir d'une certaine température l'oiseau se met à chanter et réchauffe les endroits glacés", '_17b6a80f-4412-463c-a475-6f39db649270.jfif');
INSERT INTO creature VALUES ('15', '60', 1, 1, null);
INSERT INTO creature_attaque VALUES (15, 3);
INSERT INTO creature_attaque VALUES (15, 31);

INSERT INTO carte VALUES ('16', 'Aïsglace', "Quand il est menacé, il tape du pied et jette de la glace", '_3337d215-3d48-4666-9f4c-a2bd4c504a46.jfif');
INSERT INTO creature VALUES ('16', '100', 1, 2, 15);
INSERT INTO creature_attaque VALUES (16, 5);
INSERT INTO creature_attaque VALUES (16, 32);

INSERT INTO carte VALUES ('17', 'Maïster Glace', "Il est reconnu comme le roi des oiseaux dans sa forêt", '_1dbdb2d6-b4de-4d19-b94a-d23b1244405e.jfif');
INSERT INTO creature VALUES ('17', '150', 1, 3, 16);
INSERT INTO creature_attaque VALUES (17, 33);
INSERT INTO creature_attaque VALUES (17, 34);

INSERT INTO carte VALUES ('18', 'Cléopique', "Un chat qui s'est perdu dans les ténèbres et qui a commencé à muter", '_228b4611-840c-4e5f-b6c0-4517a3b1b8ed.jfif');
INSERT INTO creature VALUES ('18', '60', 5, 1, null);
INSERT INTO creature_attaque VALUES (18, 36);
INSERT INTO creature_attaque VALUES (18, 37);

INSERT INTO carte VALUES ('19', 'Chapique', "Chat qui a terminé son processus de mutation des ténèbres", '_d5418885-cc24-4ac1-b007-bc1ee7bdc059.jfif');
INSERT INTO creature VALUES ('19', '105', 4, 2, 18);
INSERT INTO creature_attaque VALUES (19, 18);
INSERT INTO creature_attaque VALUES (19, 19);

INSERT INTO carte VALUES ('20', 'Matoupique', "Gardien des oeufs de la reine des enfers", '_0fb7237a-84db-4d07-8581-2f2dbb00df78.jfif');
INSERT INTO creature VALUES ('20', '190', 4, 3, 19);
INSERT INTO creature_attaque VALUES (20, 20);
INSERT INTO creature_attaque VALUES (20, 38);

INSERT INTO carte VALUES ('21', 'Dinaurodon', "Dinausaure qui est réapparu dans une zone inhabitable", '_01e14c1e-0766-4c08-a9b8-66d9f68f403d.jfif');
INSERT INTO creature VALUES ('21', '50', 4, 1, null);
INSERT INTO creature_attaque VALUES (21, 41);
INSERT INTO creature_attaque VALUES (21, 42);

INSERT INTO carte VALUES ('22', 'Sanglirodon', "Mutation de sanglier qui a mal tournée après avoir été mordu par un rat", '_1fd4cf3d-1401-4f1d-a483-a6595a21cd07.jfif');
INSERT INTO creature VALUES ('22', '75', 4, 2, 21);
INSERT INTO creature_attaque VALUES (22, 3);
INSERT INTO creature_attaque VALUES (22, 43);

INSERT INTO carte VALUES ('23', 'Spectrodon', "Il ne vit que la nuit et déteste la lumière", '_3d196378-34c5-477e-b776-9f4c556d895c.jfif');
INSERT INTO creature VALUES ('23', '150', 4, 3, 22);
INSERT INTO creature_attaque VALUES (23, 17);
INSERT INTO creature_attaque VALUES (23, 20);
INSERT INTO creature_attaque VALUES (23, 18);

INSERT INTO carte VALUES ('24', 'Grisouille', "Chaton sauvage de la ville", '_d2cd84a7-c1b6-4a22-8d64-59047db3f3cd.jfif');
INSERT INTO creature VALUES ('24', '50', 2, 1, null);
INSERT INTO creature_attaque VALUES (24, 7);
INSERT INTO creature_attaque VALUES (24, 9);

INSERT INTO carte VALUES ('25', 'Fripouille', "Chasseur expérimenté de la ville", '_a87d2479-bb1d-423f-ac62-9d40f4cd2e75.jfif');
INSERT INTO creature VALUES ('25', '90', 1, 2, 24);
INSERT INTO creature_attaque VALUES (25, 39);
INSERT INTO creature_attaque VALUES (25, 16);

INSERT INTO carte VALUES ('26', 'Chatouille', "Chat devenu fan des dinausaures après une visite à Jurassic Park", '_2d2ed76e-fcb7-4737-a45a-c9441f23e169.jfif');
INSERT INTO creature VALUES ('26', '160', 5, 3, 25);
INSERT INTO creature_attaque VALUES (26, 16);
INSERT INTO creature_attaque VALUES (26, 18);

INSERT INTO carte VALUES ('27', 'Tilichat', "Créature de rêve pour tout les chats, est ce la réalité?", '_4dcadf67-69b4-4fc8-9852-f3a594356e35.jfif');
INSERT INTO creature VALUES ('27', '180', 3, 3, 25);
INSERT INTO creature_attaque VALUES (27, 15);
INSERT INTO creature_attaque VALUES (27, 11);

INSERT INTO carte VALUES ('28', 'Gremlins', "Une petite saloperie qui a de l'avenir", '_3b7904c9-c5e9-4322-8c5d-5479f9a05d05.jfif');
INSERT INTO creature VALUES ('28', '30', 1, 1, null);
INSERT INTO creature_attaque VALUES (28, 10);
INSERT INTO creature_attaque VALUES (28, 2);

INSERT INTO carte VALUES ('29', 'Renaffu', "Renard qui n'est visible que lorsqu'il est déjà trop tard !!!", '_6f2f0f0c-9267-47f6-9c23-9d978420f50f.jfif');
INSERT INTO creature VALUES ('29', '75', 1, 2, 28);
INSERT INTO creature_attaque VALUES (29, 16);
INSERT INTO creature_attaque VALUES (29, 1);

INSERT INTO carte VALUES ('30', 'Louténaffu', "Renard revenu des ténèbres avec un look d'enfer", '_05c89615-2661-464a-ab89-85c2356cda46.jfif');
INSERT INTO creature VALUES ('30', '175', 4, 3, 29);
INSERT INTO creature_attaque VALUES (30, 19);
INSERT INTO creature_attaque VALUES (30, 18);

INSERT INTO carte VALUES ('31', 'Pompon', "Le pompon de Kira qui s'est échappé", '_b4fce7a7-13f9-491c-8a61-99cc37fd7139.jfif');
INSERT INTO creature VALUES ('31', '50', 2, 1, null);
INSERT INTO creature_attaque VALUES (31, 10);
INSERT INTO creature_attaque VALUES (31, 6);

INSERT INTO carte VALUES ('32', 'Pompignon', "Le pompon de Kira s'est entrainé et est pret pour le combat", '_789f0e64-6559-4081-8f73-f26760717e9f.jfif');
INSERT INTO creature VALUES ('32', '90', 5, 2, 31);
INSERT INTO creature_attaque VALUES (32, 16);
INSERT INTO creature_attaque VALUES (32, 40);

INSERT INTO carte VALUES ('33', 'Pompenfère', "Le pompon en mode démoniaque pret à tout déchirer", '_8b14f792-4924-4cb9-8550-a599f9c24626.jfif');
INSERT INTO creature VALUES ('33', '140', 4, 3, 32);
INSERT INTO creature_attaque VALUES (33, 16);
INSERT INTO creature_attaque VALUES (33, 18);

INSERT INTO carte VALUES ('34', 'Ponténèbre', "Le pompon en mode démoniaque... fuyez pauvres fous !!!", '_08b78ea0-062a-4fdf-bfe7-c7cc0c6ad3be.jfif');
INSERT INTO creature VALUES ('34', '150', 5, 3, 32);
INSERT INTO creature_attaque VALUES (34, 18);
INSERT INTO creature_attaque VALUES (34, 16);
INSERT INTO creature_attaque VALUES (34, 23);

INSERT INTO carte VALUES ('35', 'Patatoast', "La seule patate qui arrive à s'échapper de la cocotte minute", '_5a2dba44-ba03-4d05-8ead-99dd8df1d458.jfif');
INSERT INTO creature VALUES ('35', '50', 5, 1, null);
INSERT INTO creature_attaque VALUES (35, 21);

INSERT INTO carte VALUES ('36', 'Ananos', "Evolution quelque peut raté de la nature !!!", '_ffc84e3d-226e-437c-b707-98ca35a8400a.jfif');
INSERT INTO creature VALUES ('36', '50', 5, 2, 35);
INSERT INTO creature_attaque VALUES (36, 23);

INSERT INTO carte VALUES ('37', 'Chapattos', "Chat suffit de manger des patates toute la semaine", '_7b27203f-70e2-4554-9578-cfcf76afdb95.jfif');
INSERT INTO creature VALUES ('37', '50', 5, 3, 36);
INSERT INTO creature_attaque VALUES (37, 25);

INSERT INTO sequence_id VALUES ('carte', '37');