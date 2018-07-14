//https://www.interviewbit.com/problems/sum-of-pairwise-hamming-distance/

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int hammingDistance(final List<Integer> A) {
        
        int ans = 0;
        
        //read all no. at that bit
        for(int bit = 0; bit < 32; bit++){
            
            long zero = 0;
            long ones = 0;
            
            for(int num : A){
                
                int b = num & (1<<bit);
                
                if(b == 0)
                    zero++;
                else
                    ones++;
            }
            
            ans += (int)2 * ones * zero;
        }
        
        return ans;
    }
}
