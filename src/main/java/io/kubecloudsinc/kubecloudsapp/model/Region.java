package io.kubecloudsinc.kubecloudsapp.model;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "REGIONS")
public class Region implements Serializable {
    @Id
    @Column(name = "REGION_ID")
    private Integer regionId;
    @Column(name = "REGION_NAME")
    private String regionName;
}