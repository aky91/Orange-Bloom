import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Ideone{

	//https://www.codechef.com/COOK94B/problems/CHEFRUN

	public static Scanner scn = new Scanner(System.in);

	public static void main (String[] args) throws java.lang.Exception{

		int T = scn.nextInt();

		while(T-- > 0){

			int X1 = scn.nextInt();
			int X2 = scn.nextInt();
			int X3 = scn.nextInt();

			int V1 = scn.nextInt();
			int V2 = scn.nextInt();

			int d1 = X3 - X1;
			double t1 = 1.0*d1 / V1;

			int d2 = X2 - X3;
			double t2 = 1.0*d2 / V2;

			if(t1 < t2)
				System.out.println("Chef");
			else if(t2 < t1)
				System.out.println("Kefa");
			else
				System.out.println("Draw");
		}	

	}
}