package com.company.controller;

import javax.swing.text.View;
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
}
