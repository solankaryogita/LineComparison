package com.Bridgelabz;

import java.util.*;
import java.lang.Math.*;


public class LineComparesion {

	public static void main(String[] args) {

		    System.out.println("Welcome to Line comparison ");
		    Integer x1=2 , x2=6 , y1=4 , y2=6, p1=2 , p2=5 , q1=4 , q2=5;

		    Double AB, PQ;

		    AB = Math.sqrt((x2-x1)^2+(y2-y1)^2);
		    System.out.println("Legnth of l1="+AB);
		    
		    PQ = Math.sqrt((p2-p1)^2+(q2-q1)^2);
		    System.out.println("Legnth of l2="+PQ);

		    System.out.println("Check Two lines are equal or not :");
		    System.out.println(AB.equals(PQ));
		    
		    System.out.println("Compare two lines :");
		    System.out.println(AB.compareTo(PQ));

	}
}

