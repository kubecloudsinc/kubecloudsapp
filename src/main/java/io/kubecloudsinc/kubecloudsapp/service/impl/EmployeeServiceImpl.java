package io.kubecloudsinc.kubecloudsapp.service.impl;

import io.kubecloudsinc.kubecloudsapp.dto.DepartmentDTO;
import io.kubecloudsinc.kubecloudsapp.dto.EmployeeTableFieldsDTO;
import io.kubecloudsinc.kubecloudsapp.dto.EmployeeTableFieldsProjection;
import io.kubecloudsinc.kubecloudsapp.dto.JobDTO;
import io.kubecloudsinc.kubecloudsapp.model.Employee;
import io.kubecloudsinc.kubecloudsapp.repository.EmployeeRepository;
import io.kubecloudsinc.kubecloudsapp.service.EmployeeService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
    public EmployeeTableFieldsDTO getEmployeeProfile(int employeeId) {
        List<EmployeeTableFieldsProjection> projections = employeeRepository.findEmployeeWithJobAndManagerAndJobHistoryAndDepartment(employeeId);
        EmployeeTableFieldsDTO employeeTableFieldsDTO = new EmployeeTableFieldsDTO();
        List<JobDTO> jobDTOS = projections.stream().map(p -> new JobDTO(p.getJobId(), p.getJobTitle())).collect(Collectors.toList());
        for (EmployeeTableFieldsProjection projection : projections) {
            EmployeeTableFieldsDTO dto = modelMapper.map(projection, EmployeeTableFieldsDTO.class);
            DepartmentDTO departmentDTO = new DepartmentDTO();
            departmentDTO.setDepartmentId(projection.getDepartmentId());
            departmentDTO.setDepartmentName(projection.getDepartmentName());
            departmentDTO.setLocationId(projection.getLocationId());
            dto.setJob(jobDTOS);
            dto.setJobHistory(new ArrayList<>());
            dto.setDepartment(departmentDTO);

        }

        return employeeTableFieldsDTO;
    }
}