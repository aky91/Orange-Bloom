//https://www.interviewbit.com/problems/max-sum-contiguous-subarray/


public class Solution {
    
    public int maxSubArray(final List<Integer> A) {
        
        int cmax = A.get(0);
        int max = A.get(0);
        
        for(int i = 1; i < A.size(); i++){
            
            int num = A.get(i);
            
            cmax = Math.max(cmax + num, num);
            
            max = Math.max(max, cmax);
        }
        
        return max;
    }
}
