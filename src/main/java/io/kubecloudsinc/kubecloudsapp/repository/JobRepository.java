package io.kubecloudsinc.kubecloudsapp.repository;

import io.kubecloudsinc.kubecloudsapp.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "job", path = "job")
public interface JobRepository extends JpaRepository<Job, Integer> {
}

