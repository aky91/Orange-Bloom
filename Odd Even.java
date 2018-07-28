// Akash Yadav
// @PD Tandon, MNNIT, Allahabad
// 28th July 18

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Ideone{

	//https://practice.geeksforgeeks.org/problems/odd-to-even/0

	public static Scanner scn = new Scanner(System.in);

	public static void main (String[] args) throws java.lang.Exception{

		int T = Integer.parseInt(scn.nextLine());

		while(T-- > 0){

			String str = scn.nextLine();
	
			int N = str.length();
            
            int odd = str.charAt(N-1) - '0';
            int even = Integer.MAX_VALUE;
            int idx = -1;
            
            
            
            for(int i = 0; i < N; i++){
                
                int n = str.charAt(i) - '0';
                
                if(n%2 == 0){
                    even = n;
                    idx = i;
                }
                
                if(even <= odd)
                    break;
            }
            
            if(idx == -1){
                System.out.println(str);
                continue;
            }
            
            System.out.println(swap(str, idx, N-1));
		}	

	}
	
	public static char[] swap(String str, int i, int j){
        char ch[] = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return ch;
    }
}
