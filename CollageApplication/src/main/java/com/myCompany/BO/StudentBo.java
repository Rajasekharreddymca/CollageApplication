package com.myCompany.BO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data

public class StudentBo {
	
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
