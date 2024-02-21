package io.kubecloudsinc.kubecloudsapp.service.impl;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import io.kubecloudsinc.kubecloudsapp.dto.*;
import io.kubecloudsinc.kubecloudsapp.model.Employee;
import io.kubecloudsinc.kubecloudsapp.repository.EmployeeRepository;
import io.kubecloudsinc.kubecloudsapp.service.EmployeeService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Slf4j
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;
   // private final ModelMapper modelMapper;


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
        List<JobDTO> jobDTOS = projections.stream().filter(projection -> projection.getJobId() != null).map(p -> new JobDTO(p.getJobId(), p.getJobTitle())).collect(Collectors.toList());
        List<JobHistoryDTO> jobHistoryDTOS = projections.stream().filter(projection -> projection.getStartDate() != null).map(p -> new JobHistoryDTO(p.getStartDate(), p.getEndDate())).collect(Collectors.toList());
        for (EmployeeTableFieldsProjection projection : projections) {
            employeeTableFieldsDTO = modelMapper.map(projection, EmployeeTableFieldsDTO.class);
            DepartmentDTO departmentDTO = new DepartmentDTO();
            departmentDTO.setDepartmentId(projection.getDepartmentId());
            departmentDTO.setDepartmentName(projection.getDepartmentName());
            departmentDTO.setLocationId(projection.getLocationId());
            employeeTableFieldsDTO.setJob(jobDTOS);
            employeeTableFieldsDTO.setJobHistory(jobHistoryDTOS);
            employeeTableFieldsDTO.setDepartment(departmentDTO);
        }
        return employeeTableFieldsDTO;
    }

    @Override
    public CreatedResponseDTO createEmployee(Employee employee) {
        employeeRepository.save(employee);
        return new CreatedResponseDTO("Created");
    }

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    }


