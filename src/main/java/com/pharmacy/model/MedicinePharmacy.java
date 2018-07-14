package com.pharmacy.model;

public class MedicinePharmacy {
int count;
Medicine medicine;
Pharmacy pharmacy;

public MedicinePharmacy() {
	
}

public int getCount() {
	return count;
}

public void setCount(int count) {
	this.count = count;
}

public Medicine getMedicine() {
	return medicine;
}

public void setMedicine(Medicine medicine) {
	this.medicine = medicine;
}

public Pharmacy getPharmacy() {
	return pharmacy;
}

public void setPharmacy(Pharmacy pharmacy) {
	this.pharmacy = pharmacy;
}

public MedicinePharmacy(int count, Medicine medicine, Pharmacy pharmacy) {
	super();
	this.count = count;
	this.medicine = medicine;
	this.pharmacy = pharmacy;
}

}
