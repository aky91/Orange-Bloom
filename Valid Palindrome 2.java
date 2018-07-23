//https://leetcode.com/problems/valid-palindrome-ii/description/

class Solution {
    
    public boolean done = false;
    
    public boolean validPalindrome(String s) {
        
        return solve(0, s.length()-1, s);
    }
    
    public boolean solve(int first, int last, String str){
        
        int N = last - first + 1;
        
        if( first >= last || N == 0 || N == 1)
            return true;
        
        if(str.charAt(first) == str.charAt(last))
            return solve(first + 1, last-1, str);
        
        if(done == true) return false;
        
        done = true;
        
        boolean ans1 = solve(first, last - 1, str);
        boolean ans2 = solve(first + 1, last, str);
        
        return ans1 || ans2;
    }
}
