package io.kubecloudsinc.kubecloudsapp.model;


import lombok.Data;
import lombok.Generated;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Data
@Entity
@Table(name = "AUTOTOOL_USER")
public class AutoToolUser implements Serializable {
    @Id
    @GeneratedValue(generator="USER_ID_SEQ")
    @SequenceGenerator(name="USER_ID_SEQ",sequenceName="USER_ID_SEQ",allocationSize = 1)
    @Column(name = "ID")
    private Integer id;
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
    private Date createDate;
    @Column(name = "PASSWORD_DIGEST")
    private String passwordDigest;
    @Column(name = "ENABLED")
    private Integer enabled;
    @Column(name = "VERSION")
    private Integer version;
    @Column(name = "TOTAL_HITS")
    private Integer totalHits;
}
