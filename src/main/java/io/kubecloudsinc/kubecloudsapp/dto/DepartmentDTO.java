package io.kubecloudsinc.kubecloudsapp.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DepartmentDTO {
    @JsonProperty("departmentId")
    Integer departmentId;
    @JsonProperty("departmentName")
    String departmentName;
    @JsonProperty("locationId")
    Integer locationId;

}
