package com.educationportal.services;

import com.educationportal.domain.Salary;
import com.educationportal.dto.Salarydto;
import org.springframework.stereotype.Service;

@Service
public class SalaryService {

    public Salary mapperSalary (Salarydto salarydto){
        Salary salary = new Salary();

        salary.setAmount(salarydto.getAmount());
        salary.setCreatedBy(salarydto.getCreatedBy());
        salary.setCreatedDt(salarydto.getCreatedDt());
        salary.setId(salarydto.getId());
        salary.setRemarks(salarydto.getRemarks());
        salary.setSalaryType(salarydto.getSalaryType());
        salary.setBasic(salarydto.getBasic());
        salary.setHousing(salarydto.getHousing());
        salary.setTransport(salarydto.getTransport());
        salary.setSpecialDuty(salarydto.getSpecialDuty());
        salary.setUtility(salarydto.getUtility());
        salary.setNetSalary(salarydto.getNetSalary());
        salary.setFurniture(salarydto.getFurniture());
        salary.setDressing(salarydto.getDressing());
        salary.setLeave(salarydto.getLeave());
        salary.setEntertainment(salarydto.getEntertainment());
        salary.setThirteenthMonth(salarydto.getThirteenMonth());
        salary.setPension(salarydto.getPension());
        salary.setMedicalAllowance(salarydto.getMedicalAllowance());
        salary.setTotalAnnualBenefit(salarydto.getTotalAnnualBenefit());
        salary.setTax(salarydto.getTax());

        return salary;
    }

    public Salarydto mapperSalarydto(Salary salary){
        Salarydto salarydto = new Salarydto();

        salarydto.setAmount(salary.getAmount());
        salarydto.setCreatedBy(salary.getCreatedBy());
        salarydto.setCreatedDt(salary.getCreatedDt());
        salarydto.setId(salary.getId());
        salarydto.setRemarks(salary.getRemarks());
        salarydto.setSalaryType(salary.getSalaryType());
        salarydto.setBasic(salary.getBasic());
        salarydto.setHousing(salary.getHousing());
        salarydto.setTransport(salary.getTransport());
        salarydto.setSpecialDuty(salary.getSpecialDuty());
        salarydto.setUtility(salary.getUtility());
        salarydto.setNetSalary(salary.getNetSalary());
        salarydto.setFurniture(salary.getFurniture());
        salarydto.setDressing(salary.getDressing());
        salarydto.setLeave(salary.getLeave());
        salarydto.setEntertainment(salary.getEntertainment());
        salarydto.setThirteenMonth(salary.getThirteenthMonth());
        salarydto.setPension(salary.getPension());
        salarydto.setMedicalAllowance(salary.getMedicalAllowance());
        salarydto.setTotalAnnualBenefit(salary.getTotalAnnualBenefit());
        salarydto.setTax(salary.getTax());

        return salarydto;
    }
}
