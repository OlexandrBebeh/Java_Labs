package com.company.customerClass.entities;

public class Customer {
    private String Surname;
    private String Forename;
    private String Fatherland;
    private String Address;
    private int CreditCard;
    private int BankAccount;

    public Customer(String surname, String forename, String fatherland, String address, int creditCard, int bankAccount) {
        Surname = surname;
        Forename = forename;
        Fatherland = fatherland;
        Address = address;
        CreditCard = creditCard;
        BankAccount = bankAccount;
    }

    public Customer() {

    }

    public String getSurname() {

        return Surname;
    }

    public String getForename() {

        return Forename;
    }

    public String getFatherland() {

        return Fatherland;
    }

    public String getAddress() {

        return Address;
    }

    public int getCreditCard() {

        return CreditCard;
    }

    public int getBankAccount() {

        return BankAccount;
    }

    public void setSurname(String surname) {

        Surname = surname;
    }

    public void setForename(String forename) {

        Forename = forename;
    }

    public void setFatherland(String fatherland) {

        Fatherland = fatherland;
    }

    public void setAddress(String address) {

        Address = address;
    }

    public void setCreditCard(int creditCard) {

        CreditCard = creditCard;
    }

    public void setBankAccount(int bankAccount) {
        BankAccount = bankAccount;
    }

    public String toString() {
        return
                Surname + "; " +
                Forename + "; " +
                 Fatherland + "; " +
                Address + "; " +
                 CreditCard + "; " +
                 BankAccount;
    }
}
