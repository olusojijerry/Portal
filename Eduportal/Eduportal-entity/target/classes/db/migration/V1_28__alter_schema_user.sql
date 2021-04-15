DROP Table user_role;
DROP Table users;

CREATE TABLE users(
    id bigint NOT NULL IDENTITY(1,1) PRIMARY KEY,
    name varchar(255) not null,
    email varchar(50) not null,
    password varchar(255),
    enabled bit not null,
    token_expired bit not null,
    account_expired bit not null,
    account_locked bit not null,
    UNIQUE(name),
    UNIQUE(email)
);