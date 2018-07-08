//https://www.interviewbit.com/problems/wave-array/

public class Solution {
    public ArrayList<Integer> wave(ArrayList<Integer> A) {
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int data : A)
            arr.add(data);
            
        Collections.sort(arr);
        
        for(int i = 0; i < arr.size()-1; i += 2){
            
            //swap i and i+1
            if(i >= 0 && i < arr.size() && i+1 >= 0 && i+1 < arr.size())
                Collections.swap(arr, i, i+1);
        }
        
        return arr;
    }
}
