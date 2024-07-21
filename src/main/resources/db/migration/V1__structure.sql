-- ENUMERATION
CREATE TABLE calculdegat (
    id VARCHAR(10),
    PRIMARY KEY(id),
    nom VARCHAR(50) NOT NULL
) ENGINE=INNODB;

CREATE TABLE typedegat (
    id VARCHAR(10),
    PRIMARY KEY(id),
    nom VARCHAR(50) NOT NULL
) ENGINE=INNODB;

CREATE TABLE categorie (
    id VARCHAR(10),
    PRIMARY KEY(id),
    nom VARCHAR(50) NOT NULL
) ENGINE=INNODB;

CREATE TABLE niveau (
    id VARCHAR(10),
    PRIMARY KEY(id),
    nom VARCHAR(50) NOT NULL
) ENGINE=INNODB;

-- TABLE
CREATE TABLE deck (
    id VARCHAR(10),
    PRIMARY KEY(id),
    nom VARCHAR(50) NOT NULL,
    description VARCHAR(50) NOT NULL
) ENGINE=INNODB;

CREATE TABLE carte (
    id VARCHAR(10),
    PRIMARY KEY(id),
    nom VARCHAR(50) NOT NULL,
    description VARCHAR(50) NOT NULL,
    image VARCHAR(50) NOT NULL
) ENGINE=INNODB;

CREATE TABLE dresseur (
    id VARCHAR(10),
    PRIMARY KEY(id),
    CONSTRAINT FK_Carte_dresseur FOREIGN KEY (id) REFERENCES carte(id)
) ENGINE=INNODB;

CREATE TABLE energie (
    id VARCHAR(10),
    PRIMARY KEY(id),
	CONSTRAINT FK_Carte_energie FOREIGN KEY (id) REFERENCES carte(id),
    fk_categorie VARCHAR(10) NOT NULL,
    INDEX fk_categorie_ind (fk_categorie), 
    FOREIGN KEY (fk_categorie) REFERENCES categorie(id)
) ENGINE=INNODB;

CREATE TABLE creature (
    id VARCHAR(10),
    PRIMARY KEY(id),
    CONSTRAINT FK_Carte_creature FOREIGN KEY (id) REFERENCES carte(id),
    pv INT NOT NULL,
    fk_categorie VARCHAR(10) NOT NULL,
    INDEX fk_categorie_ind (fk_categorie), 
    FOREIGN KEY (fk_categorie) REFERENCES categorie(id),
    fk_niveau VARCHAR(10) NOT NULL,
    INDEX fk_niveau_ind (fk_niveau), 
    FOREIGN KEY (fk_niveau) REFERENCES niveau(id),
    fk_creature VARCHAR(10),
    INDEX fk_creature_ind (fk_creature), 
    FOREIGN KEY (fk_creature) REFERENCES creature(id)
) ENGINE=INNODB;

CREATE TABLE degat (
    id VARCHAR(10),
    PRIMARY KEY(id),
    degat INT NOT NULL,
    dprecision INT NOT NULL,
    drattage INT NOT NULL,
    fk_typedegat VARCHAR(10) NOT NULL,
    INDEX fk_typedegat_ind (fk_typedegat), 
    FOREIGN KEY (fk_typedegat) REFERENCES typedegat(id),
    fk_calculdegat VARCHAR(10) NOT NULL,
    INDEX fk_calculdegat_ind (fk_calculdegat), 
    FOREIGN KEY (fk_calculdegat) REFERENCES calculdegat(id)
) ENGINE=INNODB;

CREATE TABLE attaque (
    id VARCHAR(10),
    PRIMARY KEY(id),
    fk_degat VARCHAR(10) NOT NULL, 
    INDEX fk_degat_ind (fk_degat), 
    FOREIGN KEY (fk_degat) REFERENCES degat(id),
    nom VARCHAR(50) NOT NULL,
    description VARCHAR(50) NOT NULL,
    e_primaire INT NOT NULL,
    e_secondaire INT NOT NULL,
    fk_categorie VARCHAR(10) NOT NULL,
    INDEX fk_categorie_ind (fk_categorie), 
    FOREIGN KEY (fk_categorie) REFERENCES categorie(id)
) ENGINE=INNODB;

-- RELATION n / n
CREATE TABLE deck_carte (
    fk_deck VARCHAR(10) NOT NULL,
    fk_carte VARCHAR(10) NOT NULL,
    PRIMARY KEY(fk_deck, fk_carte),
    FOREIGN KEY (fk_deck) REFERENCES deck(id),
    FOREIGN KEY (fk_carte) REFERENCES carte(id)
) ENGINE=INNODB;

CREATE TABLE creature_attaque (
    fk_creature VARCHAR(10) NOT NULL,
    fk_attaque VARCHAR(10) NOT NULL, 
    PRIMARY KEY(fk_creature, fk_attaque), 
    FOREIGN KEY (fk_creature) REFERENCES creature(id),
    FOREIGN KEY (fk_attaque) REFERENCES attaque(id)
) ENGINE=INNODB;

-- SEQUENCE
CREATE TABLE sequence_id (
    table_name VARCHAR(30),
    PRIMARY KEY(table_name),
    max_id INT
) ENGINE=INNODB;


