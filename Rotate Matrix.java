//https://www.interviewbit.com/problems/rotate-matrix/

public class Solution {
    public void rotate(ArrayList<ArrayList<Integer>> a) {
        
        int N = a.size();
        int S = N-1;
        
        for(int ring = 0; ring < (int)Math.ceil(N/2.0); ring++){
            
            for(int i = 0; i < N - 2*ring - 1; i++){
                
                //p1
                int p1 = a.get(ring).get(ring + i);
                
                //p2
                int p2 = a.get(ring + i).get(S - ring);
                
                //p3
                int p3 = a.get(S - ring).get(S - ring - i);
                
                //p4
                int p4 = a.get(S - ring - i).get(ring);
                
                //p1 = p4
                a.get(ring).set(ring + i, p4);
                
                // p2 = p1
                a.get(ring + i).set(S - ring, p1);
                
                //p3 = p2
                a.get(S - ring).set(S - ring - i, p2);
                
                //p4 = p3
                a.get(S - ring - i).set(ring, p3);
            }
        }
        
    }
}
