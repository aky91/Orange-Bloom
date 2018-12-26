// Akash Yadav
// @Sohar, Oman
// 26th December

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class TestClass{

	//https://www.codechef.com/problems/CSUMD

	public static Scanner scn = new Scanner(System.in);
	public static long MOD = 1000000007L;

	public static void main (String[] args) throws java.lang.Exception{

		int T = scn.nextInt();

		while(T-- > 0){

			long N = scn.nextLong();

			long ans = 0;

			if(N == 1)
				ans = 1;
			else if(N == 2)
				ans = 3;
			else
				ans = (fun(N-1) + fun(N-2))%MOD;

			System.out.println(ans);
		}
	}

	public static long fun(long N){

		if(N == 1) return 2;
		if(N == 2) return 6;

		long[][] mat = {{2,2},{1,0}};
		long[][] m   = {{2,2},{1,0}};

		long pow = N;

		long ans =  power(mat, pow, m);

		return ans;
	}

	public static long power(long[][] mat, long pow, long[][] m){

		if(pow == 1)
		    return ((6 * mat[0][0])%MOD + (2 * mat[0][1])%MOD)%MOD;;

		power(mat, pow/2, m);
		
		multiply(mat, mat);

		if(pow % 2 == 1)
			multiply(mat, m);

		
		return mat[0][0];
	}

	public static void multiply(long[][] a, long[][] b){
		long[][] c = new long[2][2];

		c[0][0] = ((a[0][0] * b[0][0])%MOD + (a[0][1] * b[1][0])%MOD)%MOD;
		c[0][1] = ((a[0][0] * b[0][1])%MOD + (a[0][1] * b[1][1])%MOD)%MOD;
		c[1][0] = ((a[1][0] * b[0][0])%MOD + (a[1][1] * b[1][0])%MOD)%MOD;
		c[1][1] = ((a[1][0] * b[0][1])%MOD + (a[1][1] * b[1][1])%MOD)%MOD;

		a[0][0] = c[0][0]; a[0][1] = c[0][1]; a[1][0] = c[1][0]; a[1][1] = c[1][1];
	}
}
