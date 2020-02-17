package com.company;

import java.util.Scanner;

public class View {
    public static void StartRun(){
        int command = 0;

        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("Select command:" +
                    "\n1 - Start work" +
                    "\n2 - Exit");
            command = input.nextInt();
           if(command == 2) break;
           if(command == 1) {
               System.out.println("Input from 1 to 30:");
               int quantity = input.nextInt();

               if(Validator.CheckCreateCustomers(quantity)){
                   Customer[] customers = new Customer[quantity];
                   RandomFill.CreateAndFillArray(customers);
                    ShowCustomers.Show(customers);
                   WorkWithCustomers(customers);
               }
           }
        }

    }

    private static void WorkWithCustomers( Customer[] customers){
        int command = 0;

        Scanner input = new Scanner(System.in);

        while (true){

            System.out.println("Select command:" +
                    "\n1 - Get sorted customers" +
                    "\n2 - Get customers in range of credit card" +
                    "\n3 - Exit");
            command = input.nextInt();
            if(command == 1){
               Customer[] sorted =  Inquiries.GetSortedList(customers);
                ShowCustomers.Show(sorted);
            }
            if(command == 2){
                int     min=input.nextInt(),
                        max=input.nextInt();;

                if(Validator.CheckRange(min,max)){
                    Customer[] CustomersInRange = Inquiries.GetInRAnge(customers,min,max);
                    if(CustomersInRange != null) {
                        ShowCustomers.Show(CustomersInRange);
                    }
                    else {
                        System.out.println("There isn't any account in this range.");
                    }
                }
            }
            if(command == 3) break;
        }
    }

}
