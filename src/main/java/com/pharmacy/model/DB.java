package com.pharmacy.model;


import java.util.ArrayList;
import java.util.List;

public class DB {
    private List<User> userList=new ArrayList<User>();
    private List<Medicine> medicineList=new ArrayList<Medicine>();
    private List<Pharmacy> pharmacyList=new ArrayList<Pharmacy>();
    private List<ActiveIngredient> activeIngredientList=new ArrayList<ActiveIngredient>();
    private List<MedicinePharmacy> medicinePharmacyList=new ArrayList<MedicinePharmacy>();
    private List<Order> orderList=new ArrayList<Order>();

    private void Init(){
        //Initializing Dummy Values
        for (int i=1;i<6;i++){
            User tempUser= new User("user"+i,"pass"+i,"Mark"+i,"address "+i,"emailforuser"+i+"@yahoo.com","641999655"+i,new Order());
            userList.add(tempUser);
        }

        for (int i=1;i<6;i++){
            Medicine tempMedicine=new Medicine(i,"Medicine"+i,(float)10.5+i);
            medicineList.add(tempMedicine);
        }

        for(int i=1;i<6;i++){

        }

    }

    public DB() {
        this.Init();
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public List<Medicine> getMedicineList() {
        return medicineList;
    }

    public void setMedicineList(List<Medicine> medicineList) {
        this.medicineList = medicineList;
    }

    public List<Pharmacy> getPharmacyList() {
        return pharmacyList;
    }

    public void setPharmacyList(List<Pharmacy> pharmacyList) {
        this.pharmacyList = pharmacyList;
    }

    public List<ActiveIngredient> getActiveIngredientList() {
        return activeIngredientList;
    }

    public void setActiveIngredientList(List<ActiveIngredient> activeIngredientList) {
        this.activeIngredientList = activeIngredientList;
    }

    public List<MedicinePharmacy> getMedicinePharmacyList() {
        return medicinePharmacyList;
    }

    public void setMedicinePharmacyList(List<MedicinePharmacy> medicinePharmacyList) {
        this.medicinePharmacyList = medicinePharmacyList;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
}
