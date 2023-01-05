package com.policefir.PoliceFIR.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.policefir.PoliceFIR.Entity.OfficerEntity;
import com.policefir.PoliceFIR.Model.OfficerModel;
import com.policefir.PoliceFIR.Service.IOfficerService;
@Controller

@RestController
@RequestMapping("/officer")
public class OfficerController<OfficerComplaint> {
	@Autowired
	private IOfficerService  service;
	@PostMapping("/add")
	private OfficerModel addOfficer(@RequestBody OfficerModel entity)   
	{  
		OfficerModel addOfficer=this.service.addOfficer(entity);
	    return addOfficer;
	}  

	@PutMapping("/update")
	public OfficerModel updateComplaint(@RequestBody OfficerModel entity) {
		OfficerModel updateComplaint=this.service.updateComplaint(entity);
		return updateComplaint;
	}
}