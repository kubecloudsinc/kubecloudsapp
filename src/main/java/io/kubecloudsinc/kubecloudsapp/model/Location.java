package io.kubecloudsinc.kubecloudsapp.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "LOCATIONS")
public class Location implements Serializable {

    @Id
    @Column(name = "LOCATION_ID", nullable = false)
    private Long locationId;
    @Column(name = "CITY")
    private String city;
    @Column(name = "POSTAL_CODE")
    private String postalCode;
    @Column(name = "STATE_PROVINCE")
    private String stateProvince;
    @Column(name = "STREET_ADDRESS")
    private String streetAddress;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COUNTRY_ID", referencedColumnName = "COUNTRY_ID")
    private Country country;

}