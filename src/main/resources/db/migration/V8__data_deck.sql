-- INSERT INTO deck VALUES (ID_DECK, NOM, DESCRIPTION)
-- INSERT INTO deck_carte VALUES (COUNT, ID_DECK, ID_CARTE)

INSERT INTO deck VALUES ('1', 'Deck de base', "Deck de test avec cartes Créature et Energie");
INSERT INTO deck_carte VALUES (20, 1, 6);
INSERT INTO deck_carte VALUES (10, 1, 7);
INSERT INTO deck_carte VALUES (5, 1, 8);
INSERT INTO deck_carte VALUES (25, 1, 2);

INSERT INTO sequence_id VALUES ('deck', '1');