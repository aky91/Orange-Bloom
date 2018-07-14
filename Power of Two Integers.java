//https://www.interviewbit.com/problems/power-of-two-integers/

public class Solution {
    public int isPower(int A) {
        
        for(int x = 1; x <= (int)Math.sqrt(A); x++){
            
            int y = 2;
            
            boolean ans = false;
            
            int prev = -1;
            
            while(true){
                
                int pow = (int)Math.pow(x, y);
                
                if(pow == prev)
                    break;
                
                if(pow > A)
                    break;
                
                if(pow == A){
                    ans = true;
                    break;
                }
                
                prev = pow;
                
                y++;
            }
            
            if(ans)
                return 1;
        }
        
        return 0;
    }
}
