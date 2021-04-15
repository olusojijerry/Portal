package com.educationportal.dto;

import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.List;

public class EmployeeDto {
    private Long id;
    private String title;
    private String firstName;
    private String lastName;
    private String otherNames;
    private Date dateOfBirth;
    private String gender;
    private String maritalStatus;
    private String nationality;
    private String permanentAddr;
    private String educationalQualification;
    private String lastSchoolAttended;
    private String schoolAttended;
    private String certObtained;
    private String schoolAttended2;
    private String certObtained2;
    private String schoolAttended3;
    private String certObtained3;
    private String schoolAttended4;
    private String certObtained4;
    private String emailAddress;
    private String phoneNo;
    private String nokSurname;
    private String nokFirstName;
    private String nokPhoneNo;
    private String nokAddrs;
    private String nokEmail;
    private String remark;
    private String createdBy;
    private Date createdDt;
    private String lastActivityBy;
    private Date lastActivityDt;
    private List<MultipartFile> attachments;
    private String employeeId;

    public List<MultipartFile> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<MultipartFile> attachments) {
        this.attachments = attachments;
    }

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

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
}
