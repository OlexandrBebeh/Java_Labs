package com.company;


public class Main {

    public static studentRecordBook[] FillTheObjects(studentRecordBook[] list){

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
        return  list;
    }

    public static void main(String[] args) {
        studentRecordBook[] students = new studentRecordBook[20];
        FillTheObjects(students);
    }
}
