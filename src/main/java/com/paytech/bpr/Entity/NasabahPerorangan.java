package com.paytech.bpr.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class NasabahPerorangan extends Nasabah {
    @Column(name = "nomor_identitas", length = 64)
    private String nomerIdentitas;
    @Column(name = "jenis_kelamin", length = 1)
    private String jenisKelamin;
}
