// Akash Yadav
// @Hudson Lane, Delhi
// 16th June 18

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class TestClass{

	//https://www.codechef.com/problems/APPROX2

	public static Scanner scn = new Scanner(System.in);

	public static void main (String[] args) throws java.lang.Exception{

		int T = scn.nextInt();

		while(T-- > 0){

			int N = scn.nextInt();
			int K = scn.nextInt();

			int[] arr = new int[N];

			for(int i = 0; i < N; i++)
				arr[i] = scn.nextInt();

			long min = 2000000000;

			long freq = 0;

			for(int i = 0; i < N; i++){
				for(int j = i + 1; j < N; j++){

					long sum = Math.abs(arr[i] + arr[j] - K);

					if(sum < min){
					
						min = sum;
						freq = 1;
					
					} else if(sum == min){

						freq++;
					}
				}
			}

			System.out.println(min + " " + freq);
		}	

	}
}