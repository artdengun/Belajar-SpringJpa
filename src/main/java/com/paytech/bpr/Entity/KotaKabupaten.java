package com.paytech.bpr.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "master_kota_kabupaten")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class KotaKabupaten {

    @Id
    @GenericGenerator(name = "uuid_kotakab", strategy = "uuid2")
    @GeneratedValue(generator = "uuid_kotakab")
    @Column(name = "kode_kota", nullable = false, unique = true , length = 50)
    private String id;
    @Column(name = "nama_kota", nullable = false, length = 50)
    private String nama;
    @Column(name = "created_date", nullable = false)
    private Timestamp createdDate;
    @Column(name = "created_by")
    private String createdby;

    @OneToOne // berelasi dengan satu column , jika ke entity lain pake join column
    @JoinColumn(name = "provinsi_id", nullable = false)
    private Provinsi provinsi;
}
