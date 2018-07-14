
package com.pharmacy.model;

public class OrderItem {
int quantity;
MedicinePharmacy medpharm;
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public MedicinePharmacy getMedpharm() {
	return medpharm;
}
public void setMedpharm(MedicinePharmacy medpharm) {
	this.medpharm = medpharm;
}
public OrderItem(int quantity, MedicinePharmacy medpharm) {
	super();
	this.quantity = quantity;
	this.medpharm = medpharm;
}
public OrderItem() {
	super();
}

}
