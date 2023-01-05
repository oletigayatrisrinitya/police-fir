package com.policefir.PoliceFIR.Service.Implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.policefir.PoliceFIR.Entity.AppUserEntity;
import com.policefir.PoliceFIR.Entity.ComplaintEntity;
import com.policefir.PoliceFIR.Exception.AppUserException;
import com.policefir.PoliceFIR.Repo.AppUserRepo;
import com.policefir.PoliceFIR.Repo.ComplaintRepo;
import com.policefir.PoliceFIR.Service.IUSerService;
import com.policefir.PoliceFIR.dto.LoginDTO;
@Service
public class IUserServiceImp implements IUSerService {
	@Autowired
    private AppUserRepo repo;
    @Autowired
    private ComplaintRepo repo1;


    @Override
    public ComplaintEntity addComplaint(ComplaintEntity complaint) {
        // TODO Auto-generated method stub
        ComplaintEntity save = this.repo1.save(complaint);

 

        return save;
    }

 

    @Override
    public String withdrawComplaint(Long id) {
        // TODO Auto-generated method stub
        this.repo1.deleteById(id);
        return "Complaint Has Been Withdrawn";

 

    }

 

    @Override
    public AppUserEntity addUser(AppUserEntity user) {
        // TODO Auto-generated method stub
        AppUserEntity save = this.repo.save(user);
        return save;
    }

 

    @Override
    public String deleteUser(Long id) {
        // TODO Auto-generated method stub
        this.repo.deleteById(id);
        return "User Delete";
    }

 

    @Override
    public AppUserEntity updateUser(AppUserEntity entity) {
        // TODO Auto-generated method stub
        AppUserEntity save = this.repo.save(entity);
        return save;
    }

 

    @Override
    public AppUserEntity getUserById(Long id) {
        // TODO Auto-generated method stub
        AppUserEntity appUserEntity = this.repo.findById(id).get();
        return appUserEntity;
    }

 

    @Override
    public List<AppUserEntity> getAllUsers() {
        // TODO Auto-generated method stub
        List<AppUserEntity> findAll = this.repo.findAll();
        return findAll;
    }
}