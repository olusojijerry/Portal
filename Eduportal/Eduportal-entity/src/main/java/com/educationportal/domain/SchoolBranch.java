package com.educationportal.domain;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Table(name = "school_branch")
@Entity
@EntityListeners(AuditingEntityListener.class)
public class SchoolBranch {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    @Column(
            name = "id"
    )
    private long id;
    @Column(
            name = "name"
    )
    private String name;
    @Column(
            name = "description"
    )
    private String description;
    @Column(
            name = "address"
    )
    private String address;
    @Column(
            name = "school_id"
    )
    private Long schoolId;
    @Column(
            name = "phone_number"
    )
    private String phoneNumber;
    @Column(
            name = "director"
    )
    private String director;
    @Column(
            name = "comment"
    )
    private String comment;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Long schoolId) {
        this.schoolId = schoolId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "SchoolBranch{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", address='" + address + '\'' +
                ", schoolId=" + schoolId +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", director='" + director + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
