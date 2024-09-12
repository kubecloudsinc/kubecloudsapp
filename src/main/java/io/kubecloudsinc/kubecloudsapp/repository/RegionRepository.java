package io.kubecloudsinc.kubecloudsapp.repository;

import io.kubecloudsinc.kubecloudsapp.model.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "region", path = "region")
public interface RegionRepository extends JpaRepository<Region, Integer> {
}
