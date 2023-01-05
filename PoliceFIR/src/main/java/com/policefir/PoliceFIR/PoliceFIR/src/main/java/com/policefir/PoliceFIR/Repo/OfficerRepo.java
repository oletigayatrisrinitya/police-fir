package com.policefir.PoliceFIR.Repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.policefir.PoliceFIR.Entity.OfficerEntity;
@Repository
public interface OfficerRepo extends  JpaRepository<OfficerEntity,Long> {
	OfficerEntity save(Long complaintid);

}
