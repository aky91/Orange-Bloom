// Akash Yadav
// @Hudson Lane, Delhi
// 12th July 18

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class TestClass{

	//https://www.codechef.com/JULY18B/problems/MGCSET

	public static Scanner scn = new Scanner(System.in);

	public static void main (String[] args) throws java.lang.Exception{

		int T = scn.nextInt();

		while(T-- > 0){

			int N = scn.nextInt();
			int M = scn.nextInt();
			
			ArrayList<Integer> arr = new ArrayList<>();

			for(int i = 0; i < N; i++)
				arr.add(scn.nextInt());

			//count the number of terms divisible by M
			int count = 0;

			for(int i = 0; i < N; i++){

				int num = arr.get(i);

				if(num % M == 0)
					count++;
			}

			//answer is all possible combinations of count
			// answer = 2^count - 1

			long answer = power(2, count) - 1;

			System.out.println(answer);
		}	
	}

	public static long power(int base, int power){

		if(power == 0) return 1;

		if(power == 1) return base;

		long answer = power(base, power/2);
		
		answer = answer * answer;
		
		if(power % 2 != 0)
		    answer *= base;
		    
		return answer;
	}
}
