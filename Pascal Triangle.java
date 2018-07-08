//https://www.interviewbit.com/problems/pascal-triangle/

public class Solution {
    
    public ArrayList<ArrayList<Integer>> generate(int A) {
        
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        
        if(A == 0)
            return arr;
        
        //insert 1st row
        arr.add(new ArrayList<>());
        arr.get(0).add(1);
        
        for(int i = 1; i < A; i++){
            
            arr.add(new ArrayList<>());
            int size = arr.get(i - 1).size();
            
            for(int j = 0; j < size + 1; j++){
                
                int a = 0;
                
                if(j - 1 >= 0 && j - 1 < size)
                    a = arr.get(i - 1).get(j - 1);
                    
                int b = 0;
                
                if(j >= 0 && j < size)
                    b = arr.get(i - 1).get(j);
                
                int ans = a + b;
                
                arr.get(i).add(ans);
            }
        }
        
        return arr;
    }
}
