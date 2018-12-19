// Akash Yadav
// @PD Tandon, MNNIT Allahabad
// 18th December 18

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class TestClass{

	//https://www.codechef.com/DEC18B/problems/MAXEP

	public static Scanner scn = new Scanner(System.in);

	public static void main (String[] args) throws java.lang.Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int coins = 1000;

		int volt = 1;

		int range = (int)Math.sqrt(N);

		volt = range;

		while(true){

			System.out.println("1 " + volt);

			int response = Integer.parseInt(br.readLine());

			if(response == 1)
				break;

			volt += range;

			if(volt >= N){
				break;
			}
		}

		System.out.println("2");

		volt -= range;
		volt++;

		while(true){

			System.out.println("1 " + volt);

			int response = Integer.parseInt(br.readLine());

			if(response == 1)
				break;

			volt++;
		}

		System.out.println("3 " + volt);
	}
}
