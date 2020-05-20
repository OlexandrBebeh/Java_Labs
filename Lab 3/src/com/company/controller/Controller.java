package com.company.controller;

import com.company.customerClass.service.DataWork;
import com.company.view.ProviderInput;
import com.company.view.View;
import com.google.gson.JsonSyntaxException;

import java.io.IOException;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Controller {
     private DataWork data;
     private ProviderInput providerInput = new ProviderInput();
     final int ENDCOMMAND = 7;


      public void run(){
            int res = 0;
            try {
                data = new DataWork();
            } catch (IOException|JsonSyntaxException e) {
                View.printMessage("File isn`t load");
                return;
            }
            while (res != ENDCOMMAND){
                View.showWorkMenu();
                res = providerInput.getCommand(ENDCOMMAND);
                executeWorkCommand(res);
            }
      }

    private void executeWorkCommand(int res){
        if(res == 1){
            View.show(data.sort());
        }else if(res == 2){
            View.show(data.range(providerInput.getMinMax()));
        } else if(res == 3){
            View.show(data.getCustomers());
        }else if(res == 4){
            data.delete();
            View.printMessage("Array was delete!");
        } else if ( res == 5){
            try {
                data.writeData(providerInput.getFileName());
                View.printMessage("Data stored!");
            } catch (IOException e){
                View.printMessage("Error! File don't save!");
            }
        } else if ( res == 6){
            try {
                data.readFile(providerInput.getFileName());
                View.printMessage("Data has been read from file!");
            } catch (IOException e){
                View.printMessage("File is not found or injured!");
            } catch (JsonSyntaxException e){
                View.printMessage("File not json format!");
            }
        }   else {
            View.printMessage("Exit");
        }
    }

}
