package com.cgi.model;




import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "course")
@Entity
public class Course {

	public Course() {
		super();
		
	}
	public Course(int cid, String cname, String cdur) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cdur = cdur;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	private String cname;
	private String cdur;
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
	public String getCdur() {
		return cdur;
	}
	public void setCdur(String cdur) {
		this.cdur = cdur;
	}
}