package com.paytech.bpr.Repository;

import com.paytech.bpr.Entity.Pendidikan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PendidikanRepository extends CrudRepository<Pendidikan, String> {
public List<Pendidikan> findAll();
}
