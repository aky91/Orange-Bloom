// Akash Yadav
// @Hudson Lane, Delhi
// 17th June 18

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class TestClass{

	//https://www.codechef.com/problems/CHEFHOME

	public static Scanner scn = new Scanner(System.in);

	public static void main (String[] args) throws java.lang.Exception{

		int T = scn.nextInt();

		while(T-- > 0){

			int N = scn.nextInt();

			int[] pointsX = new int[N];
			int[] pointsY = new int[N];

			for(int i = 0; i < N; i++){
				pointsX[i] = scn.nextInt();
				pointsY[i] = scn.nextInt();
			}

			long ansX = getAns(pointsX);

			long ansY = getAns(pointsY);

			long ans = ansX * ansY;

			System.out.println(ans);
		}	

	}

	public static long getAns(int[] points){

		Arrays.sort(points);

		int N = points.length;

		long ans = points[N/2] - points[(N - 1)/2] + 1;

		return ans;
	}
}