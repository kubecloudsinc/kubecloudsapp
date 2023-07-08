package io.kubecloudsinc.kubecloudsapp.repository;

import io.kubecloudsinc.kubecloudsapp.model.AutoToolUser;
import io.kubecloudsinc.kubecloudsapp.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface AutoToolUserRepository extends JpaRepository<AutoToolUser, Integer> {
}
