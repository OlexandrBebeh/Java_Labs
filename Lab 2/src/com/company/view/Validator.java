package com.company.view;

import com.company.customerClass.entities.Customer;
import com.company.view.exceptions.NotCurrentDigitException;

public class Validator {

    public static void isNumber(String str) throws NumberFormatException{
        String reg = "-?\\d+(\\.\\d+)?";
            if (!str.matches(reg)) {
                throw new NumberFormatException("Entered value is not number!");
            }
    }

    public static void checkNumber(int res, int RangeMin, int  RangeMax) throws NotCurrentDigitException {
        if(res > RangeMax || res < RangeMin) {
            throw new NotCurrentDigitException("Not current number! It must be from " + RangeMin + " to " +  RangeMax);
        }
    }

    public static boolean checkCustomersArray(Customer[] customers){
        return customers == null;
    }

    public static boolean swapMinMax(int min,int max){
        return min > max;
    }
}
