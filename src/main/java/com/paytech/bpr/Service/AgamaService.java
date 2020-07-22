/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paytech.bpr.Service;

import com.paytech.bpr.Entity.Agama;
import com.paytech.bpr.Repository.AgamaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author denigunawan
 */
@Service
@Transactional(readOnly = true)
public class AgamaService {
    
    @Autowired
    private AgamaRepository repo;
    
    @Transactional(readOnly = false)
    public Agama save(Agama x ) {
      return  repo.save(x);
    }

    public Optional<Agama> findById(String kode ) {
        return  repo.findById(kode);
    }

    public List<Agama> findAll(){  return this.repo.findAll();  }
    @Transactional(readOnly = false)
    public void  delete(Agama x){
        this.repo.delete(x);
    }
    @Transactional(readOnly = false)
    public void delete(String x) { // delete by id
        this.repo.deleteById(x);
    }

    @Transactional(readOnly = false)
    public void delete(List<Agama> list ) {
        this.repo.deleteAll(list);
    }

    public Agama findByNama(String nama ) {
        return this.repo.findByNama(nama);
    }

    public  List<Agama> mencariBerdasarkanNamaAtauDeskripsi(String input){
        return this.repo.findByNamaOrDeskripsi(input, input);
    }

    public void updateById(String id, String budha, String agama) {
    }

//    @Transactional(readOnly = false)
//    public void updateById(String id, String nama, String description){
//        this.repo.updateNamaAndDescription(id,nama,description);
//    }
}
