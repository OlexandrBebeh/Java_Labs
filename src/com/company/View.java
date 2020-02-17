package com.company;


public class View {
    public static void StartRun(){
        String command = "";

        while(true){
           if(command == "exit") break;
           if(command == "start") {
               int quantity = 20;

               if(Validator.CheckCreateCustomers(quantity)){
                   Customer[] customers = new Customer[quantity];
                   customers = RandomFill.CreateAndFillArray(customers);
                   WorkWithCustomers(customers);
               }
           }
        }
    }

    private static void WorkWithCustomers( Customer[] customers){
        String command = "";

        while (true){
            if(command == "1"){
               Customer[] sorted =  Inquiries.GetSortedList(customers);

            }
            if(command == "2"){
                int min=0,max=0;

                if(Validator.CheckRange(min,max)){
                    Customer[] CustomersInRange = Inquiries.GetInRAnge(customers,min,max);
                }


            }
        }
    }

}
