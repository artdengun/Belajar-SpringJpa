package com.paytech.bpr.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "master_provinsi")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Provinsi {

    @Id
    @GenericGenerator(name = "uuid_provinsi", strategy = "uuid2")
    @GeneratedValue(generator = "uuid_provinsi")
    @Column(name = "kode_provinsi", nullable = false , unique = true, length = 50)
    private  String id;
    @Column(name = "nama_provinsi", nullable = false , length = 50)
    private String nama;
    @Column(name = "created_date", nullable = false)
    private Timestamp createdDate;
    @Column(name = "created_by ", length = 20)
    private String createdBy;

}
