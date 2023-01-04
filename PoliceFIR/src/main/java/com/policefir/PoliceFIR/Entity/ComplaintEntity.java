package com.policefir.PoliceFIR.Entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.policefir.PoliceFIR.enumeration.ComplaintStatus;
import com.policefir.PoliceFIR.enumeration.CrimePriority;
import com.policefir.PoliceFIR.enumeration.CrimeType;
@Component
@Entity
@Table(name="Complaint")
public class ComplaintEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long complaintId;
	private String userName;
	private CrimeType crimeType;
	private CrimePriority priority;
	private Date dateOfComplaint;
	private String details;
	private Long officerId;
	private Long stationId;
	private ComplaintStatus status;
	@ManyToOne
	private OfficerEntity OfficerEntity;
	public Long getComplaintId() {
		return complaintId;
	}
	public void setComplaintId(Long complaintId) {
		this.complaintId = complaintId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public CrimeType getCrimeType() {
		return crimeType;
	}
	public void setCrimeType(CrimeType crimeType) {
		this.crimeType = crimeType;
	}
	public CrimePriority getPriority() {
		return priority;
	}
	public void setPriority(CrimePriority priority) {
		this.priority = priority;
	}
	public Date getDateOfComplaint() {
		return dateOfComplaint;
	}
	public void setDateOfComplaint(Date dateOfComplaint) {
		this.dateOfComplaint = dateOfComplaint;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public Long getOfficerId() {
		return officerId;
	}
	public void setOfficerId(Long officerId) {
		this.officerId = officerId;
	}
	public Long getStationId() {
		return stationId;
	}
	public void setStationId(Long stationId) {
		this.stationId = stationId;
	}
	public ComplaintStatus getStatus() {
		return status;
	}
	public void setStatus(ComplaintStatus status) {
		this.status = status;
	}
	public OfficerEntity getOfficerEntity() {
		return OfficerEntity;
	}
	public void setOfficerEntity(OfficerEntity officerEntity) {
		OfficerEntity = officerEntity;
	}
	public ComplaintEntity(Long complaintId, String userName, CrimeType crimeType, CrimePriority priority,
			Date dateOfComplaint, String details, Long officerId, Long stationId, ComplaintStatus status,
			com.policefir.PoliceFIR.Entity.OfficerEntity officerEntity) {
		super();
		this.complaintId = complaintId;
		this.userName = userName;
		this.crimeType = crimeType;
		this.priority = priority;
		this.dateOfComplaint = dateOfComplaint;
		this.details = details;
		this.officerId = officerId;
		this.stationId = stationId;
		this.status = status;
		OfficerEntity = officerEntity;
	}
	public ComplaintEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ComplaintEntity [complaintId=" + complaintId + ", userName=" + userName + ", crimeType=" + crimeType
				+ ", priority=" + priority + ", dateOfComplaint=" + dateOfComplaint + ", details=" + details
				+ ", officerId=" + officerId + ", stationId=" + stationId + ", status=" + status + ", OfficerEntity="
				+ OfficerEntity + "]";
	}
	
	
}	