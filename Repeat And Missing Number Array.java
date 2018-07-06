//https://www.interviewbit.com/problems/repeat-and-missing-number-array/#

public class Solution {
    
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        
        long N = A.size();
        
        long sum = 0;
        long sq = 0;
        
        long sumE = (long)(N * (N + 1) / 2);
        long sqE = (long)(N * (N + 1) * (2*N + 1) / 6);
        
        for(int i = 0; i < N; i++){
            int n = A.get(i);
            
            sum += n;
            sq += n * n;
        }
        
        long x = sumE - sum;
        long y = (sqE - sq)/x;
        
        int a = (int)((x + y)>>1);
        int b = (int)(a - x);
        
        ArrayList<Integer> ans = new ArrayList<Integer>();
        ans.add(b);
        ans.add(a);
        
        return ans;
    }
}
