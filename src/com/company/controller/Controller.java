package com.company.controller;

import com.company.customerClass.Inquiries;
import com.company.customerClass.Customer;
import com.company.customerClass.RandomFill;
import com.company.view.View;

public class Controller {
    public static void run(){

        int res = 0;

        Provider provider = new Provider();

        while(true){
            View.start();

            res = provider.getRunCommand();

            if(res == 1){
                System.out.println("Input from 1 to 30");
                int quantity = provider.getQuantity();

                Customer[] customers = new Customer[quantity];

                RandomFill.createAndFillArray(customers);

                View.show(customers);

                workWithCustomers(customers);
            }

            if(res == 2) break;
        }
    }

    private static void workWithCustomers(Customer[] customers){
        int command = 0;

        Provider provider = new Provider();

        while (true){
            View.workWithCustomers();

            command = provider.getCustomerCommand();

            if(command == 1){
                Customer[] sorted =  Inquiries.getSortedList(customers);
                View.show(sorted);
            }
            if(command == 2){

                View.conditionRangeMin();

                int min=provider.getCreditCardNumber();

                View.conditionRangeMax();

                int max=provider.getCreditCardNumber();
                if(Validator.swapMinMax(min,max)){
                    int temp = min;
                    min = max;
                    max = temp;
                }
                Customer[] customersInRange = Inquiries.getInRAnge(customers,min,max);
                if(Validator.checkCustomersArray(customersInRange)) {
                    View.missingArray();
                }
                else {
                    View.show(customersInRange);
                }
            }
            if(command == 3) break;
        }
    }
}
