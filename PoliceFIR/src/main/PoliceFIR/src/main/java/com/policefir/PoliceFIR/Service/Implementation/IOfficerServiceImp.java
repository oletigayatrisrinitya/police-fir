package com.policefir.PoliceFIR.Service.Implementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.policefir.PoliceFIR.Entity.ComplaintEntity;
import com.policefir.PoliceFIR.Entity.OfficerEntity;
import com.policefir.PoliceFIR.Model.OfficerModel;
import com.policefir.PoliceFIR.Repo.ComplaintRepo;
import com.policefir.PoliceFIR.Repo.OfficerRepo;
import com.policefir.PoliceFIR.Service.IOfficerService;

@Service
public  class IOfficerServiceImp implements IOfficerService {
	@Autowired
	private OfficerRepo repo;
	@Autowired
private ComplaintRepo cRepo; 
@Override
public OfficerModel addOfficer(OfficerModel entity) {
	// TODO Auto-generated method stub
	OfficerEntity officerEntity=new OfficerEntity();
	officerEntity.setId(entity.getId());
	officerEntity.setName(entity.getName());
	
    
	OfficerEntity save= this.repo.save(officerEntity);
	return entity;
}

@Override
public OfficerModel updateComplaint(OfficerModel entity) {
	OfficerEntity officerEntity=new OfficerEntity();
	officerEntity.setId(entity.getId());
	officerEntity.setName(entity.getName());
	
    
	OfficerEntity save= this.repo.save(officerEntity);
	return entity;
	// TODO Auto-generated method stub
	//return this.repo.save(entity);
}

@Override
public ComplaintEntity getComplaintById(Long complaintId) {
	// TODO Auto-generated method stub
ComplaintEntity ce=cRepo.findById(complaintId).get();
	return ce;
}
	
	
	
}

