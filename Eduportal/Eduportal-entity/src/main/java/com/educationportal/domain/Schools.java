package com.educationportal.domain;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Table(name = "schools")
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Schools {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    @Column(
            name = "id"
    )
    private long id;
    @Column(
            name = "created_dt"
    )
    private Date createdDt;
    @Column(
            name = "created_by"
    )
    private String createdBy;
    @Column(
            name = "last_activity_by"
    )
    private String lastActivityBy;
    @Column(
            name = "last_activity_dt"
    )
    private Date lastActivityDt;
    @Column(
            name = "school_name"
    )
    private String schoolName;
    @Column(
            name = "address"
    )
    private String address;
    @Column(
            name = "director"
    )
    private String director;
    @Column(
            name = "website"
    )
    private String website;
    @Column(
            name = "facebook"
    )
    private String facebook;
    @Column(
            name = "twitter"
    )
    private String twitter;
    @Column(
            name = "email"
    )
    private String email;
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

    public Date getCreatedDt() {
        return createdDt;
    }

    public void setCreatedDt(Date createdDt) {
        this.createdDt = createdDt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getLastActivityBy() {
        return lastActivityBy;
    }

    public void setLastActivityBy(String lastActivityBy) {
        this.lastActivityBy = lastActivityBy;
    }

    public Date getLastActivityDt() {
        return lastActivityDt;
    }

    public void setLastActivityDt(Date lastActivityDt) {
        this.lastActivityDt = lastActivityDt;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Schools{" +
                "id=" + id +
                ", createdDt=" + createdDt +
                ", createdBy='" + createdBy + '\'' +
                ", lastActivityBy='" + lastActivityBy + '\'' +
                ", lastActivityDt=" + lastActivityDt +
                ", schoolName='" + schoolName + '\'' +
                ", address='" + address + '\'' +
                ", director='" + director + '\'' +
                ", website='" + website + '\'' +
                ", facebook='" + facebook + '\'' +
                ", twitter='" + twitter + '\'' +
                ", email='" + email + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
