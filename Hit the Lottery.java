// Akash Yadav
// @Hudson Lane, Delhi
// 24th June 18

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

public class TestClass{

	//http://codeforces.com/contest/996/problem/0

	public static Scanner scn = new Scanner(System.in);

	public static void main (String[] args) throws java.lang.Exception{

		int N = scn.nextInt();

		int ans = notes100(N);

		System.out.println(ans);
	}

	public static int notes100(int N){

		int ans = N/100;

		if(N%100 == 0)
			return ans;

		int remain = N%100;

		return ans + notes20(remain);
	}

	public static int notes20(int N){

		int ans = N/20;

		if(N%20 == 0)
			return ans;

		int remain = N%20;

		return ans + notes10(remain);
	}

	public static int notes10(int N){

		int ans = N/10;

		if(N%10 == 0)
			return ans;

		int remain = N%10;

		return ans + notes5(remain);
	}

	public static int notes5(int N){

		int ans = N/5;

		if(N%5 == 0)
			return ans;

		int remain = N%5;

		return ans + remain;
	}
}
