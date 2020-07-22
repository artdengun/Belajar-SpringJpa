/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paytech.bpr.Entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name= "master_agama")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Agama {
    @Id
    @GenericGenerator(name = "agama_id", strategy = "uuid2")
    @GeneratedValue(generator = "agama_id")
    
    @Column(name = "kode_agama", nullable = false, unique = true)
    private String id;
    
    @Column(name="nama", nullable = false, unique = true, length = 50)
    private String nama;
    
    @Column(name="deskripsi")
    private String deskripsi;

    @Column(name = "created_date")
    private Timestamp createdDate;
    
    @Column(name="created_by")
    private String createdBy;
}
