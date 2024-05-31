CREATE TABLE AUTHOR (
    id SERIAL PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    birthday DATE NOT NULL,
    country VARCHAR(255) NOT NULL,
    writing_hrs_per_day INT NOT NULL
);