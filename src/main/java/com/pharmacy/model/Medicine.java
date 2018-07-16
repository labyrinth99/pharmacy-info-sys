package com.pharmacy.model;


import java.util.ArrayList;
import java.util.List;

public class Medicine {
	List<ActiveIngredient> LstOfAct ;
int id;
String name;
float price;
public List<ActiveIngredient> getLstOfAct() {
	return LstOfAct;
}
public void setLstOfAct(List<ActiveIngredient> lstOfAct) {
	LstOfAct = lstOfAct;
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
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public Medicine() {
	this.LstOfAct = new ArrayList<ActiveIngredient>();
}
public Medicine(int id, String name, float price) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
	this.LstOfAct = new ArrayList<ActiveIngredient>();
}

}
