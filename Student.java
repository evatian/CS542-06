package com.database.group6.po;

public class Student {
	private String snum;
	private String smnum;
	private String sname;
	private String ssex;
	private String spassword;
	
	public String getStudentNum() {
		return snum;
	}
	public String getStudentMajorNum() {
		return smnum;
	}
	public String getStudentName() {
		return sname;
	}
	public String getStudentSex() {
		return ssex;
	}
	public String getStudentPassword() {
		return spassword;
	}
	public void setStudentPassword(String spassword) {
		this.spassword = spassword;
	}
}