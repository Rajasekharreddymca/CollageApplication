package com.myCompany.service;

import com.myCompany.BO.StudentRegisterBO;
import com.myCompany.DTO.StudentDTO;
import com.myCompany.DTO.StudentRegisterDTO;

public interface LoginService {
	
	Boolean validUser(StudentDTO StdDto); 
	public String insertData(StudentRegisterDTO dto);

}
