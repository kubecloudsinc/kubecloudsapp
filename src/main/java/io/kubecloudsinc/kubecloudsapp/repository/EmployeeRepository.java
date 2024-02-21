package io.kubecloudsinc.kubecloudsapp.repository;

import io.kubecloudsinc.kubecloudsapp.dto.EmployeeTableFieldsProjection;
import io.kubecloudsinc.kubecloudsapp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "employee", path = "employee")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query(value = "SELECT " +
            "e.employee_id AS employeeId, " +
            "e.first_name AS employeeName, " +
            "e.salary AS employeeSalary, " +
            "m.employee_id AS managerId, " +
            "m.first_name AS managerFirst, " +
            "m.last_name AS managerLast, " +
            "m.salary AS managerSalary, " +
            "d.department_id AS departmentId, " +
            "d.department_name AS departmentName, " +
            "m.department_id AS managerDepartmentId, " +
            "d.location_id AS locationId, " +
            "jh.start_date AS startDate, " +
            "jh.end_date AS endDate, " +
            "j.job_id AS jobId, " +
            "j.job_title AS jobTitle " +
            "FROM Employees e " +
            "LEFT JOIN Employees m ON e.manager_id = m.employee_id " +
            "LEFT JOIN Departments d ON e.department_id = d.department_id " +
            "LEFT JOIN Job_History jh ON e.employee_id = jh.employee_id " +
            "LEFT JOIN Jobs j ON jh.job_id = j.job_id " +
            "WHERE e.employee_id = :employeeId", nativeQuery = true)
    List<EmployeeTableFieldsProjection> findEmployeeWithJobAndManagerAndJobHistoryAndDepartment(@Param("employeeId") int employeeId);


}

