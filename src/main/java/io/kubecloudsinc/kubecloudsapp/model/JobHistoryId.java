package io.kubecloudsinc.kubecloudsapp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

@Embeddable
@Getter
@Setter
public class JobHistoryId implements Serializable {

    @Column(name = "employee_id")
    private Long employeeId;

    @Column(name = "start_date")
    private Date startDate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobHistoryId that = (JobHistoryId) o;
        return Objects.equals(employeeId, that.employeeId) &&
                Objects.equals(startDate, that.startDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, startDate);
    }
}

