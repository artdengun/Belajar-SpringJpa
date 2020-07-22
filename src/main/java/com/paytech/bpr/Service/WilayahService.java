package com.paytech.bpr.Service;

import com.paytech.bpr.Entity.KotaKabupaten;
import com.paytech.bpr.Entity.Provinsi;
import com.paytech.bpr.Repository.KotaKabupatenRepository;
import com.paytech.bpr.Repository.ProvinsiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class WilayahService {
    @Autowired
    private KotaKabupatenRepository kotaKabupatenRepository;
    @Autowired
    private ProvinsiRepository provinsiRepository;

    public List<Provinsi> findAllProvinsi(){
        return  this.provinsiRepository.findAll();
    }

    public List<KotaKabupaten> findAllKotaKabupaten(){
        return  this.kotaKabupatenRepository.findAll();
    }

    public Provinsi findProvinsiById(String id) {
        return  this.provinsiRepository.findAllById(id);
    }
}
