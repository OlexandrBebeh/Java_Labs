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
            View.mistakeInRange();
            return false;
        }
        return true;
    }

    public static boolean checkRunCommand(int res){
        if(res < 3 && res > 0) return true;
        View.wrongCommand();
        return false;
    }
    public static boolean checkQuantity(int quantity){
        if(quantity >= 1 && quantity <= 30) return true;
        View.mistakeInQuantity();
        return false;
    }

    public static boolean checkCustomerCommand(int res){
        if(res < 4 && res > 0) return true;
        View.wrongCommand();
        return false;
    }

    public static boolean checkCustomersArray(Customer[] customers){
        return customers == null;
    }

    public static boolean swapMinMax(int min,int max){
        return min > max;
    }
}
