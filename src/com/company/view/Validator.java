package com.company.view;

import com.company.customerClass.entities.Customer;
import com.company.view.exceptions.NotCurrentDigitException;
import com.company.view.exceptions.NotCurrentFileNameException;

public class Validator {

    public static void isNumber(String str) throws NumberFormatException{
        String reg = "-?\\d+(\\.\\d+)?";
            if (!str.matches(reg)) {
                throw new NumberFormatException("exception_number");
            }
    }

    public static void checkNumber(int res, int RangeMax, int RangeMin) throws NotCurrentDigitException {
        if(res > RangeMax || res < RangeMin) {
            throw new NotCurrentDigitException("exception_range");
    }
    }

    public static boolean checkCustomersArray(Customer[] customers){
        return customers == null;
    }

    public static void correctFileName(String str) throws NotCurrentFileNameException {
        String reg = ".*\\.json";
        if(!str.matches(reg)){
            throw new NotCurrentFileNameException("exception_format");
        }
    }

    public static boolean swapMinMax(int min,int max){
        return min > max;
    }
}
