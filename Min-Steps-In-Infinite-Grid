//https://www.interviewbit.com/problems/min-steps-in-infinite-grid/

public class Solution {
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        
        int steps = 0;
        int x = A.get(0);
        int y = B.get(0);
        
        for(int p = 1; p < A.size(); p++){
            
            int x2 = A.get(p);
            int y2 = B.get(p);
            
            //reach form x,y to x2, y2
            
            int dx = Math.abs(x2 - x);
            int dy = Math.abs(y2 - y);
            
            steps += Math.max(dx, dy);
            
            x = x2;
            y = y2;
        }
        
        return steps;
    }
}
