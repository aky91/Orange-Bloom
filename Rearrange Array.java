//https://www.interviewbit.com/problems/rearrange-array/

public class Solution {
    public void arrange(ArrayList<Integer> A) {
        
        int n = A.size();
        int i = 0;
        for (i = 0; i < n; i++) A.set(i, A.get(i) + (A.get(A.get(i)) % n) * n );
        for (i = 0; i < n; i++) A.set(i, A.get(i) / n);
        
        /* //prev approach
        int N = a.size();
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < N; i++){
            
            int val = a.get(i);
            
            map.put(i, val);
            
            if(val == i || val >= N)
                continue;
            
            if(map.containsKey(val))
                a.set(i, map.get(val));
            else
                a.set(i, a.get(val));
        }
        */
    }    
}
