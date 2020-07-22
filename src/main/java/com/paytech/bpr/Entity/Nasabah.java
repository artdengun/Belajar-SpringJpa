package com.paytech.bpr.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "data_nasabah", schema = "nasabah")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipe_nasabah", discriminatorType = DiscriminatorType.STRING, length = 50)
public class Nasabah {

    @Id
    @GenericGenerator(name = "nasabah_uuid", strategy = "uuid2")
    @GeneratedValue(generator = "nasabah_uuid")
    @Column(name = "nasabah_id", nullable = false, unique = true, length = 64)
    private String id;
    @Column(name = "nama_lengkap" , nullable = false, length = 50)
    private  String namaLengkap;
    @Column(name = "alamat_RUMAH")
    private String alamat;
}
