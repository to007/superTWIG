package com.company;

import java.util.*;
import java.io.*;

public class Main
{

    public static void main(String[] args) throws IOException
    {
	    File raw = new File("rawDataU6.txt");
        Scanner sc = new Scanner(raw);
        String reader;
        int count = 0;
        double q1;
        double q2;
        sc.useDelimiter(" +|\t");
        sc.nextLine();
        while(sc.hasNext())
        {
            count++;
            
        }
    }
}
