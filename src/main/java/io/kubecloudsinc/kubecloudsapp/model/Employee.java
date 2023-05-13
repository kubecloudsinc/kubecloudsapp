package io.kubecloudsinc.kubecloudsapp.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Component
@Table(name = "EMPLOYEES")
@Data
public class Employee implements Serializable {
    @Id
    Integer employeeId;
    @Column(name = "FIRST_NAME")
    String firstName;
    @Column(name = "LAST_NAME")
    String lastName;
    @Column(name = "EMAIL")
    String email;
    @Column(name = "PHONE_NUMBER")
    String phoneNumber;
    @Column(name = "HIRE_DATE")
    Date hireDate;
    @Column(name = "JOB_ID")
    String jobId;
    @Column(name = "SALARY")
    Float salary;
    @Column(name = "COMMISSION_PCT")
    Float commissionPct;
    @Column(name = "MANAGER_ID")
    Integer managerId;
    @Column(name = "DEPARTMENT_ID")
    Integer departmentId;
}
