package com.company.view;


import java.util.Scanner;

public class ProviderInput {
    Scanner input = new Scanner(System.in);

    public int getCommand(int maxCommand){
        String str = input.next();
        Validator.isNumber(str);
        int res  = Integer.parseInt(str);
        Validator.checkNumber(res, 0, maxCommand);
        return res;
    }


     public int getCreditCardNumber(String str){
        String creditCard = input.next();
        Validator.isNumber(creditCard);
        int res =  Integer.parseInt(creditCard);
        Validator.checkNumber(res,0,1000000);
        return res;

     }

     public int[] getMinMax(){

        int[] MinMax = new int[2];
        MinMax[0] = getCreditCardNumber("Input min");
        MinMax[1] = getCreditCardNumber("Input max");
        if(Validator.swapMinMax(MinMax[0],MinMax[1])) {
                int temp = MinMax[0];
                MinMax[0] = MinMax[1];
                MinMax[1] = temp;
             }
        return MinMax;
     }

}
