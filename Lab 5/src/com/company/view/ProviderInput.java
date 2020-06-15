package com.company.view;

import com.company.view.exceptions.NotCurrentDigitException;
import com.company.view.exceptions.NotCurrentFileNameException;
import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.Scanner;

public class ProviderInput {
    public static Logger logger = Logger.getLogger(ProviderInput.class);

    Scanner input = new Scanner(System.in);

    public int getCommand(int maxCommand){
        while (true) {
            try{
                String str = input.next();
                Validator.isNumber(str);
                int res  = Integer.parseInt(str);
                Validator.checkNumber(res,maxCommand,0);
                return res;
            }catch (NumberFormatException| NotCurrentDigitException e){
                View.printLocalMessage(e.getMessage());
            }

        }
    }

     public int getCreditCardNumber(String str){
         while (true) {
             View.printLocalMessage(str);
             View.printLocalMessage("credit_card_range");
             try {
                 String creditCard = input.next();
                 Validator.isNumber(creditCard);
                 int res =  Integer.parseInt(creditCard);
                 Validator.checkNumber(res, 1000000, 0);
                 return res;
             } catch (NumberFormatException|NotCurrentDigitException e){
                 View.printLocalMessage(e.getMessage());
             }
         }
     }

     public String getFileName(){
        while (true){
            View.printLocalMessage("message_about_format");
            View.printLocalMessage("example");
            try{
                String fileName = input.next();
                Validator.correctFileName(fileName);
                return fileName;
            } catch (NotCurrentFileNameException e) {
                View.printLocalMessage(e.getMessage());
            }
        }
     }

     public int[] getMinMax(){

        int[] MinMax = new int[2];
        MinMax[0] = getCreditCardNumber("input_min");
        MinMax[1] = getCreditCardNumber("input_max");
        if(Validator.swapMinMax(MinMax[0],MinMax[1])) {
                int temp = MinMax[0];
                MinMax[0] = MinMax[1];
                MinMax[1] = temp;
                logger.debug("Swap values: " + Arrays.toString(MinMax));
             }
        return MinMax;
     }

}
