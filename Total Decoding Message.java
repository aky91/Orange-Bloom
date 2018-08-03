import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Ideone{

	//https://practice.geeksforgeeks.org/problems/total-decoding-messages/0

	public static Scanner scn = new Scanner(System.in);

	public static void main (String[] args) throws java.lang.Exception{

		int T = scn.nextInt();

		while(T-- > 0){

			int N = scn.nextInt();

		    String str = scn.next();
		    
		    int res = solve(str);
		    
		    System.out.println(res);
		}	
	}
	
	public static int solve(String str){
        
        if(str.length() == 0)
            return 1;
            
        //one char
        int one = 0, ans1 = 0;
        
        one = Integer.parseInt(str.substring(0,1));
        
        if(one >= 1 && one <= 9)
            ans1 = solve(str.substring(1));
        
        //two chars
        int two = 0, ans2 = 0;
        
        if(str.length() >= 2){
            two = Integer.parseInt(str.substring(0, 2));
            
            if(two >= 10 && two <= 26)
                ans2 = solve(str.substring(2));
        }
        
        int ans = ans1 + ans2;
        
        return ans;
	}
}

