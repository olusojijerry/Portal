package com.educationportal.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QEmployee is a Querydsl query type for Employee
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEmployee extends EntityPathBase<Employee> {

    private static final long serialVersionUID = -224525199L;

    public static final QEmployee employee = new QEmployee("employee");

    public final StringPath attachment1Name = createString("attachment1Name");

    public final StringPath attachment2Name = createString("attachment2Name");

    public final StringPath attachment3Name = createString("attachment3Name");

    public final StringPath attachment4Name = createString("attachment4Name");

    public final StringPath attachment5Name = createString("attachment5Name");

    public final StringPath attachment6Name = createString("attachment6Name");

    public final StringPath attachment7Name = createString("attachment7Name");

    public final ArrayPath<byte[], Byte> attachments1 = createArray("attachments1", byte[].class);

    public final ArrayPath<byte[], Byte> attachments2 = createArray("attachments2", byte[].class);

    public final ArrayPath<byte[], Byte> attachments3 = createArray("attachments3", byte[].class);

    public final ArrayPath<byte[], Byte> attachments4 = createArray("attachments4", byte[].class);

    public final ArrayPath<byte[], Byte> attachments5 = createArray("attachments5", byte[].class);

    public final ArrayPath<byte[], Byte> attachments6 = createArray("attachments6", byte[].class);

    public final ArrayPath<byte[], Byte> attachments7 = createArray("attachments7", byte[].class);

    public final StringPath certObtained = createString("certObtained");

    public final StringPath certObtained2 = createString("certObtained2");

    public final StringPath certObtained3 = createString("certObtained3");

    public final StringPath certObtained4 = createString("certObtained4");

    public final StringPath createdBy = createString("createdBy");

    public final DateTimePath<java.util.Date> createdDt = createDateTime("createdDt", java.util.Date.class);

    public final DateTimePath<java.util.Date> dateOfBirth = createDateTime("dateOfBirth", java.util.Date.class);

    public final StringPath educationalQualification = createString("educationalQualification");

    public final StringPath emailAddress = createString("emailAddress");

    public final StringPath employeeId = createString("employeeId");

    public final StringPath firstName = createString("firstName");

    public final StringPath gender = createString("gender");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastActivityBy = createString("lastActivityBy");

    public final DateTimePath<java.util.Date> lastActivityDt = createDateTime("lastActivityDt", java.util.Date.class);

    public final StringPath lastName = createString("lastName");

    public final StringPath lastSchoolAttended = createString("lastSchoolAttended");

    public final StringPath maritalStatus = createString("maritalStatus");

    public final StringPath nationality = createString("nationality");

    public final StringPath nokAddrs = createString("nokAddrs");

    public final StringPath nokEmail = createString("nokEmail");

    public final StringPath nokFirstName = createString("nokFirstName");

    public final StringPath nokPhoneNo = createString("nokPhoneNo");

    public final StringPath nokSurname = createString("nokSurname");

    public final StringPath otherNames = createString("otherNames");

    public final StringPath permanentAddr = createString("permanentAddr");

    public final StringPath phoneNo = createString("phoneNo");

    public final StringPath remark = createString("remark");

    public final StringPath schoolAttended = createString("schoolAttended");

    public final StringPath schoolAttended2 = createString("schoolAttended2");

    public final StringPath schoolAttended3 = createString("schoolAttended3");

    public final StringPath schoolAttended4 = createString("schoolAttended4");

    public final StringPath title = createString("title");

    public QEmployee(String variable) {
        super(Employee.class, forVariable(variable));
    }

    public QEmployee(Path<? extends Employee> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEmployee(PathMetadata metadata) {
        super(Employee.class, metadata);
    }

}

