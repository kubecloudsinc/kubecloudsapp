package io.kubecloudsinc.kubecloudsapp.service.impl;

import io.kubecloudsinc.kubecloudsapp.model.Department;
import io.kubecloudsinc.kubecloudsapp.model.Employee;
import io.kubecloudsinc.kubecloudsapp.repository.DepartmentsRepository;
import io.kubecloudsinc.kubecloudsapp.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentsRepository departmentsRepository;
    @Override
    public List<Department> getAllDepartments() {
        return departmentsRepository.findAll();
    }

    @Override
    public Department getDepartment(int departmentId) {
        return departmentsRepository.findById(departmentId).isPresent() ? departmentsRepository.findById(departmentId).get() : new Department();
    }
}
