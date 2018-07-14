
package com.pharmacy.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
int number;
float totalPrice;
boolean isPaid;
List<OrderItem> LstOfitems;
public List<OrderItem> getLstOfitems() {
	return LstOfitems;
}
public void setLstOfitems(List<OrderItem> lstOfitems) {
	LstOfitems = lstOfitems;
}
public int getNumber() {
	
	return number++;
}
public void setNumber(int number) {
	this.number = number;
}



public Order() {
	
	super();
	LstOfitems = new ArrayList<OrderItem>();
}
public float getTotalPrice() {
	return totalPrice;
}
public void setTotalPrice(float totalPrice) {
	this.totalPrice = totalPrice;
}
public boolean isPaid() {
	return isPaid;
}
public void setPaid(boolean isPaid) {
	this.isPaid = isPaid;
}
public Order(int number, float totalPrice, boolean isPaid) {
	super();
	this.number = number;
	this.totalPrice = totalPrice;
	this.isPaid = isPaid;
	LstOfitems = new ArrayList<OrderItem>();
}

}
