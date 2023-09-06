package io.kubecloudsinc.kubecloudsapp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ManagerDTO {
    @JsonProperty("managerId")
    private String managerId;
    @JsonProperty("managerFirst")
    private String managerFirst;
    @JsonProperty("managerLast")
    private String managerLast;
}
