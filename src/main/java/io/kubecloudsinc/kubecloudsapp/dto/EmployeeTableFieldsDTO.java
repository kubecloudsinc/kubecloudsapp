package io.kubecloudsinc.kubecloudsapp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeTableFieldsDTO {
    @JsonProperty("employeeId")
    String employeeId;
    @JsonProperty("employeeName")
    String employeeName;
    @JsonProperty("employeeSalary")
    String employeeSalary;
    @JsonProperty("job")
    List<JobDTO> job;
    @JsonProperty("jobHistory")
    List<JobHistoryDTO> jobHistory;
    @JsonProperty("manager")
    ManagerDTO manager;
    @JsonProperty("department")
    DepartmentDTO department;
}



