import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Ideone{

	//https://www.codechef.com/problems/EQUALITY

	public static Scanner scn = new Scanner(System.in);

	public static void main (String[] args) throws java.lang.Exception{

		int T = scn.nextInt();

		while(T-- > 0){

			int N = scn.nextInt();

			long[] arr = new long[N+1];

			long sumA = 0;

			for(int i = 1; i <= N; i++){
				arr[i] = scn.nextLong();
				sumA += arr[i];
			}

			long sumX = sumA/(N-1);

			for(int i = 1; i <= N; i++){

				long x = sumX - arr[i];

				System.out.print("" + x + " ");
			}

			System.out.println();
		}	

	}
}