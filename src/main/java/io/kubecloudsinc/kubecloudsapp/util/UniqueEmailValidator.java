package io.kubecloudsinc.kubecloudsapp.util;

import io.kubecloudsinc.kubecloudsapp.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Mono;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniqueEmailValidator implements ConstraintValidator<UniqueEmail, String> {

    @Autowired
    private AppUserRepository appUserRepository;

    @Override
    public boolean isValid(String email, ConstraintValidatorContext context) {
        // Check if the email exists in the repository (returns Mono<Boolean>)
        Mono<Boolean> emailExistsMono = appUserRepository.existsByEmailMono(email);
        return emailExistsMono
                .map(exists -> !exists)  // Negate the result: if exists, return false (invalid); if not, return true (valid)
                .block();  // Block the Mono to get the actual boolean result for synchronous validation
    }
}