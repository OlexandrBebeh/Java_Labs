package com.company.view;

import com.company.customerClass.Customer;

public class View {

    public static void start(){
            System.out.println("Select command:" +
                    "\n1 - Start work" +
                    "\n2 - Exit");
    }

    public static void workWithCustomers(){
        System.out.println("Select command:" +
                    "\n1 - Get sorted customers" +
                    "\n2 - Get customers in range of credit card" +
                    "\n3 - Exit");
    }

    public static void show(Customer[] list){
        System.out.println("Forename     " + " | " +
                "Surname     " + " | " +
                "Fatherland        " + " | " +
                "Address             " + " | " +
                "CreditCard        " + " | " +
                "BankAccount       ");
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
        System.out.println("Forename    " + " | " +
                "Surname    " + " | " +
                "Fatherland       " + " | " +
                "Address            " + " | " +
                "CreditCard       " + " | " +
                "BankAccount      ");
        System.out.println(customer.toString());
    }

    public static void mistakeInRange(){
        System.out.println("Wrong range! It must be from 0 to 1000000");
    }

    public static void conditionRangeMin(){

        System.out.println("Input min:");
    }

    public static void conditionRangeMax(){

        System.out.println("Input max:");
    }

    public static void missingArray(){

        System.out.println("There isn't any account in this range.");
    }

    public static void wrongCommand(){

        System.out.println("There is wrong command!.");
    }

    public static void mistakeInQuantity(){
        System.out.println("There is wrong quantity! It should be from 1 to 30.");
    }
}
