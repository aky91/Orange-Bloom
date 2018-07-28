// Akash Yadav
// @PD Tandon, MNNIT, Allahabad
// 28th July 18

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Ideone{

	//https://practice.geeksforgeeks.org/problems/minimum-distinct-ids/0

	public static Scanner scn = new Scanner(System.in);

	public static void main (String[] args) throws java.lang.Exception{

		int T = scn.nextInt();

		while(T-- > 0){

			int N = scn.nextInt();

			int[] arr = new int[N];
			
			for(int i = 0; i < N ; i++)
			    arr[i] = scn.nextInt();
            
            int K = scn.nextInt();
            
            HashMap<Integer, Integer> map = new HashMap<>();
            
            for(int i = 0; i < N; i++){
                
                int data = arr[i];
                
                if(!map.containsKey(data)) map.put(data, 0);
                
                map.put(data, map.get(data) + 1);
            }
            
            ArrayList<Integer> list = new ArrayList<>(map.keySet());
            
            int[][] res = new int[list.size()][2];
            
            for(int i = 0; i < list.size(); i++){
                
                int data = list.get(i);
                int freq = map.get(data);
                
                res[i][0] = data;
                res[i][1] = freq;
            }
            
            Arrays.sort(res, new Comparator<int[]>(){
               
                public int compare(int[] A, int[] B){
                    
                    int a = A[1];
                    int b = B[1];
                    
                    return a-b;
                }
            });
            
            // for(int i = 0; i < list.size(); i++)
            //     System.out.println("" + res[i][0] + " " + res[i][1]);
            
            int m = list.size();
            
            for(int i = 0; i < m && K > 0;){
                
                if(res[i][1] <= 0){
                    i++;
                    continue;
                }
                
                res[i][1]--;
                K--;
            }
            
            int ans = 0;
            
            for(int i = 0; i < list.size(); i++)
                if(res[i][1] != 0) ans++;
            
            System.out.println(ans + "");
		}	

	}
}
