package com.policefir.PoliceFIR.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.policefir.PoliceFIR.Service.IInspectorService;
@Controller
@RestController
@RequestMapping("/AssignOfficerToComplaint")

public class InspectorController {
	@Autowired
	IInspectorService iInspectorService;
	
	@PutMapping("/update/{complaintId}/{complaintId}")
	public String updateComplaint(@PathVariable("complaintId") Long oId, @PathVariable ("Updated complaintId") Long uId) {
		String updateComplaint = this.iInspectorService.updateComplaint(oId);
		return updateComplaint;
	}

	@GetMapping("/officer/{officerId}/{camplaintId}")
	public String assignComplaintToOfficer(@PathVariable ("officerId") Long cId,@PathVariable ("camplaintId") Long oId) {
		
		String assignOfficerToComplaint = this.iInspectorService.assignOfficerToComplaint(cId, oId);
		return assignOfficerToComplaint;
	}
	
	
}

