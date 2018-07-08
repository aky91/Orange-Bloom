//https://www.interviewbit.com/problems/spiral-order-matrix-ii/

public class Solution {
    
    public ArrayList<ArrayList<Integer>> generateMatrix(int A) {
        
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        
        for(int i = 1; i <= A; i++){
            arr.add(new ArrayList<>());
            for(int j = 1; j <= A; j++)
                arr.get(i-1).add(0);
        }
        
        int start = 0;
        
        int num = 1;
        
        while(start < (int)Math.ceil(A/2.0)){
            
            //start pos : start, start
            
            //System.out.println("hello little world");
            
            //top
            for(int i = 0 + start; i < A - 1 - start; i++){
                arr.get(0 + start).set(i, num);
                num++;
            }
            
            //right
            for(int i = 0 + start; i < A - 1 - start; i++){
                arr.get(i).set(A - 1 - start, num);
                num++;
            }
            
            //bottom
            for(int i = A - 1 - start; i > 0 + start; i--){
                arr.get(A - 1 - start).set(i, num);
                num++;
            }
            
            //left
            for(int i = A - 1 - start; i > 0 + start; i--){
                arr.get(i).set(0 + start, num);
                num++;
            }
            
            start++;
        }
        
        if(A%2 == 1){
            start--;
            arr.get(start).set(start, num);
        }
        
        return arr;
    }
}
