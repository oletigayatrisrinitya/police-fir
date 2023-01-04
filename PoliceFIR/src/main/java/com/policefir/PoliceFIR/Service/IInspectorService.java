package com.policefir.PoliceFIR.Service;



public interface IInspectorService {

	void assignOfficerToComplaint(Long id, Long complaintId);
	void updateComplaint(Long complaintId);
}
	