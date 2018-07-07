//https://www.interviewbit.com/problems/max-non-negative-subarray/

public class Solution {

    public ArrayList<Integer> maxset(ArrayList<Integer> A) {
        
        int N = A.size();
        
        int max = 0;
        int start = -1;
        int end = -1;
        
        int sum = 0;
        int s = -1;
        
        boolean flow = false;
        
        for(int i = 0; i <= N; i++){
            
            int num;
            
            if(i == N)
                num = -1;
            else
                num = A.get(i);
            
            if(num >= 0){
                
                if(flow == false){
                    flow = true;
                    s = i;
                }
                
                sum += num;
                
            } else {
                
                flow = false;
                
                if(sum > max && (i-1-s) > (end - start)){
                    start = s;
                    end = i - 1;
                    max = sum;
                }
                
                sum = 0;
            }
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        if(max == -1)
            return ans;
            
        for(int i = start; i <= end; i++)
            ans.add(A.get(i));
            
        return ans;
    }
}
