package com.company.customerClass;

public class DataStore {
    Customer[] customers;

    public DataStore (){
        this.customers = null;
    }

    public void setData (Customer[] customers){
        this.customers = customers;
    }

    public Customer[] getData (){
        return this.customers;
    }

    public void createData (int quantity){
        this.customers = RandomFill.createAndFillArray(quantity);
    }

    public void delete(){
        this.customers = null;
    }
}
