package com.myCompany.service;

import java.beans.Beans;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myCompany.BO.StudentBo;
import com.myCompany.DTO.StudentDTO;
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

}
