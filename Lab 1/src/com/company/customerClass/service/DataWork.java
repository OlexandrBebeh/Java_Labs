package com.company.customerClass.service;

import com.company.customerClass.entities.Customer;
import com.company.view.Validator;

import java.util.Arrays;
import java.util.Comparator;

public class DataWork {
    DataStore data;

    public DataWork() {

        data = new DataStore(RandomFill.createAndFillArray(20));
    }

    public Customer[] sort(){

        return getSortedList(getCustomers());

    }

    private Customer[] getSortedList(Customer[] list){
        Arrays.sort(list, Comparator.comparing(Customer::getForename));
        return list;
    }
    public Customer[] range(int[] MinMax){
        Customer[] customers = data.getData();
        if(Validator.checkCustomersArray(customers))
       return null;
        else return getInRange(customers, MinMax[0],MinMax[1]);
    }

    private Customer[] getInRange(Customer[] customers, int min, int max){
        int quantity = 0;

        Customer[] result = new Customer[customers.length];

        for (Customer customer : customers) {
            if (customer.getCreditCard() > min && customer.getCreditCard() < max) {
                result[quantity] = customer;
                quantity++;
            }
        }
        if(quantity == 0) return new Customer[0];;
        data.setData(Arrays.copyOf(result, quantity));
        return getCustomers();
    }

    public Customer[] getCustomers(){
        return data.getData();
    }

}
