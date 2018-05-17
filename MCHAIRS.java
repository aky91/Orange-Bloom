import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Ideone{

	//https://www.codechef.com/problems/MCHAIRS

	public static Scanner scn = new Scanner(System.in);

	public static int MOD = 1000000007;

	public static void main (String[] args) throws java.lang.Exception{

		int T = scn.nextInt();

		while(T-- > 0){

			int N = scn.nextInt();

			long ans = getAns(2,N) - 1;

			System.out.println(ans);
		}	
	}

	public static long getAns(int x, int n){

		if(n == 0)
			return 1;

		if(n == 1)
			return x;

		long res = getAns(x, n/2);

		res = (res % MOD * res % MOD)%MOD;

		if(n % 2 == 1)
			res = (res % MOD * x % MOD)%MOD;

		return res;
	}

	public static long getAns2(int x, int n){
		
		long r = 1;
		long y = x;

		while (n > 1) { 

			if (n%2 == 1)
				r = (r*y)%MOD;

			n = (int)Math.floor(n/2);
			y =  (y*y)%MOD;
		}

		r =  (r*y)%MOD;

		return r;
	}
}