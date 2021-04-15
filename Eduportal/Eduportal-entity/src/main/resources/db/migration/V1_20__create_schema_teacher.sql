CREATE TABLE teacher(
    id int NOT NULL IDENTITY(1,1) PRIMARY KEY,
    salary_id int,
    name varchar(225),
    date_of_birth date,
    resumption_dt date,
    marital_status varchar(20),
    sex varchar(20),
    title varchar(20),
    first_name varchar(50),
    surname varchar(50),
    next_of_kin varchar(50),
    phone varchar(20),
    phone_nok varchar(20),
    address varchar(250),
    address_nok varchar(250),
    created_by varchar(50),
    created_dt date,
    last_activity_by varchar(250),
    last_activity_dt date,
    employee_id varchar(50)
 )