package com.educationportal.domain;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;
import java.util.Date;

@Table(name = "static_data_list")
@Entity
@RestResource
@EntityListeners(AuditingEntityListener.class)
public class StaticDataList {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    @Column(
            name = "id"
    )
    private long id;
    @Column(
            name = "code"
    )
    private String code;
    @Column(
            name = "data_value"
    )
    private String dataValue;
    @Column(
            name = "description"
    )
    private String description;
    @Column(
            name = "created_by"
    )
    private String createdBy;
    @Column(
            name = "created_dt"
    )
    private Date createdDt;
    @Column(
            name = "status"
    )
    private String status;
    @Column(
            name = "field1"
    )
    private String field1;
    @Column(
            name = "field2"
    )
    private String field2;
    @Column(
            name = "field3"
    )
    private String field3;
    @Column(
            name = "field4"
    )
    private String field4;
    @Column(
            name = "field5"
    )
    private String field5;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }


    public void setCode(String code) {
        this.code = code;
    }

    public String getDataValue() {
        return dataValue;
    }

    public void setDataValue(String dataValue) {
        this.dataValue = dataValue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDt() {
        return createdDt;
    }

    public void setCreatedDt(Date createdDt) {
        this.createdDt = createdDt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public String getField3() {
        return field3;
    }

    public void setField3(String field3) {
        this.field3 = field3;
    }

    public String getField4() {
        return field4;
    }

    public void setField4(String field4) {
        this.field4 = field4;
    }

    public String getField5() {
        return field5;
    }

    public void setField5(String field5) {
        this.field5 = field5;
    }
}
