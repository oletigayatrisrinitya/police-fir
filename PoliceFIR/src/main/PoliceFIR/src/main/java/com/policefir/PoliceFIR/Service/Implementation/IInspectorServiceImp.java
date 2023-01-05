package com.policefir.PoliceFIR.Service.Implementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.policefir.PoliceFIR.Entity.ComplaintEntity;
import com.policefir.PoliceFIR.Entity.OfficerEntity;
import com.policefir.PoliceFIR.Repo.ComplaintRepo;
import com.policefir.PoliceFIR.Repo.OfficerRepo;
import com.policefir.PoliceFIR.Service.IInspectorService;
@Service
public class IInspectorServiceImp implements IInspectorService {
	@Autowired
	private ComplaintRepo complaintRepo;
	@Autowired
	private OfficerRepo officerRepo;
	
	@Override
	public String assignOfficerToComplaint(Long id,Long complaintId) {
		ComplaintEntity complaintEntity = this.complaintRepo.findById(complaintId).get();
		complaintEntity.setComplaintId(complaintId);
		complaintEntity.setCrimeType(complaintEntity.getCrimeType());
		complaintEntity.setDetails(complaintEntity.getDetails());
		complaintEntity.setDateOfComplaint(complaintEntity.getDateOfComplaint());
		complaintEntity.setUserName(complaintEntity.getUserName());
		complaintEntity.setPriority(complaintEntity.getPriority());
		complaintEntity.setOfficerId(id);
		OfficerEntity officerEntity = this.officerRepo.findById(id).get();
		complaintEntity.setStationId(complaintEntity.getStationId());
		complaintEntity.setStatus(complaintEntity.getStatus());
		
		ComplaintEntity save = this.complaintRepo.save(complaintEntity);
	String str = "complaint no "+save.getComplaintId()+" is assigned to "+officerEntity.getName()+"";
     return str;
		}

	
		@Override
		public String updateComplaint(Long complaintId) {
			ComplaintEntity complaintEntity = this.complaintRepo.findById(complaintId).get();
			complaintEntity.setComplaintId(complaintId);
			ComplaintEntity save = this.complaintRepo.save(complaintEntity);
			String str = "complaint id" +save.getComplaintId()+"complaint updated to"+complaintEntity.getComplaintId()+"";
			return str;

		}
}