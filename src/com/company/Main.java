package com.company;


import java.util.Random;

public class Main {

    public static String[] ExamsAndOffsets() {
        final Random random = new Random();
        String[] Subjects = {"History ","Math ","English ","Analysis ","Informatics ","Algorithms ", "Physics "}; // 7
        String[] result = new String[3];
        int[] used = {-1,-1};
        for (int i=0;i<3;i++){
            int number = random.nextInt(Subjects.length);
            if(number == used[0] || number == used[1]) {
                i--;
            } else{

                result[i]=Subjects[number];
                if(i == 2) break;
                used[i]=number;
            }

        }
        return result;
    }
    public static studentRecordBook[] FillTheObjects(studentRecordBook[] list){
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

        for(int i=0;i<list.length;i++) {

            list[i] = new studentRecordBook(
                    Names[random.nextInt(Names.length)],
                    Forenames[random.nextInt(Forenames.length)],
                    Fatherlands[random.nextInt(Fatherlands.length)],
                    random.nextInt(100000),
                    (byte) (random.nextInt(5)+1),
                    ExamsAndOffsets(),
                    ExamsAndOffsets(),
                    (float) (random.nextFloat()*2+3)
            );
            System.out.println(list[i].toString());
        }

        return  list;
    }

    public static void main(String[] args) {
        studentRecordBook[] students = new studentRecordBook[20];
        FillTheObjects(students);
    }
}
