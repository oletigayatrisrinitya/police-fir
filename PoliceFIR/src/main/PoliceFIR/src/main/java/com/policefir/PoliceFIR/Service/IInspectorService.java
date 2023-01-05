package com.policefir.PoliceFIR.Service;

import com.policefir.PoliceFIR.Entity.OfficerEntity;

public interface IInspectorService {

	String assignOfficerToComplaint(Long id, Long complaintId);
	String updateComplaint(Long complaintId);
}
	