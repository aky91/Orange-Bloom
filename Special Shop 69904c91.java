// Akash Yadav
// @PD Tandon, MNNIT, Allahabad
// 26th July 18

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class TestClass{

	//https://www.hackerearth.com/challenge/competitive/july-circuits-18/algorithm/special-shop-69904c91/

	public static Scanner scn = new Scanner(System.in);

	public static void main (String[] args) throws java.lang.Exception{

		int T = scn.nextInt();

		while(T-- > 0){

			long N = scn.nextLong();
			long A = scn.nextLong();
			long B = scn.nextLong();
			
			double X = 1.0 * N * B / (A + B);
			double Y = 1.0 * N * A / (A + B);
			
			double x1 = Math.floor(X);
			double y1 = Math.ceil(Y);
			
			double ans1 = A * x1 * x1 + B * y1 * y1;
			
			double x2 = Math.ceil(X);
			double y2 = Math.floor(Y);
			
			double ans2 = A * x2 * x2 + B * y2 * y2;

			System.out.println((long)Math.min(ans1, ans2));
		}
	}
}
