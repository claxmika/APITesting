package com.example;

public class Customer {
	public Customer (String firstName,String lastName,String ssn,String location) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.ssn=ssn;
		this.location=location;
	}
String firstName;
String lastName;
String ssn;
String location;

public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName=firstName;
}

public String getlastName() {
	return lastName;
}
public void setlastName(String lastName) {
	this.lastName=lastName;
}

public String getssn() {
	return ssn;
}
public void setssn(String ssn) {
	this.ssn=ssn;
}

public String getlocation() {
	return location;
}
public void setlocation(String location) {
	this.location=location;
}
	
}
