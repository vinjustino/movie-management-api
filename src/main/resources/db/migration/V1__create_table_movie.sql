CREATE TABLE movie (
    id SERIAL PRIMARY KEY,
    title VARCHAR(100) NOT NULL, UNIQUE,
    description TEXT,
    release_date DATE NOT NULL,
    rating NUMERIC
);