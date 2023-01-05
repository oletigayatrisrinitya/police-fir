package com.policefir.PoliceFIR.Exception;

import com.policefir.PoliceFIR.Entity.AppUserEntity;
import com.policefir.PoliceFIR.dto.LoginDTO;
public interface AppUserService {
	AppUserEntity validate(LoginDTO dto);
	public AppUserEntity register(AppUserEntity appuser)throws AppUserException; 
}
