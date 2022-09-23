package com.example.fismoviecustomer.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class MovieCustomer {
	@Id
	int cid;
	String cname;
	int age;
	int cno;
	int mid;
	
	public MovieCustomer()
	{
		super();
	}

	public MovieCustomer(int cid, String cname, int age, int cno, int mid) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.age = age;
		this.cno = cno;
		this.mid = mid;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getCno() {
		return cno;
	}

	public void setCno(int cno) {
		this.cno = cno;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}
	
	
	
	
	

}
