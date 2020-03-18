package com.company.view;

import java.util.Scanner;

public class Provider {
    Scanner input = new Scanner(System.in);

    public int getRunCommand(){
        while (true) {
            int res = input.nextInt();
            if (Validator.checkRunCommand(res)) return res;
        }
    }
     public int getQuantity(){
         while (true) {
             View.printMessage("Input quantity of customers from 1 to 30");
             int quantity = input.nextInt();
             if (Validator.checkQuantity(quantity)) return quantity;
         }
     }

     public int getCustomerCommand(){
         while (true) {
             int res = input.nextInt();
             if (Validator.checkCustomerCommand(res)) return res;
         }
     }

     public int getCreditCardNumber(){
         while (true) {
             int res = input.nextInt();
             if (Validator.checkRange(res)) return res;
         }
     }

     public int[] getMinMax(){
        int[] MinMax = new int[2];
        View.printMessage("Input min:");
        MinMax[0] = getCreditCardNumber();
        View.printMessage("Input max:");
        MinMax[1] = getCreditCardNumber();
        if(Validator.swapMinMax(MinMax[0],MinMax[1])) {
                int temp = MinMax[0];
                MinMax[0] = MinMax[1];
                MinMax[1] = temp;
             }
        return MinMax;
     }

}
