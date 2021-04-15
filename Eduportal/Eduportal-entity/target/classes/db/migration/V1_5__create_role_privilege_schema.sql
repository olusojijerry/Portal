CREATE TABLE role_privilege(
    id int NOT NULL IDENTITY(1,1) PRIMARY KEY,
    role_id int,
    privilege_id int
)