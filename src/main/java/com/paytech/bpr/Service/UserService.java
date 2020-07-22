package com.paytech.bpr.Service;

import com.paytech.bpr.Entity.RoleSecurity;
import com.paytech.bpr.Entity.UserSecurity;
import com.paytech.bpr.Repository.RoleRepository;
import com.paytech.bpr.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;

    public List<RoleSecurity> listRole() {
        return  this.roleRepository.findAll();
    }

    public List<UserSecurity> findUser() {
        return  this.userRepository.findAll();
    }

    public UserSecurity findByUserName(String username) {
        return  this.userRepository.findByName(username);
    }
}
