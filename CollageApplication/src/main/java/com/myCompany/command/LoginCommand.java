package com.myCompany.command;

import lombok.Data;

//@Data
public class LoginCommand {
public String userName;
public String pwd;
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}

}
