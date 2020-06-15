package com.company.view;

import com.company.customerClass.entities.Customer;

import java.text.NumberFormat;
import java.util.Locale;

public class View {
    public static LanguageManager languageManager;
    static {
        languageManager = LanguageManager.INSTANCE;
    }
    public static NumberFormat numberFormat = NumberFormat.getInstance();
    public static void showLanguageMenu(){
            System.out.println("Select language (default English):" +
                    "\n1 - Українська" +
                    "\n2 - 日本語" +
                    "\n3 - English");
    }

    public static void showWorkMenu(){
        System.out.println(languageManager.getString("menu_start"));
        System.out.println(languageManager.getString("menu1"));
        System.out.println(languageManager.getString("menu2"));
        System.out.println(languageManager.getString("menu3"));
        System.out.println(languageManager.getString("menu4"));
        System.out.println(languageManager.getString("menu5"));
        System.out.println(languageManager.getString("menu6"));
        System.out.println(languageManager.getString("menu7"));
        System.out.println(languageManager.getString("menu8"));
        System.out.println(languageManager.getString("menu9"));
    }

    public static void show(Customer[] list){
        if(list == null || list.length == 0) {
            System.out.println(languageManager.getString("empty_user"));
            return;}
        showHeader();
        for (Customer customer : list) {
            System.out.printf("%-13s | ", customer.getForename());
            System.out.printf("%-12s | ", customer.getSurname());
            System.out.printf("%-18s | ", customer.getFatherland());
            System.out.printf("%-20s | ", customer.getAddress());
            System.out.printf("%-18s | ", numberFormat.format(customer.getCreditCard()));
            System.out.printf("%-18s\n", numberFormat.format(customer.getBankAccount()));
        }
    }

    public static void show(Customer customer){
        System.out.println(customer.toString());
    }

    private static void showHeader() {
        System.out.printf("%-13s | ", languageManager.getString("forename"));
        System.out.printf("%-12s | ", languageManager.getString("surname"));
        System.out.printf("%-18s | ", languageManager.getString("fatherland"));
        System.out.printf("%-20s | ", languageManager.getString("address"));
        System.out.printf("%-18s | ", languageManager.getString("credit_card"));
        System.out.printf("%-18s\n", languageManager.getString("bank_account"));
    }

    public static void printLocalMessage(String message){
        System.out.println(languageManager.getString(message));
    }

    public static void changeLanguage(int lan){
        if(lan == 1){
            languageManager.changeLanguage(new Locale("uk","UA"));
            numberFormat = NumberFormat.getInstance(Locale.GERMANY);
        } else if (lan == 2) {
            languageManager.changeLanguage(new Locale("ja","JP"));
            numberFormat = NumberFormat.getInstance(Locale.JAPAN);
        } else {
            languageManager.changeLanguage(Locale.getDefault());
            numberFormat = NumberFormat.getInstance(Locale.UK);
        }
    }
    public static void printMessage (String message){
        System.out.println(message);
    }

}
