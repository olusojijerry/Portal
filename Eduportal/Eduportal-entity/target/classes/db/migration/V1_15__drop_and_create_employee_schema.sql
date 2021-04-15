drop table employee;

CREATE TABLE employee(
    id int NOT NULL IDENTITY(1,1) PRIMARY KEY,
    title varchar(10),
    first_name varchar(50) not null,
    last_name varchar(50) not null,
    name varchar(50),
    date_of_birth date not null,
    gender varchar(10),
    marital_status varchar(10) not null,
    nationality varchar(20),
    permanent_addr varchar(250),
    educational_qualification varchar(50) not null,
    last_school_attended varchar(50),
    school_attended varchar(50),
    cert_obtained varchar(50),
    school_attended2 varchar(50),
    cert_obtained2 varchar(50),
    school_attended3 varchar(50),
    cert_obtained3 varchar(50),
    school_attended4 varchar(50),
    cert_obtained4 varchar(50),
    email_address varchar(50),
    phone_no varchar(50),
    nok_surname varchar(50),
    nok_first_name varchar(50),
    nok_phone_no varchar(50),
    nok_addrs varchar(50),
    nok_email varchar(50),
    remark varchar(250),
    created_by varchar(50),
    created_dt date,
    last_activity_by varchar(50),
    last_activity_dt date,
    attachments_1 varbinary(max),
    attachment1_name varchar(50),
    attachments_2 varbinary(max),
    attachment2_name varchar(50),
    attachments_3 varbinary(max),
    attachment3_name varchar(50),
    attachments_4 varbinary(max),
    attachment4_name varchar(50),
    attachments_5 varbinary(max),
    attachment5_name varchar(50),
    attachments_6 varbinary(max),
    attachment6_name varchar(50),
    attachments_7 varbinary(max),
    attachment7_name varchar(50)
)