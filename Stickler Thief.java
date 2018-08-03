import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Ideone{

	//https://practice.geeksforgeeks.org/problems/stickler-theif/0

	public static Scanner scn = new Scanner(System.in);

	public static void main (String[] args) throws java.lang.Exception{

		int T = scn.nextInt();

		while(T-- > 0){

			int N = scn.nextInt();

			int[] arr = new int[N];
			
			for(int i = 0; i < N; i++)
			    arr[i] = scn.nextInt();
			    
			if(N == 1){
			    System.out.println(arr[0]);
			    continue;
			}
			    
			int[] dp = new int[N+1];
			dp[0] = arr[0];
			dp[1] = Math.max(arr[0], arr[1]);
			    
			solve(2,arr,dp);
			    
            System.out.println(dp[N-1]);
		}	
	}
	
	public static void solve(int idx, int[] arr, int[] dp){
	    
	    if(idx == arr.length) return;
	    
	    int ans1 = dp[idx-1];
	        
	    int ans2 = dp[idx - 2] + arr[idx];
	    
	    dp[idx] = Math.max(ans1, ans2);
	    
	    solve(idx +1 , arr, dp);
	}
}











