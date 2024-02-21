package io.kubecloudsinc.kubecloudsapp.service;

import io.kubecloudsinc.kubecloudsapp.dto.CreatedResponseDTO;
import io.kubecloudsinc.kubecloudsapp.dto.EmployeeTableFieldsDTO;
import io.kubecloudsinc.kubecloudsapp.model.Employee;
import org.modelmapper.ModelMapper;

import java.util.List;


public interface EmployeeService {
    List<Employee> getAllEmployees();

    Employee getEmployee(int id);

    EmployeeTableFieldsDTO getEmployeeProfile(int employeeId);

    CreatedResponseDTO createEmployee(Employee employee);

    ModelMapper deleteEmployee(String id);
}
