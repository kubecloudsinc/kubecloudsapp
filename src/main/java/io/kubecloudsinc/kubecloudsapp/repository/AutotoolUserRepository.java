package io.kubecloudsinc.kubecloudsapp.repository;

import io.kubecloudsinc.kubecloudsapp.model.AutotoolUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface AutotoolUserRepository extends JpaRepository<AutotoolUser, String> {
    AutotoolUser findByEmail(String email);
    //AutotoolUser findByUsername(String username);
}