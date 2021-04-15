CREATE TABLE employee_attachment(
    id int NOT NULL IDENTITY(1,1) PRIMARY KEY,
    employee_id varchar(50),
    doc_type varchar(255),
    description varchar(255),
    mime_type varchar(50),
    doc_file varbinary(max),
    created_dt date,
    created_by varchar(255),
    last_activity_dt date,
    last_activity_by varchar(255)
);