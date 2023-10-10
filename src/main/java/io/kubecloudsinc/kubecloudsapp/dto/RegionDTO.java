package io.kubecloudsinc.kubecloudsapp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegionDTO {
    @JsonProperty("regionId")
    Integer regionId;
    @JsonProperty("regionName")
    String regionName;
}
