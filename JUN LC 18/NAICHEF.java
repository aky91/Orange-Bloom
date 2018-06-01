import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Ideone{

	//https://www.codechef.com/JUNE18B/problems/NAICHEF

	public static Scanner scn = new Scanner(System.in);

	public static void main (String[] args) throws java.lang.Exception{

		int T = scn.nextInt();

		while(T-- > 0){

			int N = scn.nextInt();
			int A = scn.nextInt();
			int B = scn.nextInt();

			int[] arr = new int[N];

			int countA = 0;
			int countB = 0;

			for(int i = 0; i < N; i++){

				arr[i] = scn.nextInt();

				if(arr[i] == A)
					countA++;

				if(arr[i] == B)
					countB++;
			}

			double ans = (1.0*countA/N) * (1.0*countB/N);

			System.out.println(ans);
		}	

	}
}