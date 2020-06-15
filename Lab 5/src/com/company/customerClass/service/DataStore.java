package com.company.customerClass.service;

import com.company.customerClass.entities.Customer;

public class DataStore {
    Customer[] customers;

    public DataStore (){
        this.customers = null;
    }

    public DataStore ( Customer[] customers){
        this.customers = customers;
    }

    public void setData (Customer[] customers){
        this.customers = customers;
    }

    public Customer[] getData (){
        return this.customers;
    }

    public void delete(){
        this.customers = null;
    }
}
