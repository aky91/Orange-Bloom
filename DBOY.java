import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Ideone{

	//https://www.codechef.com/problems/DBOY

	public static Scanner scn = new Scanner(System.in);

	public static void main (String[] args) throws java.lang.Exception{

		int T = scn.nextInt();

		while(T-- > 0){

			int N = scn.nextInt();

			int[] H = new int[N];//house array
			int[] K = new int[N];//refuel quantity

			for(int i = 0; i < N; i++)
				H[i] = scn.nextInt();

			for(int i = 0; i < N; i++)
				K[i] = scn.nextInt();

			HashMap<Integer, Long> dp = new HashMap<>();

			long ans = 0;

			for(int distance : H){

				int fuelNeeded = distance << 1;//fuel needed is double the distance

				ans += getRefuelCount(fuelNeeded, K, dp);
			}

			System.out.println("" + ans);
		}	
	}

	public static long getRefuelCount(int fuelNeeded, int[] K, HashMap<Integer, Long> dp){

		if(fuelNeeded < 0)
			return Integer.MAX_VALUE;

		if(fuelNeeded == 0)
			return 0;

		//if already computed return that answer
		if(dp.containsKey(fuelNeeded))
			return dp.get(fuelNeeded);

		long ans = Integer.MAX_VALUE;

		for(int refuelAmt : K)
			ans = Math.min(ans , getRefuelCount(fuelNeeded - refuelAmt, K, dp));
		
		//saving answer in dp
		dp.put(fuelNeeded, 1 + ans);

		return dp.get(fuelNeeded);
	}
}