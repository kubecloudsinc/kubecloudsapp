package io.kubecloudsinc.kubecloudsapp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.kubecloudsinc.kubecloudsapp.model.AppUser;
import io.kubecloudsinc.kubecloudsapp.util.UniqueEmail;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AppUserDTO {
    @JsonProperty("firstName")
    @NotEmpty(message = "First name is mandatory")
    String firstName;
    @JsonProperty("lastName")
    @NotEmpty(message = "Last name is mandatory")
    String lastName;
    @JsonProperty("email")
    @NotNull(message = "Email is mandatory")
    @Email(message = "Invalid email format")
    @UniqueEmail(message = "Email is already in use")
    String email;
    @JsonProperty("password")
    @NotNull(message = "Password is mandatory")
    String password;
    @JsonProperty("title")
    String title;
    @JsonProperty("organization")
    String organization;

    // Custom constructor to map from AppUser entity
    public AppUserDTO(AppUser appUser) {
        this.firstName = appUser.getFirstName();
        this.lastName = appUser.getLastName();
        this.email = appUser.getEmail();
        this.title = appUser.getTitle();
        this.organization = appUser.getOrganization();
    }
}
