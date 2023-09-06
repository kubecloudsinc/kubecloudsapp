package io.kubecloudsinc.kubecloudsapp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JobDTO {
    @JsonProperty("jobId") private String jobId;
    @JsonProperty("title") private String title;

}
