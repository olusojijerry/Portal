package com.educationportal.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTeacher is a Querydsl query type for Teacher
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTeacher extends EntityPathBase<Teacher> {

    private static final long serialVersionUID = -238392897L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTeacher teacher = new QTeacher("teacher");

    public final StringPath address = createString("address");

    public final StringPath addressNok = createString("addressNok");

    public final StringPath created_by = createString("created_by");

    public final DateTimePath<java.util.Date> created_dt = createDateTime("created_dt", java.util.Date.class);

    public final DateTimePath<java.util.Date> dateOfBirth = createDateTime("dateOfBirth", java.util.Date.class);

    public final StringPath employeeId = createString("employeeId");

    public final StringPath firstName = createString("firstName");

    public final StringPath gender = createString("gender");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastActivityBy = createString("lastActivityBy");

    public final DateTimePath<java.util.Date> lastActivityDt = createDateTime("lastActivityDt", java.util.Date.class);

    public final StringPath maritalStatus = createString("maritalStatus");

    public final StringPath name = createString("name");

    public final StringPath nextOfKin = createString("nextOfKin");

    public final StringPath phone = createString("phone");

    public final StringPath phoneNok = createString("phoneNok");

    public final DateTimePath<java.util.Date> resumptionDt = createDateTime("resumptionDt", java.util.Date.class);

    public final QSalary salaryId;

    public final StringPath surname = createString("surname");

    public final StringPath title = createString("title");

    public QTeacher(String variable) {
        this(Teacher.class, forVariable(variable), INITS);
    }

    public QTeacher(Path<? extends Teacher> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QTeacher(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QTeacher(PathMetadata metadata, PathInits inits) {
        this(Teacher.class, metadata, inits);
    }

    public QTeacher(Class<? extends Teacher> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.salaryId = inits.isInitialized("salaryId") ? new QSalary(forProperty("salaryId")) : null;
    }

}

