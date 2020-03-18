package com.company.view;

import com.company.customerClass.Customer;

public class Validator {

    public static boolean checkRange(int number){
        if(number < 0 || number > 1000000){
            View.printMessage("There is wrong digit! It must be from 0 to 1000000");
            return false;
        }
        return true;
    }

    public static boolean checkRunCommand(int res){
        if(res < 4 && res > 0) return true;
        View.printMessage("There is wrong command!");
        View.startMenu();
        return false;
    }
    public static boolean checkQuantity(int quantity){
        if(quantity >= 1 && quantity <= 30) return true;
        View.printMessage("There is wrong quantity! It must be from 1 to 30!");
        return false;
    }

    public static boolean checkCustomerCommand(int res){
        if(res < 6 && res > 0) return true;
        View.printMessage("There is wrong command!");
        View.workWithCustomers();
        return false;
    }

    public static boolean checkCustomersArray(Customer[] customers){
        return customers == null;
    }

    public static boolean swapMinMax(int min,int max){
        return min > max;
    }
}
