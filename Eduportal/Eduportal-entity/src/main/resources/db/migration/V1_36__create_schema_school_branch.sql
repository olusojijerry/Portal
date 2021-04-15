CREATE TABLE school_branch(
    id int NOT NULL IDENTITY(1,1) PRIMARY KEY,
    name varchar(255),
    description varchar(255),
    address varchar(255),
    school_id int,
    phone_number varchar(20),
    director varchar(255),
    comment varchar(255)
)