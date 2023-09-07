package io.kubecloudsinc.kubecloudsapp.service.impl;

import io.kubecloudsinc.kubecloudsapp.dto.DepartmentDTO;
import io.kubecloudsinc.kubecloudsapp.dto.EmployeeTableFieldsDTO;
import io.kubecloudsinc.kubecloudsapp.dto.EmployeeTableFieldsProjection;
import io.kubecloudsinc.kubecloudsapp.model.Employee;
import io.kubecloudsinc.kubecloudsapp.repository.EmployeeRepository;
import io.kubecloudsinc.kubecloudsapp.service.EmployeeService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final ModelMapper modelMapper;


    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployee(int employeeId) {
        return employeeRepository.findById(employeeId).isPresent() ? employeeRepository.findById(employeeId).get() : new Employee();
    }

    @Override
    public List<EmployeeTableFieldsDTO> getEmployeeProfile(int employeeId) {
        List<EmployeeTableFieldsProjection> projections = employeeRepository.findEmployeeWithJobAndManagerAndJobHistoryAndDepartment(employeeId);
        List<EmployeeTableFieldsDTO> dtos = new ArrayList<>();
        for (EmployeeTableFieldsProjection projection : projections) {
            EmployeeTableFieldsDTO dto = modelMapper.map(projection, EmployeeTableFieldsDTO.class);
            DepartmentDTO departmentDTO = new DepartmentDTO();
            departmentDTO.setDepartmentId(projection.getDepartmentId());
            departmentDTO.setDepartmentName(projection.getDepartmentName());
            departmentDTO.setLocationId(projection.getLocationId());
            dto.setJobHistory(new ArrayList<>());
            dto.setDepartment(departmentDTO);
            dtos.add(dto);
        }
        return dtos;
    }

}
