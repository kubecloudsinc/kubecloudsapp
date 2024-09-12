package io.kubecloudsinc.kubecloudsapp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "job_history")
@Getter
@Setter
public class JobHistory {

    @EmbeddedId
    private JobHistoryId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id", insertable = false, updatable = false)
    private Employee employee;

    @Column(name = "start_date", nullable = false, insertable = false, updatable = false)
    private Date startDate;

    @Column(name = "end_date", nullable = false)
    private Date endDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "job_id", nullable = false)
    private Job job;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id")
    private Department department;
}

