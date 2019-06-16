package com;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class US500 {
	
	private String first_name;
	private String last_name;
	private String company_name;
	private String address;
	private String city;
	private String country;
	private String state;
	private String zip;
	private String phone_no1;
	private String phone_no2;
	
	private String e_mail;
	private String web_mail;
	public US500(String first_name, String last_name, String company_name,
			String address, String city, String country, String state,
			String zip, String phone_no1, String phone_no2, String e_mail,
			String web_mail) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.company_name = company_name;
		this.address = address;
		this.city = city;
		this.country = country;
		this.state = state;
		this.zip = zip;
		this.phone_no1 = phone_no1;
		this.phone_no2 = phone_no2;
		this.e_mail = e_mail;
		this.web_mail = web_mail;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getPhone_no1() {
		return phone_no1;
	}
	public void setPhone_no1(String phone_no1) {
		this.phone_no1 = phone_no1;
	}
	public String getPhone_no2() {
		return phone_no2;
	}
	public void setPhone_no2(String phone_no2) {
		this.phone_no2 = phone_no2;
	}
	public String getE_mail() {
		return e_mail;
	}
	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}
	public String getWeb_mail() {
		return web_mail;
	}
	public void setWeb_mail(String web_mail) {
		this.web_mail = web_mail;
	}
	
	
	
	
	
}
