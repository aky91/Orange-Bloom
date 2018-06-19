// Akash Yadav
// @Hudson Lane, Delhi
// 19th June 18

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class TestClass{

	//https://www.hackerearth.com/practice/algorithms/searching/binary-search/practice-problems/algorithm/counting-triangles/

	public static Scanner scn = new Scanner(System.in);

	public static long prime = 10000000002065383L;

	public static void main (String[] args) throws java.lang.Exception{

		int N = scn.nextInt();

		long[][] points = new long[N][3];

		long[][] hash = new long[N][2];

		for(int i = 0; i < N; i++){

			long a = scn.nextLong();
			long b = scn.nextLong();
			long c = scn.nextLong();

			points[i][0] = a;
			points[i][1] = b;
			points[i][2] = c;

			long hashVal = getHash(a, b, c);

			hash[i][0] = hashVal;
			hash[i][1] = i;
		}

		Arrays.sort(hash, new Comparator<long[]>(){

			@Override
			public int compare(long[] a, long[] b){

				if(a[0] < b[0])	return -1;

				if(a[0] > b[0])	return 1;

				return 0;
			}
		});

		int count = 0;

		for(int i = 0; i < N;){

			int range = 0;

			while((i + range) < N && hash[i + range][0] == hash[i][0])
				range++;

			if(range == 1){
				count++;
				i++;
				continue;
			}

			i += range;
		}

		System.out.println(count);
		
	}

	public static long getHash(long a, long b, long c){

		long hash = (a%prime + b%prime + c%prime + (a*b)%prime + (b*c)%prime + (a*c)%prime + (a*b*c)%prime)%prime;

		return hash;
	}

	public static boolean areTheseTrianglesSame(int i, int j, long[][] arr){

		long[] arr1 = {arr[i][0], arr[i][1], arr[i][2]};
		Arrays.sort(arr1);

		long[] arr2 = {arr[j][0], arr[j][1], arr[j][2]};
		Arrays.sort(arr2);

		if(arr1[0] == arr2[0] && arr1[1] == arr2[1] && arr1[2] == arr2[2])
			return true;

		return false;
	}

}
