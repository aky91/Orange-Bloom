//https://www.interviewbit.com/problems/ways-to-decode/

public class Solution {
    public int numDecodings(String A) {
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int ans = solve(0, A, map);
        
        return ans;
    }
    
    public int solve(int buff, String A, HashMap<Integer, Integer> map){
        
        int N = A.length();
        
        int size = N - buff;
        
        if(size == 0 || buff == N)
            return 1;
            
        if(buff > N)
            return 0;
         
        int ans = 0;
        
        //1 no.
        if(buff+0 < N){
            
            int num = A.charAt(buff + 0) - '0';
            
            if(num >= 1 && num <= 9){
                
                if(map.containsKey(buff+1))
                    ans += map.get(buff+1);
                else{
                    int temp = solve(buff+1, A, map);
                    
                    if(temp != -1)
                        ans +=  temp;
                }
            }
        }
        
        //2 no.
        if(buff+0 < N && buff+1 < N){
            
            int num = (A.charAt(0 + buff) - '0')*10 + (A.charAt(1 + buff) - '0');
            
            if(num >= 10 && num <= 26){
                
                if(map.containsKey(buff+2))
                    ans += map.get(buff+2);
                else
                    ans += solve(buff+2, A, map);
            }
        }
        
        map.put(buff, ans);
        return ans; 
    }
}
