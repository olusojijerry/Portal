package com.educationportal.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Slf4j
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Salarydto {
    Long id;
    String salaryType;
    BigDecimal amount;
    String createdBy;
    Date createdDt;
    String remarks;
    BigDecimal basic;
    BigDecimal housing;
    BigDecimal transport;
    BigDecimal specialDuty;
    BigDecimal utility;
    BigDecimal netSalary;
    BigDecimal furniture;
    BigDecimal dressing;
    BigDecimal leave;
    BigDecimal entertainment;
    BigDecimal thirteenMonth;
    BigDecimal pension;
    BigDecimal medicalAllowance;
    BigDecimal totalAnnualBenefit;
    BigDecimal tax;

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

    public BigDecimal getThirteenMonth() {
        return thirteenMonth;
    }

    public void setThirteenMonth(BigDecimal thirteenMonth) {
        this.thirteenMonth = thirteenMonth;
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
}
