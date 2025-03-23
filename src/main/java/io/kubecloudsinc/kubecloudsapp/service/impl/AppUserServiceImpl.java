package io.kubecloudsinc.kubecloudsapp.service.impl;

import io.kubecloudsinc.kubecloudsapp.dto.AppUserDTO;
import io.kubecloudsinc.kubecloudsapp.model.AppUser;
import io.kubecloudsinc.kubecloudsapp.repository.AppUserRepository;
import io.kubecloudsinc.kubecloudsapp.service.AppUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

@Service
public class AppUserServiceImpl implements AppUserService {

    @Autowired
    private AppUserRepository appUserRepository;

    @Override
    public Mono<AppUser> createUser(AppUserDTO appUserDTO) {
        // Logic to map AppUserDTO to AppUser entity and save it
        AppUser appUser = new AppUser();
        appUser.setFirstName(appUserDTO.getFirstName());
        appUser.setLastName(appUserDTO.getLastName());
        appUser.setEmail(appUserDTO.getEmail());

        // Save the user to the database

        // Save user in a blocking way but return a Mono<AppUser> asynchronously
        return Mono.fromCallable(() -> appUserRepository.save(appUser))
                .subscribeOn(Schedulers.boundedElastic());  // Run on a separate thread to avoid blocking
    }

    @Override
    public Mono<AppUser> getUserByEmail(String email) {
        return appUserRepository.existsByEmailMono(email);
    }
}
