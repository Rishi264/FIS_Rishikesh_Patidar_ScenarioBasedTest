package com.example.fismoviecustomer.model;

public class MovieDto {
	
int mid;
	
	String mname;
	
	int mrating;
	
	String mtype;
	
	String dname;
	
	String actname1;
	
	String actname2;
	
	public MovieDto()
	{
		super();
	}

	public MovieDto(int mid, String mname, int mrating, String mtype, String dname, String actname1, String actname2) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.mrating = mrating;
		this.mtype = mtype;
		this.dname = dname;
		this.actname1 = actname1;
		this.actname2 = actname2;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public int getMrating() {
		return mrating;
	}

	public void setMrating(int mrating) {
		this.mrating = mrating;
	}

	public String getMtype() {
		return mtype;
	}

	public void setMtype(String mtype) {
		this.mtype = mtype;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getActname1() {
		return actname1;
	}

	public void setActname1(String actname1) {
		this.actname1 = actname1;
	}

	public String getActname2() {
		return actname2;
	}

	public void setActname2(String actname2) {
		this.actname2 = actname2;
	}
	
}
