/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

public class Challenge2 {

	public static double nCr(int n, int r) {
		double result = 0;

		/*
		 * Complete this method to calculate the nCr from input numbers 'n' and 'r'
		 */
		return fact(n) / (fact(r) * fact(n - r)); 
		
	}

	public static double nPr(int n, int r) {
	 
		/*
		 * Complete this method to calculate the nPr from input number 'n' and 'r'
		 */
				double per=fact(n)/fact(n-r);	
				return per;
	}

	public static double fact(int n) {
		int res = 1; 
    		for (int i = 2; i <= n; i++) 
        		res = res * i; 
    		return res; 
	}

	public static void main(String arg[]) {

		double res1 = fact(2);
		System.out.println("Factorial of 2 is : " + res1);

		double res2 = fact(4);
		System.out.println("Factorial of 140 is : " + res2);

		double res3 = fact(6);
		System.out.println("Factorial of 6 is : " + res3);

		double res4 = fact(8);
		System.out.println("Factorial of 8 is : " + res4);

		double res5 = nCr(5, 2);
		System.out.println("5C2 : " + res5);

		double res6 = nCr(6, 4);
		System.out.println("6C4 : " + res6);

		double res7 = nPr(5, 2);
		System.out.println("5P2 : " + res7);

		double res8 = nPr(6, 4);
		System.out.println("6P4 : " + res8);

	}
}
