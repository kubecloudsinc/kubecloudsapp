package io.kubecloudsinc.kubecloudsapp.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter public class JobHistoryDTO {
    @JsonProperty("startDate") private String startDate;
    @JsonProperty("endDate") private String endDate;
    @JsonProperty("job") private JobDTO job;

}
