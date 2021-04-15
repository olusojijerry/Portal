package com.educationportal.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QStaticDataList is a Querydsl query type for StaticDataList
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QStaticDataList extends EntityPathBase<StaticDataList> {

    private static final long serialVersionUID = 642880377L;

    public static final QStaticDataList staticDataList = new QStaticDataList("staticDataList");

    public final StringPath code = createString("code");

    public final StringPath createdBy = createString("createdBy");

    public final DateTimePath<java.util.Date> createdDt = createDateTime("createdDt", java.util.Date.class);

    public final StringPath dataValue = createString("dataValue");

    public final StringPath description = createString("description");

    public final StringPath field1 = createString("field1");

    public final StringPath field2 = createString("field2");

    public final StringPath field3 = createString("field3");

    public final StringPath field4 = createString("field4");

    public final StringPath field5 = createString("field5");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath status = createString("status");

    public QStaticDataList(String variable) {
        super(StaticDataList.class, forVariable(variable));
    }

    public QStaticDataList(Path<? extends StaticDataList> path) {
        super(path.getType(), path.getMetadata());
    }

    public QStaticDataList(PathMetadata metadata) {
        super(StaticDataList.class, metadata);
    }

}

