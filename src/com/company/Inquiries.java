package com.company;

//import java.util.ArrayList;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Inquiries {
    public static Customer[] GetSortedList(Customer[] list){

        Arrays.sort(list, Comparator.comparing(Customer::getForename));
//        (Customer a, Customer b) -> {
//            return a.getForename().compareTo(b.getForename());
//        });
        return list;
    }
    public static Customer[] GetInRAnge (Customer[] customers,int min, int max){
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
