package com.educationportal;

import com.educationportal.domain.*;
import com.educationportal.repository.services.*;
import com.querydsl.core.BooleanBuilder;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.*;

/**
 * Unit test for simple App.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
//@Slf4j
public class AppTest {
    @Autowired
    TeacherRepositoryService teacherRepositoryService;
    @Autowired
    SalaryRepositoryService salaryRepositoryService;
    @Autowired
    UsersRepositoryService usersRepositoryService;
    @Autowired
    StaticDataListRepositoryService staticDataListRepositoryService;
    @Autowired
    EmployeeRepositoryService employeeRepositoryService;
    @Autowired
    SchoolsRepositoryService schoolsRepositoryService;
    @Autowired
    SchoolsBranchRepositoryService schoolsBranchRepositoryService;

    @Bean
    public PasswordEncoder encoder(){
        return new BCryptPasswordEncoder();
    }

    private Long val;

    @Test
    @Ignore
    public void testSalary(){
        Salary salary = new Salary();

        salary.setAmount(new BigDecimal(10000));
        salary.setBasic(new BigDecimal(1000));
        salary.setCreatedBy("Jerry");
        salary.setCreatedDt(new Date());
        salary.setDressing(new BigDecimal(100));
        salary.setEntertainment(new BigDecimal(100));
        salary.setFurniture(new BigDecimal(100));
        salary.setHousing(new BigDecimal(100));
        salary.setRemarks("Salary Wages");
        salary.setNetSalary(new BigDecimal(11400));
        salary.setSalaryType("Personal");
        salary.setUtility(new BigDecimal(100));

        salary = salaryRepositoryService.saveOrUpdate(salary);

        Salary salary1 = salaryRepositoryService.findOne(salary.getId()).get();

        Assert.assertNotNull(salary1);

    }

    @Test
    @Ignore
    public void testTeacherRepository(){
        Teacher teacher = new Teacher();

        teacher.setAddress("No 31, Godmon street");
        teacher.setAddressNok("No 30, Godmon Street");
        teacher.setCreated_by("Seyi");
        teacher.setCreated_dt(new Date());
        teacher.setDateOfBirth(new Date());
        teacher.setMaritalStatus("Single");
        teacher.setName("Oluseyi Ojo");
        teacher.setPhone("07034834761");
        teacher.setPhoneNok("07030702455");
        teacher.setResumptionDt(new Date());
        teacher.setTitle("Mr");
        Optional<Salary> salary = salaryRepositoryService.findOne(1L);
        teacher.setSalaryId(salary.get());

        teacher = teacherRepositoryService.saveOrUpdate(teacher);

        Teacher teacher1 = teacherRepositoryService.findById(teacher.getId()).get();

        Assert.assertNotNull(teacher1);
    }

    @Test
    @Ignore
    public void testUsersPermissionAndRoles(){
        Privilege readPrivilege
                = createPrivilegeIfNotFound("READ_PRIVILEGE");
        Privilege writePrivilege
                = createPrivilegeIfNotFound("WRITE_PRIVILEGE");

        List<Privilege> adminPrivileges = Arrays.asList(
                readPrivilege, writePrivilege);
        createRoleIfNotFound("ROLE_ADMIN", adminPrivileges);
        createRoleIfNotFound("ROLE_USER", Arrays.asList(readPrivilege));

        Optional<Role> opRole = usersRepositoryService.findRoleByName("ROLE_ADMIN");
        Role adminRole = opRole.get();
        Users user = new Users();
        user.setName("Testing");
        user.setTokenExpired(false);
        user.setPassword(encoder().encode("password"));
        user.setEmail("test@testing.com");
        user.setAcctExpired(false);
        user.setAcctLocked(false);
        user.setRoles(Arrays.asList(adminRole));
        user.setEnabled(true);
        usersRepositoryService.saveOrUpdate(user);
    }

    Privilege createPrivilegeIfNotFound(String name) {
        Privilege privilege1 = new Privilege();
        Optional<Privilege> privilege = usersRepositoryService.findPrivilegeByName(name);
        if (!privilege.isPresent()) {
//            privilege1 = privilege.get();
            privilege1.setName(name);
            privilege1.setDescription("SYSTEM");
            privilege1 = usersRepositoryService.saveOrUpdate(privilege1);
        }
        return privilege1;
    }

    Role createRoleIfNotFound(String name, Collection<Privilege> privileges) {
        Role role1 = new Role();
        Optional<Role> role = usersRepositoryService.findRoleByName(name);
        if (!role.isPresent()) {
            role1.setName(name);
            role1.setDescription("SYSTEM");
            role1.setPrivileges(privileges);
            role1 = usersRepositoryService.saveOrUpdate(role1);
        }
        return role1;
    }
    @Test
    @Ignore
    public void createRole(){
        Role role =createRoleFound("Teacher", "Teaching");
        Assert.assertNotNull(role);
    }

    @Test
    @Ignore
    public void assignRole(){
        String roleName = "Teacher";

        Optional<Role> oprole = usersRepositoryService.findRoleByName(roleName);

        Role role = oprole.get();

        role.setPrivileges(getPrivilege());

        role = usersRepositoryService.saveOrUpdate(role);

        Assert.assertNotNull(role);
    }

    private List<Privilege> getPrivilege(){
        Privilege readPrivilege
                = createPrivilegeIfNotFound("TEACHER_READ_PRIVILEGE");
        Privilege writePrivilege
                = createPrivilegeIfNotFound("TEACHER_WRITE_PRIVILEGE");

        List<Privilege> adminPrivileges = Arrays.asList(
                readPrivilege, writePrivilege);

        return adminPrivileges;
    }

    Role createRoleFound(String name, String description) {
        Role role1 = new Role();
        Optional<Role> role = usersRepositoryService.findRoleByName(name);
        if (!role.isPresent()) {
            role1.setName(name);
            role1.setDescription(description);
//            role1.setPrivileges(privileges);
            role1 = usersRepositoryService.saveOrUpdate(role1);
        }
        return role1;
    }

    @Test
    @Ignore
    public void testStaticDataList(){
        StaticDataList staticDataList = new StaticDataList();

        staticDataList.setCode("tchPrefix");
        staticDataList.setCreatedBy("SYSTEM");
        staticDataList.setCreatedDt(new Date());
        staticDataList.setDataValue("Code Prefix");
        staticDataList.setDescription("This is the Teacher Prefix for employee id");
        staticDataList.setField1("TCH");

        staticDataList = staticDataListRepositoryService.saveOrUpdate(staticDataList);

        Optional<StaticDataList> opstaticDataList1 = staticDataListRepositoryService.findById(staticDataList.getId());
        StaticDataList staticDataList1 = opstaticDataList1.get();
        Assert.assertNotNull(staticDataList1);
    }

    @Test
    @Ignore
    public void testEmployees(){
        Employee employee = new Employee();

        employee.setTitle("Mrs");
        employee.setFirstName("Oluwaseyi");
        employee.setLastName("Ojo");
        employee.setDateOfBirth(new Date());
        employee.setGender("Female");
        employee.setMaritalStatus("Married");
        employee.setNationality("Nigerian");
        employee.setPermanentAddr("No 31, Godmon Street Lagos");
        employee.setEducationalQualification("MSC");

        employee =employeeRepositoryService.saveOrUpdate(employee);

        Optional<Employee> opemployee = employeeRepositoryService.findById(employee.getId());

        Employee employee1 = opemployee.get();

        Assert.assertNotNull(employee1);
    }

    @Test
    public void testSchoolsRepository(){
        Schools schools = new Schools();

        schools.setAddress("No 31, Godmon street by Chemist Bus, Bus Stop, Okota, Lagos");
        schools.setComment("new created school");
        schools.setCreatedBy("SYSTEM");
        schools.setCreatedDt(new Date());
        schools.setDirector("Mrs Oluwaseyi Ojo");
        schools.setEmail("uniqueseyi2007@uk.co");
        schools.setFacebook("");
        schools.setSchoolName("Diadem Group Of Schools");
        schools.setTwitter("mytwitter.com");
        schools.setWebsite("myGroupofschools.com");

        BooleanBuilder booleanBuilder = new BooleanBuilder();

        QSchools qSchools = QSchools.schools;

        booleanBuilder.and(qSchools.email.eq(schools.getEmail()));

        Optional<Schools> optionalSchools = schoolsRepositoryService.findOne(booleanBuilder);

        if(!optionalSchools.isPresent())
            schools = schoolsRepositoryService.SaveOrUpdate(schools);

        Assert.assertNotNull(schools.getId());
    }

    @Test
    public void testSchoolBranchService(){
        SchoolBranch schoolBranch = new SchoolBranch();

        schoolBranch.setAddress("No 1, Ogunfowokan Street, Off Ibeh Road, Okota, Lagos State");
        schoolBranch.setComment("Our first branch school");
        schoolBranch.setDescription("Okota Branch");
        schoolBranch.setName("Diadem Group Of Schools");
        schoolBranch.setPhoneNumber("07034834761");
        schoolBranch.setSchoolId(1L);

        BooleanBuilder booleanBuilder = new BooleanBuilder();

        QSchoolBranch qSchoolBranch = QSchoolBranch.schoolBranch;
        booleanBuilder.and(qSchoolBranch.name.eq(schoolBranch.getName()));
        booleanBuilder.and(qSchoolBranch.schoolId.eq(schoolBranch.getSchoolId()));

        Optional<SchoolBranch> optionalSchoolBranch = schoolsBranchRepositoryService.findOne(booleanBuilder);

        if(!optionalSchoolBranch.isPresent())
            schoolBranch = schoolsBranchRepositoryService.saveOrUpdate(schoolBranch);

        Assert.assertNotNull(schoolBranch.getId());
    }
}
