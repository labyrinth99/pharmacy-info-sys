package com.pharmacy.model;

public class ActiveIngredient {
int id;
String name;
String description;
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
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public ActiveIngredient() {
	
}
public ActiveIngredient(int id, String name, String description) {
	super();
	this.id = id;
	this.name = name;
	this.description = description;
}


}
