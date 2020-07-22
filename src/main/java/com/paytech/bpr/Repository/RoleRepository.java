package com.paytech.bpr.Repository;


import com.paytech.bpr.Entity.RoleSecurity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository extends CrudRepository<RoleSecurity, Long> {
    List<RoleSecurity> findAll();



}
