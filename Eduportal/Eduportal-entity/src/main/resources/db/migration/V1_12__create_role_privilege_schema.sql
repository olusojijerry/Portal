CREATE TABLE role_privilege(
    id int NOT NULL IDENTITY(1,1) PRIMARY KEY,
    role_id int foreign key references roles(id),
    privilege_id int foreign key references privilege(id)
);