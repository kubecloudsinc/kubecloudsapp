package io.kubecloudsinc.kubecloudsapp.dto;
import java.util.List;

public interface EmployeeTableFieldsProjection {
    String getEmployeeId();
    String getEmployeeName();
    Long getEmployeeSalary();
    String getStartDate();
    String getEndDate();
    String getJobId();
    String getJobTitle();
    String getManagerId();
    String getManagerFirst();
    String getManagerLast();
    Long getManagerSalary();
    Integer getDepartmentId();
    String getDepartmentName();
    Integer getLocationId();
    List<JobHistoryDTO> getJobHistory();
}