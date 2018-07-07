//https://www.interviewbit.com/problems/max-non-negative-subarray/

public class Solution {
    
    public ArrayList<Integer> maxset(ArrayList<Integer> A) {
        
        int N = A.size();
        
        long max = -1;
        int start = -1;
        int end = -1;
        
        long sum = 0;
        int s = -1;
        
        boolean flow = false;
        boolean allNeg = true;
        
        for(int i = 0; i <= N; i++){
            
            int num;
            
            if(i == N)
                num = -1;
            else
                num = A.get(i);
            
            if(num >= 0){
                
                allNeg = false;
                
                if(flow == false){
                    flow = true;
                    s = i;
                }
                
                sum += num;
                
            } else {
                
                flow = false;
                
                if(sum > max ){
                    start = s;
                    end = i - 1;
                    max = sum;
                }
                
                sum = 0;
            }
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        if(allNeg)
            return ans;
            
        for(int i = start; i <= end; i++)
            ans.add(A.get(i));
            
        return ans;
    }
}
