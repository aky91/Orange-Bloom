// Akash Yadav
// @Hudson Lane, Delhi
// 25th June 18

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

public class TestClass{

	//https://codeforces.com/problemset/problem/995/B

	public static Scanner scn = new Scanner(System.in);

	public static void main (String[] args) throws java.lang.Exception{

		int N = scn.nextInt();

		int[] arr = new int[2*N];

		for(int i = 0; i < 2*N; i++)
			arr[i] = scn.nextInt();

		long ans = 0;

		for(int i = 0; i < 2*N; i++){

			int cloak = i;

			int dagger = -1;

			for(int j = i + 1; j < 2*N; j++){
				if(arr[j] == arr[cloak]){
					dagger = j;
					break;
				}
			}

			if(dagger == -1)
				continue;

			while(dagger - 1 != cloak){

				//swap arr[dagger] & arr[dagger - 1]
				int temp = arr[dagger];
				arr[dagger] = arr[dagger - 1];
				arr[dagger - 1] = temp;

				dagger--;
				ans++;
			}

			i++;
		}

		System.out.println(ans);
	}		
}
