package com.educationportal.domain;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Date;

@Table(name = "employee_attachment")
@Entity
@EntityListeners(AuditingEntityListener.class)
public class EmployeeAttachment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(
            name = "id"
    )
    private Long id;
    @Column(
            name = "employee_id"
    )
    private String employeeId;
    @Column(
            name = "doc_type"
    )
    private String docType;
    @Column(
            name = "description"
    )
    private String description;
    @Column(
            name = "mime_type"
    )
    private String mimeType;
    @Column(
            name = "doc_file"
    )
    private byte[] docFile;
    @Column(
            name = "created_dt"
    )
    private Date createdDt;
    @Column(
            name = "created_by"
    )
    private Long createdBy;
    @Column(
            name = "last_activity_dt"
    )
    private Date lastActivityDt;
    @Column(
            name = "last_activity_by"
    )
    private String lastActivityBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public byte[] getDocFile() {
        return docFile;
    }

    public void setDocFile(byte[] docFile) {
        this.docFile = docFile;
    }

    public Date getCreatedDt() {
        return createdDt;
    }

    public void setCreatedDt(Date createdDt) {
        this.createdDt = createdDt;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Date getLastActivityDt() {
        return lastActivityDt;
    }

    public void setLastActivityDt(Date lastActivityDt) {
        this.lastActivityDt = lastActivityDt;
    }

    public String getLastActivityBy() {
        return lastActivityBy;
    }

    public void setLastActivityBy(String lastActivityBy) {
        this.lastActivityBy = lastActivityBy;
    }

    @Override
    public String toString() {
        return "EmployeeAttachment{" +
                "id=" + id +
                ", employeeId='" + employeeId + '\'' +
                ", docType='" + docType + '\'' +
                ", description='" + description + '\'' +
                ", mimeType='" + mimeType + '\'' +
                ", docFile=" + Arrays.toString(docFile) +
                ", createdDt=" + createdDt +
                ", createdBy=" + createdBy +
                ", lastActivityDt=" + lastActivityDt +
                ", lastActivityBy='" + lastActivityBy + '\'' +
                '}';
    }
}
