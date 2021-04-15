package com.educationportal.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QSchoolBranch is a Querydsl query type for SchoolBranch
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSchoolBranch extends EntityPathBase<SchoolBranch> {

    private static final long serialVersionUID = 2096663161L;

    public static final QSchoolBranch schoolBranch = new QSchoolBranch("schoolBranch");

    public final StringPath address = createString("address");

    public final StringPath comment = createString("comment");

    public final StringPath description = createString("description");

    public final StringPath director = createString("director");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final StringPath phoneNumber = createString("phoneNumber");

    public final NumberPath<Long> schoolId = createNumber("schoolId", Long.class);

    public QSchoolBranch(String variable) {
        super(SchoolBranch.class, forVariable(variable));
    }

    public QSchoolBranch(Path<? extends SchoolBranch> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSchoolBranch(PathMetadata metadata) {
        super(SchoolBranch.class, metadata);
    }

}

