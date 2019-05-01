package com.myCompany.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.myCompany.BO.StudentBo;

@Repository
public class StudentLoginDAOImpl implements StudentLoginDAO {
	@Autowired
	JdbcTemplate jt;
	String FIND_USER = "SELECT COUNT(*) FROM STUDENT_LOGIN WHERE USERNAME=? AND PASSWORD=? ";

	@Override
	public int checkUserDetails(StudentBo stuBo) {

		int res = jt.queryForObject(FIND_USER, Integer.class, stuBo.getUserName(), stuBo.getPwd());

		return res;
	}

}
