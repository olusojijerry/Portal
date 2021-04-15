package com.educationportal.domain;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;
import java.util.Date;

@Table(name = "teacher")
@Entity
@RestResource
@EntityListeners(AuditingEntityListener.class)
public class Teacher {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    @Column(
            name = "id"
    )
    private long id;
    @OneToOne(
            fetch = FetchType.LAZY
    )
    @JoinColumn(
            name = "salary_id",
            referencedColumnName = "ID"
    )
    private Salary salaryId;
    @Column(
            name = "name"
    )
    private String name;
    @Column(
            name = "date_of_birth"
    )
    private Date dateOfBirth;
    @Column(
            name = "resumption_dt"
    )
    private Date resumptionDt;
    @Column(
            name = "marital_status"
    )
    private String maritalStatus;
    @Column(
            name = "title"
    )
    private String title;
    @Column(
            name = "phone"
    )
    private String phone;
    @Column(
            name = "phone_nok"
    )
    private String phoneNok;
    @Column(
            name = "address"
    )
    private String address;
    @Column(
            name = "address_nok"
    )
    private String addressNok;
    @Column(
            name = "created_by"
    )
    private String created_by;
    @Column(
            name = "created_dt"
    )
    private Date created_dt;
    @Column(
            name = "last_activity_by"
    )
    private String lastActivityBy;
    @Column(
            name = "last_activity_dt"
    )
    private Date lastActivityDt;
    @Column(
            name="sex"
    )
    private String gender;
    @Column(
            name = "first_name"
    )
    private String firstName;
    @Column(
            name = "surname"
    )
    private String surname;
    @Column(
            name = "next_of_kin"
    )
    private String nextOfKin;
    @Column(
            name = "employee_id"
    )
    private String employeeId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Salary getSalaryId() {
        return salaryId;
    }

    public void setSalaryId(Salary salaryId) {
        this.salaryId = salaryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getResumptionDt() {
        return resumptionDt;
    }

    public void setResumptionDt(Date resumptionDt) {
        this.resumptionDt = resumptionDt;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhoneNok() {
        return phoneNok;
    }

    public void setPhoneNok(String phoneNok) {
        this.phoneNok = phoneNok;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddressNok() {
        return addressNok;
    }

    public void setAddressNok(String addressNok) {
        this.addressNok = addressNok;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    public Date getCreated_dt() {
        return created_dt;
    }

    public void setCreated_dt(Date created_dt) {
        this.created_dt = created_dt;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNextOfKin() {
        return nextOfKin;
    }

    public void setNextOfKin(String nextOfKin) {
        this.nextOfKin = nextOfKin;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", salaryId=" + salaryId +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", resumptionDt=" + resumptionDt +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", title='" + title + '\'' +
                ", phone='" + phone + '\'' +
                ", phoneNok='" + phoneNok + '\'' +
                ", address='" + address + '\'' +
                ", addressNok='" + addressNok + '\'' +
                ", created_by='" + created_by + '\'' +
                ", created_dt=" + created_dt +
                ", lastActivityBy='" + lastActivityBy + '\'' +
                ", lastActivityDt=" + lastActivityDt +
                ", gender='" + gender + '\'' +
                ", firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", nextOfKin='" + nextOfKin + '\'' +
                ", employeeId='" + employeeId + '\'' +
                '}';
    }
}
