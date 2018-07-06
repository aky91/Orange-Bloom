// Akash Yadav
// @Hudson Lane, Delhi
// 21th June 18

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class TestClass{

	//https://www.hackerearth.com/challenge/competitive/june-circuits-18/algorithm/count-the-triangles-ada86ee8/

	public static Scanner scn = new Scanner(System.in);

	public static void main (String[] args) throws java.lang.Exception{

		int N = scn.nextInt();	

		int[] arr = new int[N];

		for(int i = 0; i < N; i++)
			arr[i] = scn.nextInt();

		long ans = N + N - 1;

		for(int i = 0; i < N; i++){
			
			if(i >= N-2)
				break;

			int a = arr[i];
			int b = arr[i+1];
			int c = arr[i+2];

			int[] sides = {a, b, c};
			Arrays.sort(sides);

			boolean check = isTrianglePossible(a, b, c);

			if(check == false)
				continue;

			ans++;
			System.out.println("" + (i+1) + "," + (i+2+1));

			//now keep increasing end point of this set(i, i+2) till condition is valid
			for(int range = 3; (i + range) < N; range++){

				int next = arr[i + range];

				//check triangle possibility with 2 smallest sides in current set
				boolean check2 = isTrianglePossible(sides[0], sides[1], next);

				if(check2 == false)
					break;

				ans++;
				System.out.println("" + (i+1) + "," + (i+range+1));

				sides = update(next, sides);
			}
		}

		System.out.println("ans = " + ans);
	}

	public static boolean isTrianglePossible(int a, int b, int c){

		int[] sides = {a, b, c};

		Arrays.sort(sides);

		if(sides[0] + sides[1] >= sides[2])
			return true;

		return false;
	}

	public static int smallest(int i, int j, int[] arr){

		int smallest = arr[i];

		for(int t = i + 1; t <= j; t++)
			if(arr[t] < smallest)
				smallest = arr[t];

		return smallest;
	}

	public static int[] update(int next, int[] sides){

		if(next >= sides[2])
			return sides;

		if(next >= sides[1]){

			sides[2] = next;
		
		} else if(next >= sides[0]){

			sides[2] = sides[1];
			sides[1] = next;
		
		} else if(next < sides[0]){

			sides[2] = sides[1];
			sides[1] = sides[0];
			sides[0] = next;
		}

		return sides;
	}
}
