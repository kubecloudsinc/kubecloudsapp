package io.kubecloudsinc.kubecloudsapp.service;

import io.kubecloudsinc.kubecloudsapp.dto.AppUserDTO;
import io.kubecloudsinc.kubecloudsapp.model.AppUser;
import reactor.core.publisher.Mono;

public interface AppUserService {

    Mono<AppUser> createUser(AppUserDTO appUserDTO);
    Mono<AppUser> getUserByEmail(String email);
}