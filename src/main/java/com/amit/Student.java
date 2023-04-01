package com.amit;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {

	private Integer id;
	private String fname;
	private String lname;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

}
