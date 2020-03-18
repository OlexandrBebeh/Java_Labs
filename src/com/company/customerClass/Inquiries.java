package com.company.customerClass;

import java.util.Arrays;
import java.util.Comparator;

public class Inquiries {
    protected static void getSortedList(Customer[] list){
        Arrays.sort(list, Comparator.comparing(Customer::getForename));
    }
    protected static Customer[] getInRange(Customer[] customers, int min, int max){
        int quantity = 0;

        Customer[] result = new Customer[customers.length];

        for(int i=0;i< customers.length;i++){

            if(customers[i].getCreditCard()>min && customers[i].getCreditCard()<max){
                result[quantity] = customers[i];
                quantity++;
            }
        }
        if(quantity == 0) return null;
        return Arrays.copyOf(result, quantity);
    }
}
