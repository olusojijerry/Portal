package com.educationportal.domain;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Date;

@Table(name = "employee")
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(
            name = "id"
    )
    private Long id;
    @Column(
            name = "title"
    )
    private String title;
    @Column(
            name = "first_name"
    )
    private String firstName;
    @Column(
            name = "last_name"
    )
    private String lastName;
    @Column(
            name = "name"
    )
    private String otherNames;
    @Column(
            name = "date_of_birth"
    )
    private Date dateOfBirth;
    @Column(
            name = "gender"
    )
    private String gender;
    @Column(
            name = "marital_status"
    )
    private String maritalStatus;
    @Column(
            name = "nationality"
    )
    private String nationality;
    @Column(
            name = "permanent_addr"
    )
    private String permanentAddr;
    @Column(
            name = "educational_qualification"
    )
    private String educationalQualification;
    @Column(
            name = "last_school_attended"
    )
    private String lastSchoolAttended;
    @Column(
            name = "school_attended"
    )
    private String schoolAttended;
    @Column(
            name = "cert_obtained"
    )
    private String certObtained;
    @Column(
            name = "school_attended2"
    )
    private String schoolAttended2;
    @Column(
            name = "cert_obtained2"
    )
    private String certObtained2;
    @Column(
            name = "school_attended3"
    )
    private String schoolAttended3;
    @Column(
            name = "cert_obtained3"
    )
    private String certObtained3;
    @Column(
            name = "school_attended4"
    )
    private String schoolAttended4;
    @Column(
            name = "cert_obtained4"
    )
    private String certObtained4;
    @Column(
            name = "email_address"
    )
    private String emailAddress;
    @Column(
            name = "phone_no"
    )
    private String phoneNo;
    @Column(
            name = "nok_surname"
    )
    private String nokSurname;
    @Column(
            name = "nok_first_name"
    )
    private String nokFirstName;
    @Column(
            name = "nok_phone_no"
    )
    private String nokPhoneNo;
    @Column(
            name = "nok_addrs"
    )
    private String nokAddrs;
    @Column(
            name = "nok_email"
    )
    private String nokEmail;
    @Column(
            name = "remark"
    )
    private String remark;
    @Column(
            name = "created_by"
    )
    private String createdBy;
    @Column(
            name = "created_dt"
    )
    private Date createdDt;
    @Column(
            name = "last_activity_by"
    )
    private String lastActivityBy;
    @Column(
            name = "last_activity_dt"
    )
    private Date lastActivityDt;
    @Lob
    @Column(name = "attachments_1")
    private byte[] attachments1;
    @Column(name = "attachment1_name")
    private String attachment1Name;
    @Lob
    @Column(name = "attachments_2")
    private byte[] attachments2;
    @Column(name = "attachment2_name")
    private String attachment2Name;
    @Lob
    @Column(name = "attachments_3")
    private byte[] attachments3;
    @Column(name = "attachment3_name")
    private String attachment3Name;
    @Lob
    @Column(name = "attachments_4")
    private byte[] attachments4;
    @Column(name = "attachment4_name")
    private String attachment4Name;
    @Lob
    @Column(name = "attachments_5")
    private byte[] attachments5;
    @Column(name = "attachment5_name")
    private String attachment5Name;
    @Lob
    @Column(name = "attachments_6")
    private byte[] attachments6;
    @Column(name = "attachment6_name")
    private String attachment6Name;
    @Lob
    @Column(name = "attachments_7")
    private byte[] attachments7;
    @Column(name = "attachment7_name")
    private String attachment7Name;
    @Column(name = "employee_id")
    private String employeeId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOtherNames() {
        return otherNames;
    }

    public void setOtherNames(String otherNames) {
        this.otherNames = otherNames;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPermanentAddr() {
        return permanentAddr;
    }

    public void setPermanentAddr(String permanentAddr) {
        this.permanentAddr = permanentAddr;
    }

    public String getEducationalQualification() {
        return educationalQualification;
    }

    public void setEducationalQualification(String educationalQualification) {
        this.educationalQualification = educationalQualification;
    }

    public String getLastSchoolAttended() {
        return lastSchoolAttended;
    }

    public void setLastSchoolAttended(String lastSchoolAttended) {
        this.lastSchoolAttended = lastSchoolAttended;
    }

    public String getSchoolAttended() {
        return schoolAttended;
    }

    public void setSchoolAttended(String schoolAttended) {
        this.schoolAttended = schoolAttended;
    }

    public String getCertObtained() {
        return certObtained;
    }

    public void setCertObtained(String certObtained) {
        this.certObtained = certObtained;
    }

    public String getSchoolAttended2() {
        return schoolAttended2;
    }

    public void setSchoolAttended2(String schoolAttended2) {
        this.schoolAttended2 = schoolAttended2;
    }

    public String getCertObtained2() {
        return certObtained2;
    }

    public void setCertObtained2(String certObtained2) {
        this.certObtained2 = certObtained2;
    }

    public String getSchoolAttended3() {
        return schoolAttended3;
    }

    public void setSchoolAttended3(String schoolAttended3) {
        this.schoolAttended3 = schoolAttended3;
    }

    public String getCertObtained3() {
        return certObtained3;
    }

    public void setCertObtained3(String certObtained3) {
        this.certObtained3 = certObtained3;
    }

    public String getSchoolAttended4() {
        return schoolAttended4;
    }

    public void setSchoolAttended4(String schoolAttended4) {
        this.schoolAttended4 = schoolAttended4;
    }

    public String getCertObtained4() {
        return certObtained4;
    }

    public void setCertObtained4(String certObtained4) {
        this.certObtained4 = certObtained4;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getNokSurname() {
        return nokSurname;
    }

    public void setNokSurname(String nokSurname) {
        this.nokSurname = nokSurname;
    }

    public String getNokFirstName() {
        return nokFirstName;
    }

    public void setNokFirstName(String nokFirstName) {
        this.nokFirstName = nokFirstName;
    }

    public String getNokPhoneNo() {
        return nokPhoneNo;
    }

    public void setNokPhoneNo(String nokPhoneNo) {
        this.nokPhoneNo = nokPhoneNo;
    }

    public String getNokAddrs() {
        return nokAddrs;
    }

    public void setNokAddrs(String nokAddrs) {
        this.nokAddrs = nokAddrs;
    }

    public String getNokEmail() {
        return nokEmail;
    }

    public void setNokEmail(String nokEmail) {
        this.nokEmail = nokEmail;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public byte[] getAttachments1() {
        return attachments1;
    }

    public void setAttachments1(byte[] attachments1) {
        this.attachments1 = attachments1;
    }

    public String getAttachment1Name() {
        return attachment1Name;
    }

    public void setAttachment1Name(String attachment1Name) {
        this.attachment1Name = attachment1Name;
    }

    public byte[] getAttachments2() {
        return attachments2;
    }

    public void setAttachments2(byte[] attachments2) {
        this.attachments2 = attachments2;
    }

    public String getAttachment2Name() {
        return attachment2Name;
    }

    public void setAttachment2Name(String attachment2Name) {
        this.attachment2Name = attachment2Name;
    }

    public byte[] getAttachments3() {
        return attachments3;
    }

    public void setAttachments3(byte[] attachments3) {
        this.attachments3 = attachments3;
    }

    public String getAttachment3Name() {
        return attachment3Name;
    }

    public void setAttachment3Name(String attachment3Name) {
        this.attachment3Name = attachment3Name;
    }

    public byte[] getAttachments4() {
        return attachments4;
    }

    public void setAttachments4(byte[] attachments4) {
        this.attachments4 = attachments4;
    }

    public String getAttachment4Name() {
        return attachment4Name;
    }

    public void setAttachment4Name(String attachment4Name) {
        this.attachment4Name = attachment4Name;
    }

    public byte[] getAttachments5() {
        return attachments5;
    }

    public void setAttachments5(byte[] attachments5) {
        this.attachments5 = attachments5;
    }

    public String getAttachment5Name() {
        return attachment5Name;
    }

    public void setAttachment5Name(String attachment5Name) {
        this.attachment5Name = attachment5Name;
    }

    public byte[] getAttachments6() {
        return attachments6;
    }

    public void setAttachments6(byte[] attachments6) {
        this.attachments6 = attachments6;
    }

    public String getAttachment6Name() {
        return attachment6Name;
    }

    public void setAttachment6Name(String attachment6Name) {
        this.attachment6Name = attachment6Name;
    }

    public byte[] getAttachments7() {
        return attachments7;
    }

    public void setAttachments7(byte[] attachments7) {
        this.attachments7 = attachments7;
    }

    public String getAttachment7Name() {
        return attachment7Name;
    }

    public void setAttachment7Name(String attachment7Name) {
        this.attachment7Name = attachment7Name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", otherNames='" + otherNames + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender='" + gender + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", nationality='" + nationality + '\'' +
                ", permanentAddr='" + permanentAddr + '\'' +
                ", educationalQualification='" + educationalQualification + '\'' +
                ", lastSchoolAttended='" + lastSchoolAttended + '\'' +
                ", schoolAttended='" + schoolAttended + '\'' +
                ", certObtained='" + certObtained + '\'' +
                ", schoolAttended2='" + schoolAttended2 + '\'' +
                ", certObtained2='" + certObtained2 + '\'' +
                ", schoolAttended3='" + schoolAttended3 + '\'' +
                ", certObtained3='" + certObtained3 + '\'' +
                ", schoolAttended4='" + schoolAttended4 + '\'' +
                ", certObtained4='" + certObtained4 + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", nokSurname='" + nokSurname + '\'' +
                ", nokFirstName='" + nokFirstName + '\'' +
                ", nokPhoneNo='" + nokPhoneNo + '\'' +
                ", nokAddrs='" + nokAddrs + '\'' +
                ", nokEmail='" + nokEmail + '\'' +
                ", remark='" + remark + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", createdDt=" + createdDt +
                ", lastActivityBy='" + lastActivityBy + '\'' +
                ", lastActivityDt=" + lastActivityDt +
                ", attachments1=" + Arrays.toString(attachments1) +
                ", attachment1Name='" + attachment1Name + '\'' +
                ", attachments2=" + Arrays.toString(attachments2) +
                ", attachment2Name='" + attachment2Name + '\'' +
                ", attachments3=" + Arrays.toString(attachments3) +
                ", attachment3Name='" + attachment3Name + '\'' +
                ", attachments4=" + Arrays.toString(attachments4) +
                ", attachment4Name='" + attachment4Name + '\'' +
                ", attachments5=" + Arrays.toString(attachments5) +
                ", attachment5Name='" + attachment5Name + '\'' +
                ", attachments6=" + Arrays.toString(attachments6) +
                ", attachment6Name='" + attachment6Name + '\'' +
                ", attachments7=" + Arrays.toString(attachments7) +
                ", attachment7Name='" + attachment7Name + '\'' +
                ", employeeId='" + employeeId + '\'' +
                '}';
    }
}
