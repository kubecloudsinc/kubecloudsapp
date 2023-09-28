package io.kubecloudsinc.kubecloudsapp.model;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "AUTOTOOL_USER")
public class AutotoolUser implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "ORGANIZATION")
    private String organization;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "CREATE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;

    @Column(name = "PASSWORD_DIGEST")
    private String passwordDigest;

    @Column(name = "ADMIN")
    private boolean admin;

    @Column(name = "ENABLED")
    private boolean enabled;

    @Column(name = "VERSION")
    private Integer version;

    @Column(name = "TOTAL_HITS")
    private Integer totalHits;

}

