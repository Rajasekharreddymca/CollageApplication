package com.myCompany.service;

import java.beans.Beans;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myCompany.BO.StudentBo;
import com.myCompany.BO.StudentRegisterBO;
import com.myCompany.DTO.StudentDTO;
import com.myCompany.DTO.StudentRegisterDTO;
import com.myCompany.dao.StudentLoginDAO;

@Service("service")
public class LoginServiceImpl implements LoginService {
	@Autowired
	private StudentLoginDAO dao;

	@Override
	public Boolean validUser(StudentDTO stuDto) {
		StudentBo bo = null;
		bo = new StudentBo();
		BeanUtils.copyProperties(stuDto, bo);
		return dao.checkUserDetails(bo) == 0 ? false : true;
	}

	@Override
	public String insertData(StudentRegisterDTO dto) {
		StudentRegisterBO sbo = null;
		sbo = new StudentRegisterBO();
		BeanUtils.copyProperties(dto, sbo);

		dao.insertStudentData(sbo);
		return dao.insertStudentData(sbo) == 0 ? "Record is not inserted properly"
				: sbo.getfName() + " data is inserted successfully";

	}
}
