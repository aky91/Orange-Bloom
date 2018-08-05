import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Ideone{

	//https://practice.geeksforgeeks.org/problems/the-painters-partition-problem/0

	public static Scanner scn = new Scanner(System.in);

	public static void main (String[] args) throws java.lang.Exception{

		int T = scn.nextInt();

		while(T-- > 0){

			int k = scn.nextInt();
			int n = scn.nextInt();
			
			int[] arr = new int[n];
			
			for(int i = 0; i < n; i++)  arr[i] = scn.nextInt();
			    
			int[] sigsum = new int[n];
			int[] max = new int[n];
			
			int sum = 0;
			int mx = arr[0];
			
			for(int i = 0; i < n; i++){
			    sum += arr[i];
			    sigsum[i] = sum;
			    
			    mx = Math.max(mx, arr[i]);
			    max[i] = mx;
			}

			int[][] mat = new int[k+1][n+1];
			
			for(int p = 0; p < k; p++){
			    for(int b = 0; b < n; b++){
			        
			        if(p == 0){
			            mat[p][b] = rangeSum(0, b, sigsum);
			            continue;
			        }
			        
			        if(p >= b){
			            mat[p][b] = max[b];
			            continue;
			        }
			        
			        mx = Integer.MAX_VALUE;
			        
			        for(int i = 0; i <= b; i++){
			            
			            int br = b;
			            int bl = b - i;
			            
			            if(p-1 < 0 || b-1-i < 0)
			                break;
			                
			            int sm = rangeSum(bl, br, sigsum);
			            sm = Math.max(sm, mat[p-1][b-1-i]);
			            
			            mx = Math.min(mx, sm);
			        }
			        
			        mat[p][b] = mx;
			    }
			}
			
// 			for(int p = 0; p < k; p++){
// 			    for(int b = 0; b < n; b++)
// 			        System.out.print(mat[p][b] + " ");
// 			    System.out.println();
// 			}
			
			System.out.println(mat[k-1][n-1]);
		}	
	}
	
	public static int rangeSum(int l, int r, int[] sum){
	    
	    if(l < 0 || l >= sum.length || r < 0 || r >= sum.length) return -1;
	    
	    if(l == 0)  return sum[r];
	        
	    return sum[r] - sum[l-1];
	}
}
