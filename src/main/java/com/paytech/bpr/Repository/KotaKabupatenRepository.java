package com.paytech.bpr.Repository;

import com.paytech.bpr.Entity.KotaKabupaten;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KotaKabupatenRepository extends CrudRepository<KotaKabupaten, String > {
    public List<KotaKabupaten> findAll();
}
