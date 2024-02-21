package io.kubecloudsinc.kubecloudsapp.model;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "COUNTRIES")
public class Country implements Serializable {
    @Id
    @Column(name = "COUNTRY_ID")
    private String countryId;
    @Column(name = "COUNTRY_NAME")
    private String countryName;
    @Column(name = "REGION_ID")
    private Integer regionId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "REGION_ID", referencedColumnName = "REGION_ID", insertable = false, updatable = false)
    private Region region;
}
