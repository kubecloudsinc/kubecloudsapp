package io.kubecloudsinc.kubecloudsapp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CountryDTO {
    @JsonProperty("countryId")
    String countryId;
    @JsonProperty("countryName")
    String countryName;
    @JsonProperty("regionId")
    Integer regionId;
    @JsonProperty("region")
    RegionDTO region;
}
