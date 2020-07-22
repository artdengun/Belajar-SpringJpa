package com.paytech.bpr.Repository;


import com.paytech.bpr.Entity.UserSecurity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<UserSecurity, String> {

    List<UserSecurity> findAll();

    UserSecurity findByName(String username);
}
