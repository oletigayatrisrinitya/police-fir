package com.policefir.PoliceFIR.Controller;
import com.policefir.PoliceFIR.dto.LoginDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.policefir.PoliceFIR.Entity.AppUserEntity;
import com.policefir.PoliceFIR.Entity.ComplaintEntity;
import com.policefir.PoliceFIR.Exception.AppUserException;
import com.policefir.PoliceFIR.Service.IUSerService;
import com.policefir.PoliceFIR.Service.LoginService;
import com.policefir.PoliceFIR.dto.LoginDTO;
@CrossOrigin
@Controller
@RestController
@RequestMapping("/AppUserlogin")
public class UserController {
@Autowired
private LoginService service;
@Autowired
private IUSerService uservice;
@PostMapping("/validate")
public String validate (@RequestBody LoginDTO dto){
	
	String login = this.service.login(dto.getUserName(), dto.getPassword());
	return login;
	}
@PostMapping("/addComplaint")
public ComplaintEntity createNewComplaint(@RequestBody ComplaintEntity complaint) {
	return uservice.addComplaint(complaint);
}
}
