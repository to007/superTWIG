package com.company;

import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {
	    File raw = new File("rawDataU6.txt");
        Scanner sc = new Scanner(raw);
        Scanner sc2 = new Scanner(raw);
        sc.useDelimiter("\t|,");
        ArrayList<Student> x = new ArrayList<>();
        String reader;
        String s[];
        int secnum = 1;
        double q1 = 0;
        double q2 = 0;
        boolean moveOn = true, o = false;
        sc.nextLine();
        sc.next();
        double add = 0;
        while(sc.hasNext()) {
            if(moveOn && o) {
                Student a = new Student(sc2.next(), secnum, q1, q2);
                x.add(a);
                secnum = sc.nextInt();
                sc2.nextLine();
            }
            o = true;
            moveOn = false;
            reader = sc.next();
            s = reader.split(" ");
            for (int i = 0; i < s.length; i++) {
                try {
                    add = Double.parseDouble(s[i]);
                }catch(NumberFormatException e) {

                }
            }
            q1 += add;
            add = 0;

        }
        System.out.println(q1);
    }
}
