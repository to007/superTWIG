package com.company;

import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {
	    File raw = new File("rawDataU6.txt");
        Scanner sc = new Scanner(raw);
        Scanner sc2 = new Scanner(raw);
        ArrayList<Student> x = new ArrayList<>();
        String reader;
        int secnum = 1;
        double q1 = 0;
        double q2 = 0;
        boolean moveOn = true, o = false;
        sc.useDelimiter(" +|\t");
        sc.nextLine();
        int add = 0;
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
            for (int i = 0; i < reader.length(); i++) {
                    try {
                        add = 0;
                        add = Integer.parseInt(reader.substring(i,i + 1));
                    }catch(NumberFormatException e) {

                    }
                }
            if(add == 5){
                q1 += .5;
            }else{
                q1 += (double)add;
            }


        }
        System.out.println(q1);
    }
}
