package com.vipul.Maven_Hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student {

	@Id
	private int sRno;
	private String sName;
	private String favSubject;
	@OneToMany(mappedBy = "student",fetch=FetchType.EAGER)
	private List<Laptop> laptops = new ArrayList<Laptop>();;
	
	public List<Laptop> getLaptop() {
		return laptops;
	}
	public void setLaptop(List<Laptop> laptops) {
		this.laptops = laptops; 
	}
	public int getsRno() {
		return sRno;
	}
	public void setsRno(int sRno) {
		this.sRno = sRno;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getFavSubject() {
		return favSubject;
	}
	public void setFavSubject(String favSubject) {
		this.favSubject = favSubject;
	}
	
	@Override
	public String toString() {
		return "Student [sRno=" + sRno + ", sName=" + sName + ", favSubject=" + favSubject + ", laptops=" + laptops
				+ "]";
	}
	
	
	
}
