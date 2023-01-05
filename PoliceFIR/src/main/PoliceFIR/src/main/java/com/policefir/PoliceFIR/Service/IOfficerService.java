package com.policefir.PoliceFIR.Service;

import com.policefir.PoliceFIR.Entity.ComplaintEntity;
import com.policefir.PoliceFIR.Entity.OfficerEntity;
import com.policefir.PoliceFIR.Model.OfficerModel;

public interface IOfficerService  {

	//public OfficerEntity updateComplaint(Long complaintId);

    public OfficerModel addOfficer(OfficerModel entity);
    public OfficerModel updateComplaint(OfficerModel entity);
    public ComplaintEntity getComplaintById(Long complaintId);


}

	

	
