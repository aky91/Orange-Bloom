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
        
        int max = 0;
        
        int[] index = new int[N];
        ArrayList<Type> B = new ArrayList<Type>();
        
        for(int i = 0; i < N; i++)
            B.add(new Type(A.get(i), i));
        
        Collections.sort(B, new Comparator<Type>);
        
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(A.get(i) <= A.get(j) && (j - i) > max)
                    max = j - i;
            }
        }
        
        return max;
    }
}
