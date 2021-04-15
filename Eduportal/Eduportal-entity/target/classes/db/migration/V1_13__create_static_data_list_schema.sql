CREATE TABLE static_data_list(
    id int NOT NULL IDENTITY(1,1) PRIMARY KEY,
    code varchar(20),
    data_value varchar(20),
    description varchar(50),
    created_by varchar(50),
    created_dt date,
    status varchar(20),
    field1 varchar(20),
    field2 varchar(20),
    field3 varchar(20),
    field4 varchar(20),
    field5 varchar(20)
);