package com.myCompany.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.myCompany.BO.StudentBo;
import com.myCompany.BO.StudentRegisterBO;


/*DESC Studentinfotab ;
Name                                      Null?    Type
----------------------------------------- -------- ----------------------------
STUID                                     NOT NULL NUMBER(10)
STUFNAME                                           VARCHAR2(27)
STULASTNAME                                        VARCHAR2(25)
STUUSERNAME                                        VARCHAR2(20)
PASSWORD                                           VARCHAR2(20)
PHONENO                                            NUMBER(15)
STUADDRESS                                         VARCHAR2(50)*/


@Repository
public class StudentLoginDAOImpl implements StudentLoginDAO {
	@Autowired
	private JdbcTemplate jt;
private static final	String FIND_USER = "SELECT COUNT(*) FROM STUDENT_LOGIN WHERE USERNAME=? AND PASSWORD=? ";
private static final	String INSERT_STUDENET = "INSERT INTO  Studentinfotab VALUES (stuidseq.nextval,?,?,?,?,?,?)";
	@Override
	public int checkUserDetails(StudentBo stuBo) {

		int res = jt.queryForObject(FIND_USER, Integer.class, stuBo.getUserName(), stuBo.getPwd());

		return res;
		
		
	}

	public int insertStudentData(StudentRegisterBO sbo) {
		
		
		int count =jt.update(INSERT_STUDENET,sbo.getfName(),sbo.getlName(),sbo.getuName(),sbo.getPwd(),sbo.getPhno(),sbo.getAddr());
		return count;
	}
	
	
	
}
