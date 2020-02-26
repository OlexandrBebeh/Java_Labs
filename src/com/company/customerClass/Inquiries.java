package com.company.customerClass;

//import java.util.ArrayList;

import com.company.customerClass.Customer;

import java.util.Arrays;
import java.util.Comparator;

public class Inquiries {
    public static Customer[] getSortedList(Customer[] list){

        Arrays.sort(list, Comparator.comparing(Customer::getForename));
//        (Customer a, Customer b) -> {
//            return a.getForename().compareTo(b.getForename());
//        });
        return list;
    }
    public static Customer[] getInRange(Customer[] customers, int min, int max){
        int quantity=0;

        for(int i=0; i< customers.length;i++){
            if(customers[i].getCreditCard()>min && customers[i].getCreditCard()<max){
                quantity++;
            }
        }
        if(quantity == 0) return null;
        Customer[] result = new Customer[quantity];
        quantity = 0;
        for(int i=0;i< customers.length;i++){

            if(customers[i].getCreditCard()>min && customers[i].getCreditCard()<max){
                result[quantity] = customers[i];
                quantity++;
            }
        }
        return result;
    }
}
