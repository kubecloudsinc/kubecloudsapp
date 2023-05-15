package io.kubecloudsinc.kubecloudsapp.model;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "COUNTRIES")
public class Country implements Serializable {
    @Id
    @Column(name = "COUNTRY_ID")
    private Integer countryId;
    @Column(name = "COUNTRY_NAME")
    private String countryName;
    @Column(name = "REGION_ID")
    private Integer regionId;
}
