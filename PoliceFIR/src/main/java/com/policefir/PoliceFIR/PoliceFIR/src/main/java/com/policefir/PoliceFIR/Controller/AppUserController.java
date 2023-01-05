package com.policefir.PoliceFIR.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.policefir.PoliceFIR.Entity.AppUserEntity;
import com.policefir.PoliceFIR.Entity.ComplaintEntity;
import com.policefir.PoliceFIR.Service.IUSerService;
import com.policefir.PoliceFIR.dto.LoginDTO;


@Controller
//create,update,delete
@RestController
@RequestMapping("/user")
public class AppUserController {
	@Autowired
	private IUSerService  service;
	@PostMapping("/create")
	public AppUserEntity createUser(@RequestBody AppUserEntity entity) {
		AppUserEntity createUser= this.service.updateUser(entity);
		return createUser;
	}
	@PutMapping("/update")
	public AppUserEntity updateUser(@RequestBody AppUserEntity entity) {
		AppUserEntity updateUser=this.service.updateUser(entity);
		return updateUser;
	}
	@GetMapping("/get")
	public List<AppUserEntity> getAllUser(){
		List<AppUserEntity>allUser =this.service.getAllUsers();
		return allUser;
		}
	
	
	//Lodge Complaint
	@PutMapping("/addc")
	private ComplaintEntity addComplaint(@RequestBody ComplaintEntity complaint){
		ComplaintEntity addcomplaint=this.service.addComplaint(complaint);
		return addcomplaint;
		}
	//Withdraw Complaint
	@DeleteMapping("/delete/{id}")
	public String withdrawComplaint(@PathVariable("id")Long id) {
		String withdrawComplaint = this.service.withdrawComplaint(id);
		return withdrawComplaint;
		}
	

	}
