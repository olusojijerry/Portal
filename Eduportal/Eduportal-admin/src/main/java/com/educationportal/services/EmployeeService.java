package com.educationportal.services;

import com.educationportal.domain.Employee;
import com.educationportal.dto.EmployeeDto;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class EmployeeService {

    public Employee mapper(EmployeeDto employeeDto){
        Employee employee = new Employee();

        employee.setEducationalQualification(employeeDto.getEducationalQualification());
        employee.setPermanentAddr(employeeDto.getPermanentAddr());
        employee.setNationality(employeeDto.getNationality());
        employee.setMaritalStatus(employeeDto.getMaritalStatus());
        employee.setGender(employeeDto.getGender());
        employee.setDateOfBirth(employeeDto.getDateOfBirth());
        employee.setLastName(employeeDto.getLastName());
        employee.setFirstName(employeeDto.getFirstName());
        employee.setTitle(employeeDto.getTitle());
        for(MultipartFile multipartFile: employeeDto.getAttachments()){
            //todo save each of the attachment
            //todo create a table for attachments name of the table
        }
        employee.setCertObtained(employeeDto.getCertObtained());
        employee.setCertObtained2(employeeDto.getCertObtained2());
        employee.setCertObtained3(employeeDto.getCertObtained3());
        employee.setCertObtained4(employeeDto.getCertObtained4());
        employee.setCreatedBy(employeeDto.getCreatedBy());
        employee.setCreatedDt(employeeDto.getCreatedDt());
        employee.setEmailAddress(employeeDto.getEmailAddress());
//        todo the employee id is to be auto generated based on department and company name
        employee.setEmployeeId(employeeDto.getEmployeeId());
        employee.setLastActivityBy(employeeDto.getLastActivityBy());
        employee.setLastActivityDt(employeeDto.getLastActivityDt());
        employee.setLastSchoolAttended(employeeDto.getLastSchoolAttended());
        employee.setNokAddrs(employeeDto.getNokAddrs());
        employee.setNokEmail(employeeDto.getNokEmail());
        employee.setNokFirstName(employeeDto.getNokFirstName());
        employee.setNokPhoneNo(employeeDto.getNokPhoneNo());
        employee.setNokSurname(employeeDto.getNokSurname());
        employee.setOtherNames(employeeDto.getOtherNames());
        employee.setPhoneNo(employeeDto.getPhoneNo());
        employee.setRemark(employeeDto.getRemark());
        employee.setSchoolAttended(employeeDto.getSchoolAttended());
        employee.setSchoolAttended2(employeeDto.getSchoolAttended2());
        employee.setSchoolAttended3(employeeDto.getSchoolAttended3());
        employee.setSchoolAttended4(employeeDto.getSchoolAttended4());

        return employee;
    }
}
