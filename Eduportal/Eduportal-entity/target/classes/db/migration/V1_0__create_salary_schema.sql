CREATE TABLE salary(
    id int NOT NULL IDENTITY(1,1) PRIMARY KEY,
    salary_type varchar(50),
    amount decimal,
    created_dt date,
    created_by varchar(50),
    remarks varchar(220),
    basic decimal,
    housing decimal,
    transport decimal,
    special_duty decimal,
    utility decimal,
    net_salary decimal,
    furniture decimal,
    dressing decimal,
    leave decimal,
    entertainment decimal,
    thirteenth_month decimal,
    pension decimal,
    medical_allowance decimal,
    total_annual_benefit decimal,
    tax decimal
    );

