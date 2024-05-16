package com.maven;

import javax.persistence.*;


@Entity
@Table(name="EmployeeRecord")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Employee_Id")
	private int eid;
	private String Name;
	private String city;
	
	private boolean isOpen;
	@Transient
	private double x;
	@Lob
	private byte[] image;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int eid, String name, String city, boolean isOpen, double x, byte[] image) {
		super();
		this.eid = eid;
		Name = name;
		this.city = city;
		this.isOpen = isOpen;
		this.x = x;
		this.image = image;
	}

	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public boolean isOpen() {
		return isOpen;
	}
	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	
	
	

}