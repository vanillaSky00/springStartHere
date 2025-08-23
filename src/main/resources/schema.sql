-- CREATE TABLE IF NOT EXISTS purchase (
--     id INT AUTO_INCREMENT PRIMARY KEY,
--     product varchar(50) NOT NULL,
--     price double NOT NULL
-- ); outdated and is for sql


DROP TABLE IF EXISTS purchase;
CREATE TABLE IF NOT EXISTS purchase (
    id INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    product VARCHAR(50) NOT NULL,
    price DOUBLE NOT NULL
);


