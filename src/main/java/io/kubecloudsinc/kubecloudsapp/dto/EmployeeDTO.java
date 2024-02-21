package io.kubecloudsinc.kubecloudsapp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
public class EmployeeDTO {
    @JsonProperty("employeeId")
    Integer employeeId;
    @JsonProperty("firstName")
    String firstName;
    @JsonProperty("lastName")
    String lastName;
    @JsonProperty("email")
    String email;
    @JsonProperty("phone")
    String phoneNumber;
    @JsonProperty("hireDate")
    Date hireDate;
    @JsonProperty("jobId")
    String jobId;
    @JsonProperty("salary")
    Float salary;
    @JsonProperty("commissionPct")
    Float commissionPct;
    @JsonProperty("managerId")
    Integer managerId;
    @JsonProperty("departmentId")
    Integer departmentId;
}
