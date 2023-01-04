package com.policefir.PoliceFIR.Repo;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.policefir.PoliceFIR.Entity.AppUserEntity;
@Repository
public interface AppUserRepo extends JpaRepository<AppUserEntity,String>{

	 

	

	

}
