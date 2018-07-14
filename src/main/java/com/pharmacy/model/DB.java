package com.pharmacy.model;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DB {
    private List<User> userList=new ArrayList<User>();
    private List<Medicine> medicineList=new ArrayList<Medicine>();
    private List<Pharmacy> pharmacyList=new ArrayList<Pharmacy>();
    private List<ActiveIngredient> activeIngredientList=new ArrayList<ActiveIngredient>();
    private List<MedicinePharmacy> medicinePharmacyList=new ArrayList<MedicinePharmacy>();
    private List<Order> orderList=new ArrayList<Order>();

    private void Init(){
        //Initializing Dummy Values
        Random randomTemp=new Random();
        int user=6;
        int activeIngredients=6;
        int medicine=6;
        int pharmacy=6;
        int medicinePharmacy=6;
        int count=6;

        for (int i=1;i<user;i++){
            User tempUser= new User("user"+i,"pass"+i,"Mark"+i,"address "+i,"emailforuser"+i+"@yahoo.com","641999655"+i,new Order());
            userList.add(tempUser);
        }

        for (int i=1;i<activeIngredients;i++){
            ActiveIngredient tempActiveIngredient=new ActiveIngredient(i,"ActiveIngredient"+i,"Active Ingredient item"+i);
            activeIngredientList.add(tempActiveIngredient);
        }

        for (int i=1;i<medicine;i++){
            Medicine tempMedicine=new Medicine(i,"Medicine"+i,(float)10.5+i);

            List<ActiveIngredient> tempList=new ArrayList<>();
            for (int j=0;j<activeIngredients-1;j++){
                tempList.add(activeIngredientList.get(j));
            }
            tempMedicine.setLstOfAct(tempList);
            medicineList.add(tempMedicine);
        }

        for(int i=1;i<pharmacy;i++){
            Pharmacy tempPharmacy=new Pharmacy(i,"Pharmacy"+i,"Location Address"+i,i*2);
            List<Medicine> tempMedList=new ArrayList<>();
            for (int j=0;j<medicine-1;j++){
                tempMedList.add(medicineList.get(j));
            }
            tempPharmacy.setLstofmedicine(tempMedList);
            pharmacyList.add(tempPharmacy);
        }

        for(int i=1;i<medicinePharmacy;i++){
            Random randomMedicine=new Random();
            Random randomPharmacy=new Random();
            Random randomCount=new Random();

            MedicinePharmacy tempMedicinePharmacy=new MedicinePharmacy(randomCount.nextInt(count),
                    medicineList.get(randomMedicine.nextInt(medicine-1)),
                    pharmacyList.get(randomPharmacy.nextInt(pharmacy-1)));
            medicinePharmacyList.add(tempMedicinePharmacy);
        }

    }

    public DB() {
        this.Init();
        System.out.println("DB Initialization Complete");
        for (MedicinePharmacy i: medicinePharmacyList){
            System.out.println(i.toString());
        }
    }
}
