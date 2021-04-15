CREATE TABLE user_role(
    id int NOT NULL IDENTITY(1,1) PRIMARY KEY,
    user_id int,
    role_id int
);