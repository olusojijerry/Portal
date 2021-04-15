CREATE TABLE users(
    id bigint NOT NULL IDENTITY(1,1) PRIMARY KEY,
    name varchar(255),
    email varchar(50),
    password varchar(255),
    enabled bit,
    token_expired bit
);