package com.paytech.bpr.Service;

import com.paytech.bpr.Entity.Pendidikan;
import com.paytech.bpr.Repository.PendidikanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class PendidikanService {

    @Autowired
    private PendidikanRepository repo;


    @Transactional(readOnly = false)
    public Pendidikan save(Pendidikan p ){
        return  this.repo.save(p);
    }

    public Optional<Pendidikan> findById(String id) {
        return this.repo.findById(id);
    }

    public List<Pendidikan> findAll(){
        return this.repo.findAll();
    }
    @Transactional(readOnly = false)
    public void delete(Pendidikan p){
        this.repo.delete(p);
    }
    @Transactional(readOnly = false)
    public  void delete(String id){
        this.repo.deleteById(id);
    }
    @Transactional(readOnly = false)
    public void delete(List<Pendidikan> list){
         this.repo.deleteAll(list);
    }

}
