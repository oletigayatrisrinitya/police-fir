package com.policefir.PoliceFIR.Repo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.policefir.PoliceFIR.Entity.ComplaintEntity;
@Repository
public interface ComplaintRepo extends JpaRepository<ComplaintEntity,Long> {

}
