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

    public byte getCourse() {

        return Course;
    }

    public int getNumber() {

        return Number;
    }

    public String getFatherland() {

        return Fatherland;
    }

    public float getMiddleMark() {

        return MiddleMark;
    }

    public String[] getOffset() {

        return Offset;
    }

    public String[] getExams() {

        return Exams;
    }

    public String getForename() {
        return Forename;
    }

    public String getSurname() {

        return Surname;
    }

    public String toString() {
        String ExamsToString = " ";
        for( int i=0 ; i<Exams.length ; i++ ){
            ExamsToString = ExamsToString + Exams[i]+" ";
        }
        String OffsetToString = " ";
        for( int i=0 ; i<Exams.length ; i++){
            OffsetToString = OffsetToString + Exams[i]+" ";
        }
        return Surname + " | " + Forename + " | " + Fatherland + " | " + Number + " | " + Course + " | " + ExamsToString + " | " + OffsetToString + " | " + MiddleMark;
    }
}
