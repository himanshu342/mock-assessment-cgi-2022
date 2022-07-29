package com.cgi.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "student")
@Entity
public class Student {
	
	public Student() {
		
		
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private int mubno;
	private int cid;
	
	
	public Student(int id, String name, int mubno, int cid) {
		super();
		this.id = id;
		this.name = name;
		this.mubno = mubno;
		this.cid = cid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMubno() {
		return mubno;
	}
	public void setMubno(int mubno) {
		this.mubno = mubno;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
}
