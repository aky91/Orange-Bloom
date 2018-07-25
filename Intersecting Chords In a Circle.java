//https://www.interviewbit.com/problems/intersecting-chords-in-a-circle/
public class Solution {
    
    public int mod = (int)Math.pow(10,9) + 7;
    
    public int chordCnt(int A) {
    
        long ans = solve((long)A, new HashMap<Long, Long>());
        
        return (int)ans;
    }
    
    public long solve(long A, HashMap<Long, Long> map){
        
        if(A == 0)
            return 1;
            
        if(A <= 2)
            return A;
            
        if(map.containsKey(A))
            return map.get(A);
            
        long ans = 0;
            
        for(int i = 0; i < 2*A; i+=2){
            
            long left = i/2;
            long right = A - 1 - i/2;
            
            long L = solve(left, map)%mod;
            long R = solve(right, map)%mod;
            
            ans = (ans + (L * R))%mod;
        }
        
        map.put(A, ans);
        
        return ans;
    }
    
}
