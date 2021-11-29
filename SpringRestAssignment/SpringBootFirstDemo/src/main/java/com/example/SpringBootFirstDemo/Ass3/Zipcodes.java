package com.example.SpringBootFirstDemo.Ass3;

public class Zipcodes {
	
	private String zip;
	private String state;
	private String city;
	private String country;
	
	public Zipcodes() {
		
	}
	
	public Zipcodes(String zip, String state, String city, String country) {
		super();
		this.zip = zip;
		this.state = state;
		this.city = city;
		this.country = country;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
