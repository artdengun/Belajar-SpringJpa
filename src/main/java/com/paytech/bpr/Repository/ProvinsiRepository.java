package com.paytech.bpr.Repository;

import com.paytech.bpr.Entity.Provinsi;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProvinsiRepository extends CrudRepository<Provinsi, String> {
    public List<Provinsi> findAll();

    public  Provinsi findAllById(String id);
}
