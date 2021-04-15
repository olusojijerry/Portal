package com.educationportal.domain;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "salary")
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Salary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(
            name = "ID"
    )
    private Long id;
    @Column(
            name = "salary_type"
    )
    private String salaryType;
    @Column(
            name = "amount"
    )
    private BigDecimal amount;
    @CreatedDate
    @Column(
            name = "created_dt"
    )
    private Date createdDt;
    @Column(
            name = "created_by"
    )
    private String createdBy;
    @Column(
            name = "remarks"
    )
    private String remarks;
    @Column(
            name = "basic"
    )
    private BigDecimal basic;
    @Column(
            name = "housing"
    )
    private BigDecimal housing;
    @Column(
            name = "transport"
    )
    private BigDecimal transport;
    @Column(
            name = "special_duty"
    )
    private BigDecimal specialDuty;
    @Column(
            name = "utility"
    )
    private BigDecimal utility;
    @Column(
            name = "net_salary"
    )
    private BigDecimal netSalary;
    @Column(
            name = "furniture"
    )
    private BigDecimal furniture;
    @Column(
            name = "dressing"
    )
    private BigDecimal dressing;
    @Column(
            name = "leave"
    )
    private BigDecimal leave;
    @Column(
            name = "entertainment"
    )
    private BigDecimal entertainment;
    @Column(
            name = "thirteenth_month"
    )
    private BigDecimal thirteenthMonth;
    @Column(
            name = "pension"
    )
    private BigDecimal pension;
    @Column(
            name = "medical_allowance"
    )
    private BigDecimal medicalAllowance;
    @Column(
            name = "total_annual_benefit"
    )
    private BigDecimal totalAnnualBenefit;
    @Column(
            name = "tax"
    )
    private BigDecimal tax;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSalaryType() {
        return salaryType;
    }

    public void setSalaryType(String salaryType) {
        this.salaryType = salaryType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
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

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public BigDecimal getBasic() {
        return basic;
    }

    public void setBasic(BigDecimal basic) {
        this.basic = basic;
    }

    public BigDecimal getHousing() {
        return housing;
    }

    public void setHousing(BigDecimal housing) {
        this.housing = housing;
    }

    public BigDecimal getTransport() {
        return transport;
    }

    public void setTransport(BigDecimal transport) {
        this.transport = transport;
    }

    public BigDecimal getSpecialDuty() {
        return specialDuty;
    }

    public void setSpecialDuty(BigDecimal specialDuty) {
        this.specialDuty = specialDuty;
    }

    public BigDecimal getUtility() {
        return utility;
    }

    public void setUtility(BigDecimal utility) {
        this.utility = utility;
    }

    public BigDecimal getNetSalary() {
        return netSalary;
    }

    public void setNetSalary(BigDecimal netSalary) {
        this.netSalary = netSalary;
    }

    public BigDecimal getFurniture() {
        return furniture;
    }

    public void setFurniture(BigDecimal furniture) {
        this.furniture = furniture;
    }

    public BigDecimal getDressing() {
        return dressing;
    }

    public void setDressing(BigDecimal dressing) {
        this.dressing = dressing;
    }

    public BigDecimal getLeave() {
        return leave;
    }

    public void setLeave(BigDecimal leave) {
        this.leave = leave;
    }

    public BigDecimal getEntertainment() {
        return entertainment;
    }

    public void setEntertainment(BigDecimal entertainment) {
        this.entertainment = entertainment;
    }

    public BigDecimal getThirteenthMonth() {
        return thirteenthMonth;
    }

    public void setThirteenthMonth(BigDecimal thirteenthMonth) {
        this.thirteenthMonth = thirteenthMonth;
    }

    public BigDecimal getPension() {
        return pension;
    }

    public void setPension(BigDecimal pension) {
        this.pension = pension;
    }

    public BigDecimal getMedicalAllowance() {
        return medicalAllowance;
    }

    public void setMedicalAllowance(BigDecimal medicalAllowance) {
        this.medicalAllowance = medicalAllowance;
    }

    public BigDecimal getTotalAnnualBenefit() {
        return totalAnnualBenefit;
    }

    public void setTotalAnnualBenefit(BigDecimal totalAnnualBenefit) {
        this.totalAnnualBenefit = totalAnnualBenefit;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "id=" + id +
                ", salaryType='" + salaryType + '\'' +
                ", amount=" + amount +
                ", createdDt=" + createdDt +
                ", createdBy='" + createdBy + '\'' +
                ", remarks='" + remarks + '\'' +
                ", basic=" + basic +
                ", housing=" + housing +
                ", transport=" + transport +
                ", specialDuty=" + specialDuty +
                ", utility=" + utility +
                ", netSalary=" + netSalary +
                ", furniture=" + furniture +
                ", dressing=" + dressing +
                ", leave=" + leave +
                ", entertainment=" + entertainment +
                ", thirteenthMonth=" + thirteenthMonth +
                ", pension=" + pension +
                ", medicalAllowance=" + medicalAllowance +
                ", totalAnnualBenefit=" + totalAnnualBenefit +
                ", tax=" + tax +
                '}';
    }
}
