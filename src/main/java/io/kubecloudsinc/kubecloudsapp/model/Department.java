package io.kubecloudsinc.kubecloudsapp.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "DEPARTMENTS")
@Data
public class Department  implements Serializable {
    @Id
    @Column(name = "DEPARTMENT_ID", nullable = false)
    private Integer departmentId;
    @Column(name = "DEPARTMENT_NAME")
    private String departmentName;
    @Column(name = "LOCATION_ID")
    private Integer locationId;
    @Column(name = "MANAGER_ID")
    private Integer managerId;

}