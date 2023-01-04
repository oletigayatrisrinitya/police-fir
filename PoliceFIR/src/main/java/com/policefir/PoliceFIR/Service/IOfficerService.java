package com.policefir.PoliceFIR.Service;

import com.policefir.PoliceFIR.Entity.OfficerEntity;

public interface IOfficerService  {

	public OfficerEntity updateComplaint(Long complaintId);

    public OfficerEntity addOfficer(OfficerEntity entity);
    public OfficerEntity updateComplaint(OfficerEntity entity);



}

	

	
