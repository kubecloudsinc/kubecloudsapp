package io.kubecloudsinc.kubecloudsapp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LocationDTO {
    @JsonProperty("locationId")
    Long locationId;
    @JsonProperty("city")
    String city;
    @JsonProperty("postalCode")
    String postalCode;
    @JsonProperty("stateProvince")
    String stateProvince;
    @JsonProperty("streetAddress")
    String streetAddress;
    @JsonProperty("country")
    CountryDTO country;
}
