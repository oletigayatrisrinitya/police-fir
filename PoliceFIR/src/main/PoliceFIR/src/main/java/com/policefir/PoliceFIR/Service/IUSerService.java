package com.policefir.PoliceFIR.Service;

import java.util.List;

import com.policefir.PoliceFIR.Entity.AppUserEntity;
import com.policefir.PoliceFIR.Entity.ComplaintEntity;
import com.policefir.PoliceFIR.Exception.AppUserException;
import com.policefir.PoliceFIR.dto.LoginDTO;


public interface IUSerService  {

	public AppUserEntity addUser(AppUserEntity user);
	public String deleteUser(Long id);
	public AppUserEntity updateUser(AppUserEntity entity);
	public AppUserEntity getUserById(Long id);
	public List<AppUserEntity> getAllUsers();
	public ComplaintEntity addComplaint(ComplaintEntity complaint);
	public String withdrawComplaint(Long id);
	
	
	
	
	
	
}
	