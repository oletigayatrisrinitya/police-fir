package com.policefir.PoliceFIR.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.policefir.PoliceFIR.Entity.AppUserEntity;
import com.policefir.PoliceFIR.Exception.AppUserException;
import com.policefir.PoliceFIR.Service.IUSerService;
import com.policefir.PoliceFIR.dto.LoginDTO;
@CrossOrigin
@RestController
@RequestMapping("/AppUserlogin")
public class UserController {
@Autowired
private IUSerService service;
@PostMapping("/validate")
public ResponseEntity<?> validate (@RequestBody LoginDTO dto){
	System.out.println(dto);
	AppUserEntity appuser = service.validate(dto);
	if (appuser==null)
		return AppUserEntity.badRequest().body("Incorrect userName Or Password");
	return ResponseEntity.ok(appuser);
	}
@PostMapping("/register")
public ResponseEntity<AppUserEntity> createNewAppUser(@RequestBody AppUserEntity appuser) throws AppUserException{
return new ResponseEntity<AppUserEntity>(service.register(appuser),HttpStatus.CREATED);
}


}
