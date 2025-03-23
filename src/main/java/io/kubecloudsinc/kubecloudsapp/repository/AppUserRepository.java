package io.kubecloudsinc.kubecloudsapp.repository;

import io.kubecloudsinc.kubecloudsapp.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import reactor.core.publisher.Mono;

import java.util.Optional;

@RepositoryRestResource(collectionResourceRel = "appuser", path = "appuser")
public interface AppUserRepository extends JpaRepository<AppUser, String> {
    // This returns Optional<Boolean>
    Optional<Boolean> existsByEmail(String email);

    // Use Mono.justOrEmpty to convert Optional to Mono
    default Mono<Boolean> existsByEmailMono(String email) {
        Optional<Boolean> exists = existsByEmail(email);
        return Mono.justOrEmpty(exists.orElse(false));  // Convert Optional to Mono<Boolean>
    }
    puMono<AppUser> getUserByEmail(String email) {
}
