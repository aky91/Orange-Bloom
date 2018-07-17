//https://www.interviewbit.com/problems/reverse-integer/

public class Solution {
    public int reverse(int A) {
        
        long ans = 0;
        
        boolean isNegative = false;
        
        //if a is negative make it positive ans make isNegative true
        if(A < 0){
            isNegative = true;
            A *= -1;
        }
        
        for(int num = A; num > 0; num /= 10){
            
            long digit = num % 10;
            
            ans = ans*10 + digit;
        }
        
        //if A was negative then make ans negative
        if(isNegative)
            ans *= -1;
            
        if(ans < Integer.MIN_VALUE || ans > Integer.MAX_VALUE)
            return 0;
        
        return (int)ans;
    }
}
