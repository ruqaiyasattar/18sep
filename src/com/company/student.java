package com.company;

/**
 * Created by java on 9/18/2016.
 */
public class student {


    private String myName;
    private int myAge;
    private String myGender;
    private int myIdNum;
    private float myGPA;

    public student(String myName, int myAge, String myGender,int myIdNum, float myGPA)
    {

        this.myName=myName;
        this.myAge=myAge;
        this.myGender=myGender;
        this.myIdNum=myIdNum;
        this.myGPA=myGPA;

    }

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public int getMyAge() {
        return myAge;
    }

    public void setMyAge(int myAge) {
        this.myAge = myAge;
    }

    public String getMyGender() {
        return myGender;
    }

    public void setMyGender(String myGender) {
        this.myGender = myGender;
    }

    public int getMyIdNum() {
        return myIdNum;
    }

    public void setMyIdNum(int myIdNum) {
        this.myIdNum = myIdNum;
    }

    public float getMyGPA() {
        return myGPA;
    }

    public void setMyGPA(float myGPA) {
        this.myGPA = myGPA;
    }

    @Override
    public String toString() {
        return "student{" +
                "myName='" + myName + '\'' +
                ", myAge=" + myAge +
                ", myGender='" + myGender + '\'' +
                ", myIdNum=" + myIdNum +
                ", myGPA=" + myGPA +
                '}';
    }
}
