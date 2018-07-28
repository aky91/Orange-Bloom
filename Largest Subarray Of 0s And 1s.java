//https://practice.geeksforgeeks.org/problems/largest-subarray-of-0s-and-1s/1
class GfG
{
    /*You are required to complete this method*/ 
    int maxLen(int[] arr) {
         
        int N = arr.length;
        
        int[] sub = new int[N];
        
        int sum = 0;
            
        for(int i = 0; i < arr.length; i++){
            
            int num = arr[i];
            
            if(num == 0) num = -1;
            
            sum += num;
            
            sub[i] = sum;
        }
        
        int maxSize = -1;
        
        int start = 0, end = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < N; i++){
            
            if(sub[i] == 0){
                if(i+1 > maxSize){
                    maxSize = i+1;
                    start = 0;
                    end = i;
                    continue;
                }
            } 
            
            if(map.containsKey(sub[i])){
                
                //find difference
                
                int size = i - map.get(sub[i]);
                
                if(size > maxSize){
                    maxSize = size;
                    start = map.get(sub[i]);
                    end = i;
                }
                
            } else 
                map.put(sub[i], i);
            
        }
        
        if(maxSize == -1) return 0;
        
        return maxSize;
    }
}
