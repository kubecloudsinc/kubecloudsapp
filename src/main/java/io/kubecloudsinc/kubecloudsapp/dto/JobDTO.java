package io.kubecloudsinc.kubecloudsapp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class JobDTO {
    @JsonProperty("jobId")  String jobId;
    @JsonProperty("jobTitle")  String jobTitle;

}
