package com.company;

public class Student
{
    public String name;
    public int snum;
    public double avg, q1, q2;
    public Student(String Name, int secnum, double q1Grade, double q2Grade)
    {
        name = Name;
        snum = secnum;
        avg = (q1 + q2) / 2;
        q1 = q1Grade;
        q2 = q2Grade;
    }
    public void String(){
        System.out.print(Integer.toString(snum));
        Main.getTabs(Integer.toString(snum), 6);
        System.out.print(name);
        Main.getTabs(name, 6);
    }
}
