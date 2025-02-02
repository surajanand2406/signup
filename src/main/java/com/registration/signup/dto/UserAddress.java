package com.registration.signup.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


public class UserAddress {
	
	//Cardinality -- relational between entities like oneToOne, oneToMany etc.
	String address1;
	String address2;
	String state;
	String city;
	String pincode;
	public UserAddress(String address1, String address2, String state, String city, String pincode) {
		super();
		this.address1 = address1;
		this.address2 = address2;
		this.state = state;
		this.city = city;
		this.pincode = pincode;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [address1=" + address1 + ", address2=" + address2 + ", state=" + state + ", city=" + city
				+ ", pincode=" + pincode + "]";
	}
	
	

}
