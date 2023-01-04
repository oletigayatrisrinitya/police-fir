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
@Table(name="Officer")
public class OfficerEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	@OneToMany(mappedBy="OfficerEntity")
	private List<ComplaintEntity>Complaint;
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
		return Complaint;
	}
	public void setComplaints(List<ComplaintEntity> complaint) {
		this.Complaint = complaint;
	}
}
//public void Service()