package com.paytech.bpr.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.management.relation.Role;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users", schema = "security")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "listRole") // agar bisa dimapping oleh lombok
public class UserSecurity {

    @Id
    @GenericGenerator(name = "userid_uuid" , strategy = "uuid2")
    @GeneratedValue(generator = "userid_uuid")
    @Column(name = "user_id", length = 64, nullable = false, unique = true)
    private String id;
    @Column(name = "username", nullable = false, unique = true, length = 150)
    private String name;
    @Column(name = "password", nullable = false)
    private  String password;
    @Column(name = "is_active", nullable = false)
    private Boolean active;
    @Column(name = "created_by")
    private String createdBy;
    @Column(name = "created_date", nullable = false)
    private Timestamp createdDate;
    @OneToMany // perlu to string jika menggunakan array
    @JoinTable(name = "user_roles", joinColumns =
        @JoinColumn(name = "user_id", nullable = false),
        inverseJoinColumns = @JoinColumn(name = "role_id", nullable = false),
            schema = "security"
    ) // pake join table untuk oneToMany
    private List<RoleSecurity> listRole = new ArrayList<>(); // ini yang akan dimapping
}
