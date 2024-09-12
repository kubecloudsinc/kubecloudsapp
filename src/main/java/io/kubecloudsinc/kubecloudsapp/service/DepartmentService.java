package io.kubecloudsinc.kubecloudsapp.service;

import io.kubecloudsinc.kubecloudsapp.model.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> getAllDepartments();

    Department getDepartment(int id);
}
