import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Ideone{

	//https://practice.geeksforgeeks.org/problems/egg-dropping-puzzle/0

	public static Scanner scn = new Scanner(System.in);

	public static void main (String[] args) throws java.lang.Exception{

		int T = scn.nextInt();

		while(T-- > 0){

			int N = scn.nextInt();
            int K = scn.nextInt();
            
            int ans = getAns(N, K);
    
            System.out.println(ans);
			

	}
	
	public static int getAns(int N, int K){
	    
	    if(N == 0 || K == 0 || K == 1)
	        return K;
	        
	    int min = Integer.MAX_VALUE;
	    
	    for(int i = 1; i <= K; i++)
	        min = Math.min(min, (1 + Math.max(getAns(N, K-i), getAns(N-1,K-1))));
	
	    return min;
	}
}
