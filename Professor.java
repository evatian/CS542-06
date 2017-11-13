package com.database.group6.po;

public class Professor {
	private String pnum;
	private String pname;
	private String psex;
	private String ppassword;
	
	public String getProfessorNum() {
		return pnum;
	}
	public String getProfessorName() {
		return pname;
	}
	public String getProfessorSex() {
		return psex;
	}
	public String getProfessorPassword() {
		return ppassword;
	}
	public void setProfessorPassword(String ppassword) {
		this.ppassword = ppassword;
	}
}