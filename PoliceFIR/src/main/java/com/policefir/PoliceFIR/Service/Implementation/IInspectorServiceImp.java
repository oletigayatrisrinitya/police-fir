package com.policefir.PoliceFIR.Service.Implementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.policefir.PoliceFIR.Entity.ComplaintEntity;
import com.policefir.PoliceFIR.Repo.ComplaintRepo;
import com.policefir.PoliceFIR.Repo.OfficerRepo;
import com.policefir.PoliceFIR.Service.IInspectorService;

public class IInspectorServiceImp implements IInspectorService {
	@Autowired
	private ComplaintRepo complaintRepo;
	@Autowired
	private OfficerRepo officerRepo;
	
	@Override
	public void assignOfficerToComplaint(Long id,Long complaintId) {
		ComplaintEntity complaintEntity = this.complaintRepo.findById(complaintId).get();
		complaintEntity.setComplaintId(complaintId);
		complaintEntity.setCrimeType(complaintEntity.getCrimeType());
		complaintEntity.setDetails(complaintEntity.getDetails());
		complaintEntity.setDateOfComplaint(complaintEntity.getDateOfComplaint());
		complaintEntity.setUserName(complaintEntity.getUserName());
		complaintEntity.setPriority(complaintEntity.getPriority());
		complaintEntity.setOfficerId(complaintEntity.getOfficerId());
		complaintEntity.setStationId(complaintEntity.getStationId());
		complaintEntity.setStatus(complaintEntity.getStatus());
	
		}

	@Override
	public void updateComplaint(Long complaintId) {
		// TODO Auto-generated method stub
		
	}
	}