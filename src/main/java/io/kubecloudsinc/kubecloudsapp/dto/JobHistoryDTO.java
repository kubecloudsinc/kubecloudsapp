package io.kubecloudsinc.kubecloudsapp.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JobHistoryDTO {
    @JsonProperty("startDate")
    String startDate;
    @JsonProperty("endDate")
    String endDate;
}
