package com.company;

public class ShowCustomers {
    public static void Show(Customer[] list){
        System.out.println("Surname;" + " | " +
                "Forename" + " | " +
                "Fatherland" + " | " +
                "Address" + " | " +
                "CreditCard" + " | " +
                "BankAccount");
        for(int i = 0; i< list.length; i++){
            System.out.println(list[i].toString());
        }
    }
    public static void Show(Customer customer){
        System.out.println("Surname;" + " | " +
                "Forename" + " | " +
                "Fatherland" + " | " +
                "Address" + " | " +
                "CreditCard" + " | " +
                "BankAccount");
        System.out.println(customer.toString());
    }
}
