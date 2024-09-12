package io.kubecloudsinc.kubecloudsapp.repository;

import io.kubecloudsinc.kubecloudsapp.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "department", path = "department")
public interface DepartmentsRepository extends JpaRepository<Department, Integer> {
}