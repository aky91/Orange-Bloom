import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Ideone{

	//https://www.codechef.com/problems/AMMEAT2

	public static Scanner scn = new Scanner(System.in);

	public static void main (String[] args) throws java.lang.Exception{

		int T = scn.nextInt();

		while(T-- > 0){

			int N = scn.nextInt();

			int K = scn.nextInt();

			if(K == 1){
				System.out.println("1");
				continue;
			}

			if(2*K > N){
				System.out.println("-1");
				continue;
			}

			for(int i = 1; i <= K; i++)
				System.out.print("" + (2*i) + " ");

			System.out.println();
		}	

	}
}