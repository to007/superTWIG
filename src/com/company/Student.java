package com.company;

import java.util.ArrayList;
import java.util.Scanner;

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
    public String getName(){
        return name;
    }
    public void String(){
        System.out.print(Integer.toString(snum));
        Main.getTabs(Integer.toString(snum), 6);
        System.out.print(name);
        Main.getTabs(name, 6);
        System.out.print(Double.toString(q1));
        Main.getTabs(Double.toString(q1), 6);
        System.out.print(Double.toString(q2));
        Main.getTabs(Double.toString(q2), 6);
        System.out.println(Double.toString(avg));
    }
    public static int compareTo(Student z,Student x, int y){
        if(z.getName().substring(y,y+1).equals(x.getName().substring(y,y+1))){
            return compareTo(z, x, y + 1);
        }else if((int)z.getName().charAt(y) > (int)x.getName().charAt(y)){
            return 1;
        }
        return -1;
    }
    public static ArrayList Sort(ArrayList<Student> x){
        Student temp;
        for (int i = 0; i < x.size(); i++) {
            for (int j = i; j < x.size() - 1; j++) {
                if (compareTo(x.get(j), x.get(j + 1), 0) == 1) {
                    temp = x.get(j);
                    x.set(j, x.get(j + 1));
                    x.set(j + 1, temp);
                }else if(compareTo(x.get(j), x.get(j + 1), 0) == -1 || compareTo(x.get(j), x.get(j + 1), 0) == 0){
                    break;
                }
            }
        }
        return x;
    }
}
