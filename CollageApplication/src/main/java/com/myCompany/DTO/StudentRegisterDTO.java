package com.myCompany.DTO;

public class StudentRegisterDTO {
	
	private String fName;
	private String lName;
	private String uName;
	private String pwd;
	private long phno;
	private String addr;
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "StudentRegisterDTO [fName=" + fName + ", lName=" + lName + ", uName=" + uName + ", pwd=" + pwd
				+ ", phno=" + phno + ", addr=" + addr + "]";
	}
	
}
