package com.company.controller;

import com.company.customerClass.Customer;
import com.company.view.View;

public class Validator {
    public static boolean checkCreateCustomers(int quantity){
        if(quantity > 30 || quantity < 1) {
            System.out.println("Wrong number of customers (Range from 1 to 30)");
            return false;}
        else return true;
    }

    public static boolean checkRange(int number){
        if(number < 0 || number > 1000000){
            View.mistakeInRAnge();
            return false;
        }
        return true;
    }

    public static boolean checkRunCommand(int res){
        return res < 3 && res > 0;
    }
    public static boolean checkQuantity(int quantity){
        return quantity >= 1 && quantity <= 30;
    }

    public static boolean checkCustomerCommand(int res){
        return res < 4 && res > 0;
    }

    public static boolean checkCustomersArray(Customer[] customers){
        return customers == null;
    }

    public static boolean swapMinMax(int min,int max){
        return min > max;
    }
}
