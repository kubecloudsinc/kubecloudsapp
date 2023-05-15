package io.kubecloudsinc.kubecloudsapp.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "LOCATIONS")
public class Location implements Serializable {

    @Id
    @Column(name = "LOCATION_ID", nullable = false)
    private Long id;
    @Column(name = "CITY")
    private String city;
    @Column(name = "COUNTRY_ID", length = 2)
    private String countryId;
    @Column(name = "POSTAL_CODE")
    private Long postalCode;
    @Column(name = "STATE_PROVINCE")
    private String stateProvince;
    @Column(name = "STREET_ADDRESS")
    private String streetAddress;

/*    @ManyToOne
    @JoinColumn(name = "COUNTRY_ID", referencedColumnName = "COUNTRY_ID", insertable = false, updatable = false)
    private Country country;*/


}