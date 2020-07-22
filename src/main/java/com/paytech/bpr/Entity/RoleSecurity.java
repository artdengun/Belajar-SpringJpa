package com.paytech.bpr.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "roles", schema = "security")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoleSecurity {

    @Id
    @SequenceGenerator(name = "role_security", schema = "security",
            allocationSize = 1,
            initialValue = 1,
            sequenceName = "role_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "role_security_seq")
    @Column(name = "role_id", nullable = false, unique = true)
    private Long id;
    @Column(name = "role_name", nullable = false, unique = true, length = 20)
    private String nama;
    @Column(name = "created_by", length = 50)
    private  String createdBy;
    @Column(name = "created_date" , nullable = false)
    private Timestamp createdDate;
}
