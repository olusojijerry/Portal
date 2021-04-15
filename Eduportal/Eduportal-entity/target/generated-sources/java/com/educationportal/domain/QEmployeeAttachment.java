package com.educationportal.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QEmployeeAttachment is a Querydsl query type for EmployeeAttachment
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEmployeeAttachment extends EntityPathBase<EmployeeAttachment> {

    private static final long serialVersionUID = 312811636L;

    public static final QEmployeeAttachment employeeAttachment = new QEmployeeAttachment("employeeAttachment");

    public final NumberPath<Long> createdBy = createNumber("createdBy", Long.class);

    public final DateTimePath<java.util.Date> createdDt = createDateTime("createdDt", java.util.Date.class);

    public final StringPath description = createString("description");

    public final ArrayPath<byte[], Byte> docFile = createArray("docFile", byte[].class);

    public final StringPath docType = createString("docType");

    public final StringPath employeeId = createString("employeeId");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastActivityBy = createString("lastActivityBy");

    public final DateTimePath<java.util.Date> lastActivityDt = createDateTime("lastActivityDt", java.util.Date.class);

    public final StringPath mimeType = createString("mimeType");

    public QEmployeeAttachment(String variable) {
        super(EmployeeAttachment.class, forVariable(variable));
    }

    public QEmployeeAttachment(Path<? extends EmployeeAttachment> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEmployeeAttachment(PathMetadata metadata) {
        super(EmployeeAttachment.class, metadata);
    }

}

