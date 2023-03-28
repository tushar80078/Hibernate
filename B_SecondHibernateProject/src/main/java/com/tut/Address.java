package com.tut;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity

@Table(name="student_address")
public class Address 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int streetId;
	
	@Column(name="street",length=50)
	private String street;
	
	@Column(name="city",length=50)
	private String city;
	
	@Transient
	private Double x;
	
	@Column(name="open")
	private boolean isOpen=true;
	
	@Temporal(TemporalType.DATE)
	private Date addedDate;

	@Lob
	private byte[] img;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int streetId, String street, String city, Double x, boolean isOpen, Date addedDate, byte[] img) {
		super();
		this.streetId = streetId;
		this.street = street;
		this.city = city;
		this.x = x;
		this.isOpen = isOpen;
		this.addedDate = addedDate;
		this.img = img;
	}

	public int getStreetId() {
		return streetId;
	}

	public void setStreetId(int streetId) {
		this.streetId = streetId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Double getX() {
		return x;
	}

	public void setX(Double x) {
		this.x = x;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	public byte[] getImg() {
		return img;
	}

	public void setImg(byte[] img) {
		this.img = img;
	}

	@Override
	public String toString() {
		return "Address [streetId=" + streetId + ", street=" + street + ", city=" + city + ", x=" + x + ", isOpen="
				+ isOpen + ", addedDate=" + addedDate + ", img=" + Arrays.toString(img) + "]";
	}
	
	
}
