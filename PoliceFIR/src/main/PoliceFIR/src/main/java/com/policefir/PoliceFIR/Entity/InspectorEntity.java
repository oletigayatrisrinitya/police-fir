package com.policefir.PoliceFIR.Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Component
@Entity
@Table(name="Inspector")
public class InspectorEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int InspectorId;
	private String InspectorName;
	private String PolicestationArea;
	@OneToMany(mappedBy="OfficerEntity")
	private List<ComplaintEntity>Complaint;
	public int getInspectorId() {
		return InspectorId;
	}
	public void setInspectorId(int inspectorId) {
		InspectorId = inspectorId;
	}
	public String getInspectorName() {
		return InspectorName;
	}
	public void setInspectorName(String inspectorName) {
		InspectorName = inspectorName;
	}
	public String getPolicestationArea() {
		return PolicestationArea;
	}
	public void setPolicestationArea(String policestationArea) {
		PolicestationArea = policestationArea;
	}
	public List<ComplaintEntity> getComplaint() {
		return Complaint;
	}
	public void setComplaint(List<ComplaintEntity> complaint) {
		Complaint = complaint;
	}
	
}


