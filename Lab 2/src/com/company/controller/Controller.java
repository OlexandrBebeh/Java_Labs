package com.company.controller;

import com.company.customerClass.service.DataWork;
import com.company.view.ProviderInput;
import com.company.view.View;

public class Controller {
   private DataWork data = new DataWork();
   private ProviderInput providerInput = new ProviderInput();
   final int ENDCOMMAND = 4;


    public void run(){
        int res = 0;

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
        } else {
            View.printMessage("Exit");
        }
    }

}
