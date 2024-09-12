package io.kubecloudsinc.kubecloudsapp.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Component
@Table(name = "JOBS")
@Data
public class Job {
    @Id
    @Column(name = "JOB_ID", nullable = false)
    Integer jobId;
    @Column(name = "JOB_TITLE")
    String jobTitle;
    @Column(name = "MIN_SALARY")
    String minSalary;
    @Column(name = "MAX_SALARY")
    String maxSalary;
}
