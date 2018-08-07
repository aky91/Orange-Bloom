//https://www.interviewbit.com/problems/allocate-books/
public class Solution {
    public int books(ArrayList<Integer> arr, int M) {
        
        int N = arr.size();
        
        if(N < M)
            return -1;
        
        int low = Collections.max(arr);
        int high = arr.stream().mapToInt(f -> f.intValue()).sum();
        
        
        while(low < high){
            
            
            
            int mid = low + (high - low)/2;
            
            int students = getCount(arr, mid);
            
            //System.out.println(low + " " + high + " " + students);
            
            if(students <= M)
                high = mid;
            else 
                low = mid+1;
        }
        
        //low is the answer
        return high;
    }
    
    public int getCount(ArrayList<Integer> arr, int limit){
        
        int students = 1;
        
        int sum = 0;
        
        for(int val : arr){
            
            if(sum + val > limit){
                sum = 0;
                students++;
            }
            
            sum += val;
        }
        
        return students;
    }
}
