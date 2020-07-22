package com.paytech.bpr.Repository;

import com.paytech.bpr.Entity.NasabahPerorangan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



public interface NasabahPeroranganRepository extends CrudRepository<NasabahPerorangan, String> {
}