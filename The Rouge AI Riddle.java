//https://www.youtube.com/watch?v=qMFpOcLroOg

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;

class GFG {
    
	public static void main(String args[]){
        
        Scanner scn = new Scanner(System.in);
        
        for(int i = 0; i <= 25; i++){
            justcause(i);
        }
    }
    
    public static void justcause(int num){
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int ans = solve(num, map);
        
        if(ans % 2 == 1)
            System.out.println(num + " : win");
        else    
            System.out.println(num + " : lose");
    }
    
    public static int solve(int num, HashMap<Integer, Integer> map){
        
        if(num <= 0) return 0;
        
        if(num == 1 || num == 3 || num == 4) return 1;
        if(num == 2) return 2;
        
        if(map.containsKey(num)) return map.get(num);
        
        int a1 = solve(num - 1, map);
        int a2 = solve(num - 3, map);
        int a3 = solve(num - 4, map);
        
        ArrayList<Integer> even = new ArrayList<>();
        
        if(a1%2 == 0) even.add(a1);
        if(a2%2 == 0) even.add(a2);
        if(a3%2 == 0) even.add(a3);
        
        int ans = 0;
        
        if(even.size() == 0)
            ans = 1 + Math.max(a1, Math.max(a2, a3));
        else 
            ans = 1 + Collections.max(even); 
            
        map.put(num, ans);
        
        return ans;
    }
}
