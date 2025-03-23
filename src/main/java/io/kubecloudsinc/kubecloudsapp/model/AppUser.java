package io.kubecloudsinc.kubecloudsapp.model;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "AUTO_TOOL_USER")
public class AppUser implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private Long userId;

    @Column(name = "FIRST_NAME", nullable = false, length = 50)
    private String firstName;

    @Column(name = "LAST_NAME", nullable = false, length = 50)
    private String lastName;

    @Column(name = "EMAIL", nullable = false, length = 50)
    private String email;

    @Column(name = "PASSWORD", nullable = false, length = 10)
    private String password;

    @Column(name = "TITLE", length = 5)
    private String title;

    @Column(name = "ORGANIZATION", length = 50)
    private String organization;

    @Column(name = "ADDED_DATE")
    @Temporal(TemporalType.DATE)
    private Date addedDate;

    @Column(name = "TOTAL_HITS")
    private Long totalHits;
}
