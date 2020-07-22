package com.paytech.bpr.Repository;

import com.paytech.bpr.Entity.Agama;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AgamaRepository  extends CrudRepository<Agama, String>{
    public List<Agama> findAll();
    public Agama findByNama(String namaAgama); // clas modif ini boleh beda parameternya
    // mengambil data berdasarkan nama dan deksirpsi

    public  List<Agama> findByNamaOrDeskripsi(String nama, String deskripsi);

//    // update by query dengan nilai tertentu
//    @Modifying
//    @Query("update Agama set nama = ?1, deskripsi = ?2 where id = ?3")
//    public int updateNamaAndDescription(String nama, String description, String id);
//

}
