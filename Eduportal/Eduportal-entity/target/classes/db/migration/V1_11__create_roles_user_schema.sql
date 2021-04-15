CREATE TABLE user_role(
    id int NOT NULL IDENTITY(1,1) PRIMARY KEY,
    user_id bigint foreign key references users(id),
    role_id int foreign key references roles(id)
);
