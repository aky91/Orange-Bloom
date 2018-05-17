import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Ideone{

	//Minimum number of platforms required on a railway station

	//program incharge
	public static void main ([] args) throws java.lang.Exception{

		int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
		int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };	

		System.out.println( findMinPlatform(arr, dep));
	}

	//function to find minimum number of platforms required
	public static int findMinPlatform(int[] arr, int[] dep){

		//maximum possible time is 23:59 which is 1439 minutes
		int[] time = new int[1440];

		//increment all arrival times in time array by 1
		for(int ta : arr)
			time[getMinutes(ta)]++;

		//decrement all departure times in time array by 1
		for(int td : dep)
			time[getMinutes(td)]--;

		//traverse through time array to get max platform
		int p = 0;
		int ans = 0;

		for(int t : time){

			p += t;

			if(p > ans)
				ans = p;
		}

		return ans;
	}

	//function to find time in minutes from 00:00
	public static int getMinutes(int time){

		int min = time%100;

		int hrs = time/100;

		int minutes = hrs*60 + min;

		return minutes;
	}

}