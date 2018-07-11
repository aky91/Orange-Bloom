// Akash Yadav
// @Mainpuri, UP
// 11th July 18

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class TestClass{

	//https://www.codechef.com/JULY18B/problems/PINS

	public static Scanner scn = new Scanner(System.in);

	public static void main (String[] args) throws java.lang.Exception{

		int T = scn.nextInt();

		while(T-- > 0){

			int N = scn.nextInt();

			//ans is 10^(N/2)

			int num = 1;

			int p = N/2;

			//just print 1 followed by p zeroes
			
			//numerator is always 1 and 1 for the den.
			System.out.print("1 1");

			//printing p zeroes for den.
			for(int i = 1; i <= p; i++)
				System.out.print("0");

			System.out.println();
		}	
	}
}
