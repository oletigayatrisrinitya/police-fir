package com.policefir.PoliceFIR.Service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.policefir.PoliceFIR.Entity.AppUserEntity;
import com.policefir.PoliceFIR.Entity.ComplaintEntity;
import com.policefir.PoliceFIR.Exception.AppUserException;
import com.policefir.PoliceFIR.Repo.AppUserRepo;
import com.policefir.PoliceFIR.Service.IUSerService;
//import com.policefir.PoliceFIR.Service.LoginDTO;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

public class LoginServiceImp implements IUSerService {
@Autowired
private AppUserRepo repo;
@Override
public AppUserEntity validate(LoginDTO dto) {
AppUserEntity appuser = repo.findById(dto.getUserName()).orElse(null);
if(appuser!=null && appuser.getPassword().equals(dto.getPassword()))
	return appuser;
return null;
}
@Override
public AppUserEntity register(AppUserEntity appuser) throws AppUserException {
	Optional<AppUserEntity>existingAppUser=repo.findById(appuser.getUsername());
	if(existingAppUser.isPresent()){
		throw new AppUserException("User is Already Registred");
		}else {
			return repo.save(appuser);
			}
	// TODO Auto-generated method stub
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
return null;
}
@Override
public AppUserEntity validate(LoginDTO dto) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public <UserEntity> List<UserEntity> getAllUser() {
	// TODO Auto-generated method stub
	return null;
}
@Override
public String deleteUser(Long id) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public AppUserEntity updateUser(AppUserEntity entity) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public AppUserEntity createUser(AppUserEntity entity) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public List<AppUserEntity> getAllUsers() {
	// TODO Auto-generated method stub
	return null;
}
@Override
public AppUserEntity getAllUsersById(Long id) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public ComplaintEntity addComplaint(ComplaintEntity complaint) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public String withdrawComplaint(Long id) {
	// TODO Auto-generated method stub
	return null;
}
}