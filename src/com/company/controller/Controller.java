package com.company.controller;

import com.company.customerClass.DataWork;
import com.company.view.Provider;
import com.company.view.View;

public class Controller {
   static DataWork data = new DataWork();
   static Provider provider = new Provider();
    public static void run(){
        int res = 0;

        while(res != 3) {
            View.startMenu();
            res = provider.getRunCommand();
            startMenu(res);
        }
    }

    private static void startMenu(int res){
        if(res == 1){
            fillData();
            workWithData();
        } else if(res == 2){
            View.printMessage("Ooops! This function isn't unable! Sorry for this;)");
        } else {
            View.printMessage("Ending work...");
        }
    }
    private static void fillData(){

        int quantity = provider.getQuantity();
        data.dataCreate(quantity);
    }

    private static void workWithData(){
        int res = 0;
        while (res != 5){
            View.workWithCustomers();
            res = provider.getCustomerCommand();
            workCommands(res);
        }
    }

    private static void workCommands(int res){
        if(res == 1){
            showSorted();
        }else if(res == 2){
            showInRange();
        } else if(res == 3){
            View.show(data.getCustomers());
        }else if(res == 4){
            deleteCustomer();
        } else {
            View.printMessage("Exit");
        }
    }

    private static void showSorted(){
        data.sort();
        View.show(data.getCustomers());
    }

    private static void showInRange(){
        View.show(data.range(provider.getMinMax()));
    }

    private static void deleteCustomer(){
        data.delete();
        View.printMessage("Array was delete!");
    }
}
