package com.company;

/**
 * Created by java on 9/18/2016.
 */
public class collegeStudents extends student {

private String majors;
private int year;

public collegeStudents (String myName,int myAge,String myGender,int myIdNum,float myGPA, int year,String majors)

    {

super(myName,myAge,myGender,myIdNum,myGPA);

     this.majors=majors;
        this.year=year;

    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return super.toString()+"collegeStudents{" +
                "majors='" + majors + '\'' +
                ", year=" + year +
                '}';
    }
}
