package com.company;

public class Validator {
    public static boolean  CheckCreateCustomers (int quantity){
        if(quantity > 30 || quantity < 1) {
            System.out.println("Wrong number of customers (Range from 1 to 30)");
            return false;}
        else return true;
    }

    public static boolean CheckRange(int min, int max){
        if(min > max) {
            int temp = min;
            max = min;
            min = temp;
        }
        if(min < 0 || min > 100){
            System.out.println("Wrong range!");
            return false;
        }
        if (max < 0 || max > 100){
            System.out.println("Wrong range!");
            return false;
        }
        return true;
    }

}
