package com.policefir.PoliceFIR.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.policefir.PoliceFIR.Entity.OfficerEntity;
import com.policefir.PoliceFIR.Service.IOfficerService;

@RestController
@RequestMapping("/officer")
public class OfficerController<OfficerComplaint> {
	@Autowired
	private IOfficerService  service;
	@PostMapping("/add")
	private OfficerEntity addOfficer(@RequestBody OfficerEntity entity)   
	{  
	    OfficerEntity addOfficer=this.service.addOfficer(entity);
	    return addOfficer;
	}  

	@PutMapping("/update")
	public OfficerEntity updateComplaint(@RequestBody OfficerEntity entity) {
		OfficerEntity updateComplaint=this.service.updateComplaint(entity);
		return updateComplaint;
	}
}