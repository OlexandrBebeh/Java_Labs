package com.company;

public class ShowCustomers {
    public static void Show(Customer[] list){
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
    public static void Show(Customer customer){
        System.out.println("Forename    " + " | " +
                "Surname    " + " | " +
                "Fatherland       " + " | " +
                "Address            " + " | " +
                "CreditCard       " + " | " +
                "BankAccount      ");
        System.out.println(customer.toString());
    }
}
