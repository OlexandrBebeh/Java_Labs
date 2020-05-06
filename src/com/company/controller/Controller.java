package com.company.controller;

import com.company.customerClass.service.DataWork;
import com.company.view.Provider;
import com.company.view.View;

import java.io.IOException;

public class Controller {
   private DataWork data;
   private Provider provider;
   final int ENDCOMMAND = 7;

    public void run(){
        int res = 0;
        try {
            data = new DataWork();
        } catch (IOException e){
            View.printMessage(e.getMessage());
        }
        while (res != ENDCOMMAND){
            View.showWorkMenu();
            res = provider.getCommand(ENDCOMMAND);
            executeWorkCommand(res);
        }
    }

    private void executeWorkCommand(int res){
        if(res == 1){
            View.show(data.sort());
        }else if(res == 2){
            View.show(data.range(provider.getMinMax()));
        } else if(res == 3){
            View.show(data.getCustomers());
        }else if(res == 4){
            data.delete();
            View.printMessage("Array was delete!");
        } else if ( res == 5){
            try {
                data.storeData(provider.getFileName());
                View.printMessage("Data stored!");
            } catch (IOException e){
                View.printMessage(e.getMessage());
            }
        } else if ( res == 6){
            try {
                data.readFile(provider.getFileName());
                View.printMessage("Data has been read from file!");
            } catch (IOException e){
                View.printMessage(e.getMessage());
            }
        }   else {
            View.printMessage("Exit");
        }
    }

}
