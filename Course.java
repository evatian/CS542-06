package com.database.group6.po;

public class Course {
	private String cnum;
	private String cname;
	private String tnum;
	private String mnum;
	private float ccredit;
	private String ctime;
	private String cdesc;
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(String cnum, String cname, String tnum, String mnum, float ccredit, String ctime, String cdesc) {
		super();
		this.cnum = cnum;
		this.cname = cname;
		this.tnum = tnum;
		this.mnum = mnum;
		this.ccredit = ccredit;
		this.ctime = ctime;
		this.cdesc = cdesc;
	}
	
	public String getCourseNum() {
		return cnum;
	}
	public void setCourseNum(String cnum) {
		this.cnum = cnum;
	}
	public String getCourseName() {
		return cname;
	}
	public void setCourseName(String cname) {
		this.cname = cname;
	}
	public String getCourseTeacherNum() {
		return tnum;
	}
	public void setCourseTeacherNum(String tnum) {
		this.tnum = tnum;
	}
	public String getCourseMajorNum() {
		return mnum;
	}
	public void setCourseMajorNum(String mnum) {
		this.mnum = mnum;
	}
	public float getCourseCredit() {
		return ccredit;
	}
	public void setCourseCredit(float ccredit) {
		this.ccredit = ccredit;
	}
	public String getCourseTime() {
		return ctime;
	}
	public void setCourseTime(String ctime) {
		this.ctime = ctime;
	}
	public String getCourseDesc() {
		return cdesc;
	}
	public void setCourseDesc(String cdesc) {
		this.cdesc = cdesc;
	}

}