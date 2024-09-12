package io.kubecloudsinc.kubecloudsapp.repository;

import io.kubecloudsinc.kubecloudsapp.model.JobHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "jobhistory", path = "jobhistory")
public interface JobHistoryRepostiory extends JpaRepository<JobHistory, Integer> {

}
