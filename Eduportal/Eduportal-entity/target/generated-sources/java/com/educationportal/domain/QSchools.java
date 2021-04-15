package com.educationportal.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QSchools is a Querydsl query type for Schools
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSchools extends EntityPathBase<Schools> {

    private static final long serialVersionUID = -1176325796L;

    public static final QSchools schools = new QSchools("schools");

    public final StringPath address = createString("address");

    public final StringPath comment = createString("comment");

    public final StringPath createdBy = createString("createdBy");

    public final DateTimePath<java.util.Date> createdDt = createDateTime("createdDt", java.util.Date.class);

    public final StringPath director = createString("director");

    public final StringPath email = createString("email");

    public final StringPath facebook = createString("facebook");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastActivityBy = createString("lastActivityBy");

    public final DateTimePath<java.util.Date> lastActivityDt = createDateTime("lastActivityDt", java.util.Date.class);

    public final StringPath schoolName = createString("schoolName");

    public final StringPath twitter = createString("twitter");

    public final StringPath website = createString("website");

    public QSchools(String variable) {
        super(Schools.class, forVariable(variable));
    }

    public QSchools(Path<? extends Schools> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSchools(PathMetadata metadata) {
        super(Schools.class, metadata);
    }

}

