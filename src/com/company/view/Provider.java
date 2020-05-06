package com.company.view;

import com.company.view.exceptions.NotCurrentDigitException;
import com.company.view.exceptions.NotCurrentFileNameException;

import java.util.Scanner;

public class Provider {
    Scanner input = new Scanner(System.in);

    public int getCommand(int maxCommand){
        while (true) {
            try{
                String str = input.next();
                Validator.isNumber(str);
                int res  = Integer.parseInt(str);
                Validator.checkNumber(res, 0, maxCommand);
                return res;
            }catch (NumberFormatException| NotCurrentDigitException e){
                View.printMessage(e.getMessage());
            }

        }
    }


     public int getCreditCardNumber(String str){
         while (true) {
             View.printMessage(str + "(from 0 to 1000000):");
             try {
                 String creditCard = input.next();
                 Validator.isNumber(creditCard);
                 int res =  Integer.parseInt(creditCard);
                 Validator.checkNumber(res,0,1000000);
                 return res;
             } catch (NumberFormatException|NotCurrentDigitException e){
                 View.printMessage(e.getMessage());
             }
         }
     }

     public String getFileName(){
        while (true){
            View.printMessage("Enter name of file with .json extension." + "(example:C:\\Users\\Саня\\git\\Java_Labs\\cust\\example.json)");
            try{
                String fileName = input.next();
                Validator.correctFileName(fileName);
                return fileName;
            } catch (NotCurrentFileNameException e) {
                View.printMessage(e.getMessage());
            }
        }
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
