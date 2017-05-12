package com.company;

import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {
        File raw = new File("rawDataU6.txt");
        File names = new File("Names.tsv");
        Scanner sc = new Scanner(raw);
        Scanner sc2 = new Scanner(names);
        sc.useDelimiter("\t|\"");
        sc2.useDelimiter("\t");
        ArrayList<Student> x = new ArrayList<>();
        String reader;
        String s[], st[];
        int secnum = 1, num;
        double q1;
        double q2;
        sc.nextLine();
        sc.next();
        double add = 0;
        while(sc.hasNext()) {
            q1 = 0;
            q2 = 0;
            num = sc.nextInt();
            if(secnum == num){

            }else{
                secnum = num;
                Student a = new Student(sc2.next(), secnum, q1, q2);
                x.add(a);
                sc2.nextLine();
            }
            sc.next();
            reader = sc.next();
            st = reader.split(",");
            for (int i = 0; i < st.length; i++) {
                s = st[i].split(" ");
                for (int j = 0; j < s.length; j++) {
                    try {
                        add = Double.parseDouble(s[j]);
                    } catch (NumberFormatException e) {

                    }
                }
                q1 += add;
                add = 0;
            }
            try{
                q1 -= sc.nextDouble()/4;
            }catch(InputMismatchException e){

            }
            st = sc.next().split(",");
            if(!(st[0].equals("+")))
            {
                sc.next();
            }
            reader = sc.next();
            st = reader.split(",");
            for (int i = 0; i < st.length; i++) {
                s = st[i].split(" ");
                for (int j = 0; j < s.length; j++) {
                    try {
                        add = Double.parseDouble(s[j]);
                    } catch (NumberFormatException e) {

                    }
                }
                q2 += add;
                add = 0;
            }
            try{
                q2 -= sc.nextDouble()/4;
            }catch(InputMismatchException e){

            }
            st = sc.next().split(",");
            if(!(st[0].equals("+")))
            {
                sc.next();
            }

        }
        System.out.print("Number");
        getTabs("Number", 6);
        System.out.print("Name");
        getTabs("Name", 6);
        System.out.print("Q1 Grade");
        getTabs("Q1 Grade", 6);
        System.out.print("Q2 Grade");
        getTabs("Q2 Grade", 6);
        System.out.println("Average Grade");
        Student.Sort(x);
        for (int i = 0; i < x.size(); i++) {
            x.get(i).String();
        }

    }


    public static void getTabs(String s, int max){
        int i = max - s.length()/4;
        for (int j = 0; j < i; j++) {
            System.out.println("\t");
        }
    }

}
