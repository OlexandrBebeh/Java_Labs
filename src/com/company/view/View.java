package com.company.view;

import com.company.customerClass.Customer;

public class View {

    public static void startMenu(){
            System.out.println("Select command:" +
                    "\n1 - Random create" +
                    "\n2 - Download from file" +
                    "\n3 - Exit");
    }

    public static void workWithCustomers(){
        System.out.println("Select command:" +
                    "\n1 - Get sorted customers" +
                    "\n2 - Get customers in range of credit card" +
                    "\n3 - Show customers" +
                    "\n4 - Delete data" +
                    "\n5 - Exit");
    }

    public static void show(Customer[] list){
        if(list == null) {
            System.out.println("Array of users is empty!");
            return;}
        properties();
        for(int i = 0; i< list.length; i++){
            System.out.printf("%-13s | ", list[i].getForename());
            System.out.printf("%-12s | ", list[i].getSurname());
            System.out.printf("%-18s | ", list[i].getFatherland());
            System.out.printf("%-20s | ", list[i].getAddress());
            System.out.printf("%-18s | ", list[i].getCreditCard());
            System.out.printf("%-18s\n", list[i].getBankAccount());
        }
    }

    public static void show(Customer customer){
        System.out.println(customer.toString());
    }

    private static void properties() {
        System.out.println("Forename     " + " | " +
                "Surname     " + " | " +
                "Fatherland        " + " | " +
                "Address             " + " | " +
                "CreditCard        " + " | " +
                "BankAccount       ");
    }

    public static void printMessage(String message){
        System.out.println(message);
    }

}
