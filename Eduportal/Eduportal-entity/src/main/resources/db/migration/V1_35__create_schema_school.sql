CREATE TABLE schools(
    id int NOT NULL IDENTITY(1,1) PRIMARY KEY,
    created_dt date,
    created_by varchar(255),
    last_activity_by varchar(255),
    last_activity_dt date,
    school_name varchar(255),
    address varchar(255),
    director varchar(255),
    website varchar(200),
    facebook varchar(200),
    twitter varchar(255),
    email varchar(90),
    comment varchar(255)
)