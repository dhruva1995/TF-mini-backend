DROP TABLE people IF EXISTS;

CREATE TABLE people  (
    person_id BIGINT PRIMARY KEY,
    first_name VARCHAR(20),
    last_name VARCHAR(20)
);