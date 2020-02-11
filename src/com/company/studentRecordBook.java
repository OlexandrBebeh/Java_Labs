package com.company;

public class studentRecordBook {

    public String Surname;
    public String Forename;
    public String Fatherland;
    public int Number;
    public byte Course;
    public String[] Exams;
    public String[] Offset;
    public float MiddleMark;

    public studentRecordBook() {

    }

    public studentRecordBook(String surname, String forename, String fatherland, int number, byte course) {
        Surname = surname;
        Forename = forename;
        Fatherland = fatherland;
        Number = number;
        Course = course;
    }

    public studentRecordBook(String surname, String forename, String fatherland, int number, byte course, String[] exams, String[] offset, float middleMark) {
        Surname = surname;
        Forename = forename;
        Fatherland = fatherland;
        Number = number;
        Course = course;
        Exams = exams;
        Offset = offset;
        MiddleMark = middleMark;
    }


}
