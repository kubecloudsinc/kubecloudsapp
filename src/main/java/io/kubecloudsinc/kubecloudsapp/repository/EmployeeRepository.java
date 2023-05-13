package io.kubecloudsinc.kubecloudsapp.repository;

import io.kubecloudsinc.kubecloudsapp.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "employee", path = "employee")
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
}
