// Akash Yadav
// @Hudson Lane, Delhi
// 17th June 18

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class TestClass{

	//https://www.hackerearth.com/challenge/competitive/june-circuits-18/algorithm/construct-the-set-7a9a6be2/

	public static Scanner scn = new Scanner(System.in);

	public static void main (String[] args) throws java.lang.Exception{

		int N = scn.nextInt();	
		int M = scn.nextInt();	
		int D = scn.nextInt();	

		int[] S = new int[M];
		int[] sorted = new int[M];

		for(int i = 0; i < M; i++){
			S[i] = scn.nextInt();
			sorted[i] = S[i];
		}

		Arrays.sort(sorted);

		HashSet<Integer> ans = new HashSet<>();

		for(int i = 0; i < N; i++)
			ans.add(sorted[i]);

		for(int data : S){

			if(ans.contains(data))
				System.out.print(data + " ");
		}

		System.out.println();
	}
}