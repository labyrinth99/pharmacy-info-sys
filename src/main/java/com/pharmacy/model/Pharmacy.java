package com.pharmacy.model;


import java.util.List;

public class Pharmacy {
int id;
String name;
String location;
float tax;
List<Medicine> lstofmedicine;
public Pharmacy() {
	super();
}
public Pharmacy(int id, String name, String location, float tax) {
	super();
	this.id = id;
	this.name = name;
	this.location = location;
	this.tax = tax;
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
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public float getTax() {
	return tax;
}
public void setTax(float tax) {
	this.tax = tax;
}
public List<Medicine> getLstofmedicine() {
	return lstofmedicine;
}
public void setLstofmedicine(List<Medicine> lstofmedicine) {
	this.lstofmedicine = lstofmedicine;
}

}
