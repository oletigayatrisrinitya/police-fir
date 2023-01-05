package com.policefir.PoliceFIR.Service.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.policefir.PoliceFIR.Repo.AppUserRepo;
import com.policefir.PoliceFIR.Service.LoginService;

@Service
public class LoginServiceImp implements LoginService {
	
@Autowired
private AppUserRepo repo;

@Override
public String login(String username, String password) {

	return "Login Successfull";
}

}