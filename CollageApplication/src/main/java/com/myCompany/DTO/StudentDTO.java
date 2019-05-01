package com.myCompany.DTO;

import lombok.Data;

@Data
public class StudentDTO {

	private String UserName;
	private String Pwd;
	
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPwd() {
		return Pwd;
	}
	public void setPwd(String pwd) {
		Pwd = pwd;
	}
	
}
