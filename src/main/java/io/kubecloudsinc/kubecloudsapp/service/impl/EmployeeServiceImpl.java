package io.kubecloudsinc.kubecloudsapp.service.impl;

import io.kubecloudsinc.kubecloudsapp.model.Employee;
import io.kubecloudsinc.kubecloudsapp.repository.EmployeeRepository;
import io.kubecloudsinc.kubecloudsapp.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployee(int employeeId) {
        return employeeRepository.findById(employeeId).isPresent() ? employeeRepository.findById(employeeId).get() : new Employee();
    }
}
