package com.educationportal.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUsers is a Querydsl query type for Users
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUsers extends EntityPathBase<Users> {

    private static final long serialVersionUID = 144113445L;

    public static final QUsers users = new QUsers("users");

    public final BooleanPath acctExpired = createBoolean("acctExpired");

    public final BooleanPath acctLocked = createBoolean("acctLocked");

    public final StringPath email = createString("email");

    public final BooleanPath enabled = createBoolean("enabled");

    public final NumberPath<java.math.BigInteger> id = createNumber("id", java.math.BigInteger.class);

    public final StringPath name = createString("name");

    public final StringPath password = createString("password");

    public final CollectionPath<Role, QRole> roles = this.<Role, QRole>createCollection("roles", Role.class, QRole.class, PathInits.DIRECT2);

    public final BooleanPath tokenExpired = createBoolean("tokenExpired");

    public QUsers(String variable) {
        super(Users.class, forVariable(variable));
    }

    public QUsers(Path<? extends Users> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUsers(PathMetadata metadata) {
        super(Users.class, metadata);
    }

}

