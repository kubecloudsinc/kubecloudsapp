package io.kubecloudsinc.kubecloudsapp.service;

import io.kubecloudsinc.kubecloudsapp.dto.EmployeeTableFieldsDTO;
import io.kubecloudsinc.kubecloudsapp.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    Employee getEmployee(int id);

    EmployeeTableFieldsDTO getEmployeeProfile(int employeeId);
}
