package com.paytech.bpr.Service;


import com.paytech.bpr.Entity.Nasabah;
import com.paytech.bpr.Entity.NasabahBadanUsaha;
import com.paytech.bpr.Entity.NasabahPerorangan;
import com.paytech.bpr.Repository.NasabahBadanUsahaRepository;
import com.paytech.bpr.Repository.NasabahPeroranganRepository;
import com.paytech.bpr.Repository.NasabahRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional(readOnly = true
)
public class NasabahService {
    @Autowired
    private NasabahRepository nasabahRepository;
    @Autowired
    private NasabahBadanUsahaRepository nasabahBadanUsahaRepository;
    @Autowired
    private NasabahPeroranganRepository nasabahPeroranganRepository;

    @Transactional
    public Nasabah save(Nasabah nasabah) {
        return this.nasabahRepository.save(nasabah);
    }
    @Transactional
    public NasabahPerorangan save(NasabahPerorangan nasabah){
        return  this.nasabahRepository.save(nasabah);
    }
    @Transactional
    public NasabahBadanUsaha save(NasabahBadanUsaha nasabah) {
        return  this.nasabahRepository.save(nasabah);
    }
    @Transactional
    public  void  delete(Nasabah nasabah){
        this.nasabahRepository.delete(nasabah);
    }



//   public NasabahPerorangan findPeroranganById(String id ) {
//        return this.nasabahPeroranganRepository.findById(id);
//   }
//
//   public Optional<NasabahBadanUsaha> findBadanUsahaById(String id ) {
//        return this.nasabahBadanUsahaRepository.findById(id);
//   }
}
