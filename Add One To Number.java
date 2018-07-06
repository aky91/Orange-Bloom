//https://www.interviewbit.com/problems/add-one-to-number/

public class Solution {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        
        ArrayList<Integer> ans = new ArrayList<>();
            
        boolean allZero = true;
        
        for(int i = 0; i < A.size(); i++){
            if(allZero && A.get(i) == 0)
                continue;
            
            allZero = false;
            
            ans.add(ans.size(), A.get(i));
        }
        
        //get to the last index
        int idx = ans.size() - 1;
        int carry = 1;
        
        while(idx >= 0){
            
            int sum = carry + ans.get(idx);
            carry = sum/10;
            int num = sum%10;
            
            ans.set(idx, num);
            
            idx--;
        }
        
        if(carry != 0)
            ans.add(0, carry);
        
        return ans;
    }
}
