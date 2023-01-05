package com.policefir.PoliceFIR.Service.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.policefir.PoliceFIR.Entity.OfficerEntity;
import com.policefir.PoliceFIR.Repo.OfficerRepo;
import com.policefir.PoliceFIR.Service.IOfficerService;

@Service
public  class IOfficerServiceImp implements IOfficerService {
	@Autowired
	private OfficerRepo repo;
	
	@Override
	public com.policefir.PoliceFIR.Entity.OfficerEntity updateComplaint(com.policefir.PoliceFIR.Entity.OfficerEntity entity) {
		// TODO Auto-generated method stub
		
		return null;
	}
    
	@Override
	public OfficerEntity addOfficer(OfficerEntity entity) {
		// TODO Auto-generated method stub
		OfficerEntity save= this.repo.save(entity);
		return save;
		
	}
	@Override
	public OfficerEntity updateComplaint(Long complaintId) {
		// TODO Auto-generated method stub
		return this.repo.save(complaintId);
	}
}

