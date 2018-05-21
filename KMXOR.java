import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Ideone{

	//https://www.codechef.com/problems/KMXOR

	public static Scanner scn = new Scanner(System.in);

	public static void main (String[] args) throws java.lang.Exception{

		int T = scn.nextInt();

		while(T-- > 0){

			int N = scn.nextInt();

			int K = scn.nextInt();

			//getting highest perfect power of 2
			int highest = (int)Math.pow(2, (int)Math.floor(Math.log(K)/Math.log(2)));

			if(N == 1){

				System.out.println(K);

			} else if(K == 1){

				for(int i = 1 ; i <= N ; i++)
					System.out.print("1 ");

				System.out.println();

			} else if(K == 2){

				System.out.print("2 ");

				for(int i = 1 ; i <= N-1 ; i++)
					System.out.print("1 ");

				System.out.println();

			} else if(K == 3){

				if(N == 2){
					System.out.println("1 2");
	                continue;
	            }else if(N % 2 == 0){
	                System.out.print("1 2 ");
	                N -= 2;
	            }else{
	                System.out.print("3 ");
	                N--;
	            }
	            
	            while(N-- > 0)
	                System.out.print("1 ");

	            System.out.println();

			} else {

				if(N%2 == 0){
					System.out.print("" + highest + " " + (highest - 1) + " ");
					N-=2;
				} else {
					System.out.print("" + highest + " " + (highest - 2) + " " + 1 + " ");
					N-=3;
				}

				while(N-- > 0)
		                System.out.print("1 ");
				
				System.out.println();
			}

		}	

	}
}