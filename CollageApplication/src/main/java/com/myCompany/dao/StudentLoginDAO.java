package com.myCompany.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.myCompany.BO.StudentBo;
import com.myCompany.BO.StudentRegisterBO;

public interface StudentLoginDAO {
		
	public int checkUserDetails(StudentBo stuBo);
	public int insertStudentData(StudentRegisterBO sbo);
}
