CREATE TABLE creature (
    id VARCHAR(10),
    PRIMARY KEY(id),
    nom VARCHAR(50) NOT NULL,
    description VARCHAR(50) NOT NULL,
    image VARCHAR(50) NOT NULL,
    pv INT NOT NULL
) ENGINE=INNODB;

CREATE TABLE sequence_id (
    table_name VARCHAR(30),
    PRIMARY KEY(table_name),
    max_id INT
) ENGINE=INNODB;


