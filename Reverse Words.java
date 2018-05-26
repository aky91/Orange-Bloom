import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Ideone{

	//https://practice.geeksforgeeks.org/problems/reverse-words-in-a-given-string/0

	public static Scanner scn = new Scanner(System.in);

	public static void main (String[] args) throws java.lang.Exception{

		int T = scn.nextInt();
		scn.nextLine();

		while(T-- > 0){

			String str = scn.nextLine();

			String[] arr = str.split("//.");

			for(int i = arr.length; i >= 0; i--){
				System.out.print(elem);

				if(i != 0)
					System.out.print(".");
			}
		}	

	}
}