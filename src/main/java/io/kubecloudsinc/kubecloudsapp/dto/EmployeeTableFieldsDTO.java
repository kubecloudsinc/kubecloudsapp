package io.kubecloudsinc.kubecloudsapp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class EmployeeTableFieldsDTO {
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("job")
    private JobDTO job;
    @JsonProperty("jobHistory")
    private List<JobHistoryDTO> jobHistory;
    @JsonProperty("manager")
    private ManagerDTO manager;
    @JsonProperty("department")
    private DepartmentDTO department;
}



