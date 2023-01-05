package com.policefir.PoliceFIR.Model;

import java.util.List;

import com.policefir.PoliceFIR.Entity.ComplaintEntity;

public class OfficerResponse {

	private Long id;
	private String name;
	private List<ComplaintEntity> complaints;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<ComplaintEntity> getComplaints() {
		return complaints;
	}
	public void setComplaints(List<ComplaintEntity> complaints) {
		this.complaints = complaints;
	}
}
