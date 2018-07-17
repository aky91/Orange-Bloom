//https://www.interviewbit.com/problems/excel-column-number/

public class Solution {
    public int titleToNumber(String A) {
        
        int ans = 0;
        int mult = 1;
        
        for(int idx = A.length() - 1; idx >= 0; idx--){
            
            char ch = A.charAt(idx);
            
            int val = getVal(ch);
            
            ans += val * mult;
            
            mult *= 26;
        }
        
        return ans;
    }
    
    public int getVal(char ch){
        
        int val = ch - 'A' + 1;
        
        return val;
    }
}
