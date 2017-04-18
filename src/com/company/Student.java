package com.company;

public class Student
{
    double Q1, Q2, avg;
    int secNum;
    String rName;
    public Student(double grade1, double grade2, int secretNum, String realName)
    {
        Q1 = grade1;
        Q2 = grade2;
        secNum = secretNum;
        rName = realName;
        avg = Q1/Q2;
    }
    public void avgGrades(double grade1, double grade2)
    {
        Q1 /= grade1;
        Q2 /= grade2;
    }
}
