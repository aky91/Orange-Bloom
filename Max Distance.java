public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    
    public class Type{
        int data;
        int prev;
        
        public Type(int data, int prev){
            this.data = data;
            this.prev = prev;
        }
    }
    public int maximumGap(final List<Integer> A) {
        
        int N = A.size();
        
        
        ArrayList<Type> B = new ArrayList<Type>();
        
        for(int i = 0; i < N; i++)
            B.add(new Type(A.get(i), i));
        
        Collections.sort(B, new Comparator<Type>(){
            
            public int compare(Type a, Type b){
                
                return a.data - b.data;
            }
        });
        
        int[] preFix = new int[N];
        
        int max = 0;
        
        for(int i = N - 2; i >= 0; i--){
            
            if(B.get(i+1).prev > max)
                max = B.get(i+1).prev;
                
            preFix[i] = max;
        }
        
        int ans = 0;
        
        for(int idx = 0; idx < N; idx++){
            
            int i = B.get(idx).prev;
            
            int j = preFix[idx];
            
            if(j < i)
                continue;
            
            if(j - i > ans)
                ans = j - i;
        }
        
        return ans;
    }
}
