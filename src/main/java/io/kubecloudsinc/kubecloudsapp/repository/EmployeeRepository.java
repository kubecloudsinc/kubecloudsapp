package io.kubecloudsinc.kubecloudsapp.repository;

import io.kubecloudsinc.kubecloudsapp.dto.EmployeeDTO;
import io.kubecloudsinc.kubecloudsapp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "employee", path = "employee")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    /*@Query("SELECT new com.example.dto.MyDto(e.id, e.name) FROM MyEntity e")
    Flux<EmployeeDTO> findAllEmployees();

    @Query("SELECT new com.example.dto.MyDto(e.id, e.name) FROM MyEntity e")
    Mono<EmployeeDTO> findEmployee();*/


}

