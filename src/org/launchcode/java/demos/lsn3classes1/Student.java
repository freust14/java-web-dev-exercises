package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    // name getter
    public String getName(){
        return name;
    }

    // name setter
    public void setName(String aName){
        name = aName;
    }


    // studentId getter
    public int getStudentId(){
        return studentId;
    }

    // studentId setter
    public void setStudentId(int aStudentId){
        studentId = aStudentId;
    }

    // numberOfCredits getter
    public int getNumberOfCredits(){
        return numberOfCredits;
    }

    // numberOfCredits setter
    public void setNumberOfCredits(int aNumberOfCredits){
        numberOfCredits = aNumberOfCredits;
    }

    // gpa getter
    public double getGpa(){
        return gpa;
    }

    // gpa setter
    private void setGpa(double aGpa){
        gpa = aGpa;
    }

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;

    }



}