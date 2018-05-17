import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Ideone{

	//https://www.codechef.com/problems/FLAGS

	public static Scanner scn = new Scanner(System.in);

	public static void main (String[] args) throws java.lang.Exception{

		int T = scn.nextInt();

		while(T-- > 0){

			long N = scn.nextInt();

			long ans = 0;

			//pattern 1

			long p1 = 0;

			if(N >= 2){
				//all different
				p1 += N * (N-1) * (N-2);

				//1st and 3rd part same
				p1 += N * (N-1);
			}

			ans += p1;


			//pattern 2

			//same as pattern1

			long p2 = p1;

			ans += p2;


			//pattern 3

			long p3 = 0;

			if(N >= 3){

				//all different
				p3 += N * (N-1) * (N-2);
			}			 

			ans += p3;


			//pattern 4

			long p4 = 0;

			if(N >= 3){

				//all different
				p4 += N * (N-1) * (N-2) * (N-3);

				//part 3 and 4 same
				p4 += N * (N-1) * (N-2);
			}

			ans += p4;


			//pattern 5

			//same as pattern  4

			long p5 = p4;

			ans += p5;

			System.out.println("" + ans);
		}	

	}
}