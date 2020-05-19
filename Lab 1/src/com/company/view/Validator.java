package com.company.view;

import com.company.customerClass.entities.Customer;

public class Validator {

    public static boolean isNumber(String str){
        String reg = "-?\\d+(\\.\\d+)?";
        return str.matches(reg);
    }

    public static boolean checkNumber(int res, int RangeMin, int  RangeMax) {
        return res <= RangeMax && res >= RangeMin;
    }

    public static boolean checkCustomersArray(Customer[] customers){
        return customers == null;
    }

    public static boolean swapMinMax(int min,int max){
        return min > max;
    }
}
