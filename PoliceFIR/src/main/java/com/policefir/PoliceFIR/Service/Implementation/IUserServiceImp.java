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
	private Object repo1;

	@Override
	public AppUserEntity validate(LoginDTO dto) {
		// TODO Auto-generated method stub
		AppUserEntity appuser = repo.findById(dto.getUserName()).orElse(null);

		if(appuser!=null && appuser.getPassword().equals(dto.getPassword()))

		return appuser;
		return null;
	}

	@Override
	public AppUserEntity register(AppUserEntity appuser) throws AppUserException {
		// TODO Auto-generated method stub
		Optional<AppUserEntity>existingAppUser=repo.findById(appuser.getUsername());
		if(existingAppUser.isPresent()){
			throw new AppUserException("User is Already Registred");
			}else {
				return repo.save(appuser);
				}
		// TODO Auto-generated method stub
		}
		return null;
	}
}
@Override
	public void login() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void register() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AppUserEntity addUser(AppUserEntity user) {
		// TODO Auto-generated method stub
		AppUserEntity save=this.repo.save(user);
		return save;
	}

	@Override
	public <AppUserEntity> List<AppUserEntity> getAllUser() {
		// TODO Auto-generated method stub
		List<AppUserEntity>list=(List<AppUserEntity>)this.repo.findAll();
		return list;
	}

	@Override
	public String deleteUser(Long id) {
		// TODO Auto-generated method stub
		this.repo.deleteById(id);
		return "data has been deleted";
	}

	@Override
	public AppUserEntity updateUser(AppUserEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AppUserEntity> getAllUsers() {
		// TODO Auto-generated method stub
		List<AppUserEntity> userlist=this.repo.findAll();

		return userlist;

		}
		
	@Override
	public AppUserEntity getAllUsersById(Long id) {
		// TODO Auto-generated method stub
		AppUserEntity appUserEntity = this.repo.findById(id).get();

		return appUserEntity;
	}

	@Override
	public ComplaintEntity addComplaint(ComplaintEntity complaint) {
		// TODO Auto-generated method stub
		ComplaintEntity save = this.repo1.save(complaint);

		return save;
	}

	@Override
	public String withdrawComplaint(Long id) {
		// TODO Auto-generated method stub
		this.repo1.deleteById(complaintId);
		return "Complaint Has Been Withdrawn";

		}

	
	}
