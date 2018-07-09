//https://www.interviewbit.com/problems/find-duplicate-in-array/

public class Solution {
    public int repeatedNumber(final List<Integer> a) {
        
        HashSet<Integer> map = new HashSet<>();
        
        int ans = -1;
        
        for(int i = 0; i < a.size(); i++){
            
            int num = a.get(i);
            
            if(map.contains(num)){
                ans = num;
                break;
            } else
                map.add(num);
        }
        
        return ans;
    }
}
