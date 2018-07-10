//https://www.interviewbit.com/problems/set-matrix-zeros/

public class Solution {    
    public void setZeroes(ArrayList<ArrayList<Integer>> a) {
        
        HashSet<Integer> rows = new HashSet<>();
        HashSet<Integer> cols = new HashSet<>();
        
        for(int r = 0; r < a.size(); r++){
            for(int c = 0; c < a.get(0).size(); c++){
                
                int num = a.get(r).get(c);
                
                if(num == 0){
                    if(!rows.contains(r))
                        rows.add(r);
                    
                    if(!cols.contains(c))
                        cols.add(c);
                }
            }
        }
        
        for(int r = 0; r < a.size(); r++){
            for(int c = 0; c < a.get(0).size(); c++){
                if(rows.contains(r) || cols.contains(c))
                    a.get(r).set(c, 0);
            }
        }
    }
}
