package com.paytech.bpr.Repository;

import com.paytech.bpr.Entity.Nasabah;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface NasabahRepository extends CrudRepository<Nasabah, String> {


}
