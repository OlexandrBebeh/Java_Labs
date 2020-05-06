package com.company.view;

import com.company.customerClass.entities.Customer;

public class View {

    public static void showStartMenu(){
            System.out.println("Select command:" +
                    "\n1 - Random create" +
                    "\n2 - Download from file" +
                    "\n3 - Exit");
    }

    public static void showWorkMenu(){
        System.out.println("Select command:" +
                    "\n1 - Get sorted customers" +
                    "\n2 - Get customers in range of credit card" +
                    "\n3 - Show customers" +
                    "\n4 - Delete data" +
                    "\n5 - Store data to file" +
                    "\n6 - Load data from file" +
                    "\n7 - Exit");
    }

    public static void show(Customer[] list){
        if(list == null || list.length == 0) {
            System.out.println("Array of users is empty!");
            return;}
        showHeader();
        for (Customer customer : list) {
            System.out.printf("%-13s | ", customer.getForename());
            System.out.printf("%-12s | ", customer.getSurname());
            System.out.printf("%-18s | ", customer.getFatherland());
            System.out.printf("%-20s | ", customer.getAddress());
            System.out.printf("%-18s | ", customer.getCreditCard());
            System.out.printf("%-18s\n", customer.getBankAccount());
        }
    }

    public static void show(Customer customer){
        System.out.println(customer.toString());
    }

    private static void showHeader() {
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
