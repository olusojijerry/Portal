package com.educationportal.dto;

import lombok.Data;

@Data
public class AssignRoleToUserDto {
    String employeeId;
    String roleName;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
