package com.educationportal.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QSalary is a Querydsl query type for Salary
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSalary extends EntityPathBase<Salary> {

    private static final long serialVersionUID = 98860109L;

    public static final QSalary salary = new QSalary("salary");

    public final NumberPath<java.math.BigDecimal> amount = createNumber("amount", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> basic = createNumber("basic", java.math.BigDecimal.class);

    public final StringPath createdBy = createString("createdBy");

    public final DateTimePath<java.util.Date> createdDt = createDateTime("createdDt", java.util.Date.class);

    public final NumberPath<java.math.BigDecimal> dressing = createNumber("dressing", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> entertainment = createNumber("entertainment", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> furniture = createNumber("furniture", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> housing = createNumber("housing", java.math.BigDecimal.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<java.math.BigDecimal> leave = createNumber("leave", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> medicalAllowance = createNumber("medicalAllowance", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> netSalary = createNumber("netSalary", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> pension = createNumber("pension", java.math.BigDecimal.class);

    public final StringPath remarks = createString("remarks");

    public final StringPath salaryType = createString("salaryType");

    public final NumberPath<java.math.BigDecimal> specialDuty = createNumber("specialDuty", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> tax = createNumber("tax", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> thirteenthMonth = createNumber("thirteenthMonth", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> totalAnnualBenefit = createNumber("totalAnnualBenefit", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> transport = createNumber("transport", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> utility = createNumber("utility", java.math.BigDecimal.class);

    public QSalary(String variable) {
        super(Salary.class, forVariable(variable));
    }

    public QSalary(Path<? extends Salary> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSalary(PathMetadata metadata) {
        super(Salary.class, metadata);
    }

}

