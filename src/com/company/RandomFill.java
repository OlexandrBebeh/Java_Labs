package com.company;

import java.util.Random;

public class RandomFill {
    public static Customer[] CreateAndFillArray(Customer[] customers){
        for (int i = 0; i < customers.length;i++){
            customers[i] = CreateCustomer();
        }
        return customers;
    }
    private static Customer CreateCustomer(){
        final Random random = new Random();

        String[] Names = {"Olexandr", "Kostya", "Roman","Kasparas","Emil",
                "Hannah","Madison","Ashley","Sarah","Alexis",
                "Samant", "Jessic","Elizabeth","Taylor","Lauren",
                "Alysse","Kayla","Abigail","Brian","Oliviy",
                "Em","Megatron","Grace","Victoriy","Rachel"}; //25
        String[] Forenames = {"Gerega", "Bebeh", "Pischuk",
                "Martin", "Bred", "Volhovets",
                "Shevchenko","Taurus", "Virgo",
                "Fu","Pascal","Bottom",
                "Mish","Liver","la Ruge",
                "Wall", "Boolok"}; // 17
        String[] Fatherlands = {"Olexandrovich", "Romanovich","Kasparasovich","Emiliyovich","Hannahovich",
                "Madisonovich","Ashleyovich","Sarahovich","Alexisiyovich","Samantovich",
                "Jessicovich","Elizabethovich","Taylorovich","Laurenovich","Alyssovich",
                "Kaylovich","Abigailovich","Brianovich","Oliviyovich","Emovich",
                "Megatronovich","Gracovich","Victoriyovich","Rachelovich"}; //24
        String[] Addreses = {"Polova 26","Igora Melnika 56", "Getmana 17","Street of Roses 152",
                "Heroiv Chornobila 1","Wolt Sreet 14", "Beregova 16", "Darkwater street 145",
                "New street 123", "Saolly 146", "Waterfellou 73", "Apple Garden 3",
                "Saints 40", "Bajana Street 90", "Lvivsky Bulvar 43", "Hollywood 78"};
        return  new Customer(
                Names[random.nextInt(Names.length)],
                Forenames[random.nextInt(Forenames.length)],
                Fatherlands[random.nextInt(Fatherlands.length)],
                Addreses[random.nextInt(Addreses.length)],
                random.nextInt(1000000),
                random.nextInt(1000000)
        );
    }
}
