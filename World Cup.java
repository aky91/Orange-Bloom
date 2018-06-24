// Akash Yadav
// @Hudson Lane, Delhi
// 24th June 18

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

public class TestClass{

	//http://codeforces.com/contest/996/problem/B

	public static Scanner scn = new Scanner(System.in);

	public static void main (String[] args) throws java.lang.Exception{

		int N = scn.nextInt();

		int[] arr = new int[N];

		boolean allBig = true;
		int small = Integer.MAX_VALUE;

		for(int i = 0; i < N; i++){
			arr[i] = scn.nextInt();
			
			if(arr[i] < N)
				allBig = false;

			if(arr[i] < small)
				small =  arr[i];
		}

		if(allBig){

			int amt = small / N;

			for(int i = 0; i < N; i++)
				arr[i] = arr[i] - amt*N;
		}

		int gate = 0;

		long time = 0;

		while(true){

			if((long)arr[gate] - time <= 0)
				break;

			time++;
			gate = (gate + 1)%N;
		}

		System.out.println(gate + 1);
	}
}
