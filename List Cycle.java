//https://www.interviewbit.com/problems/list-cycle/
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode a) {
        
        HashSet<ListNode> set = new HashSet<>();
        
        ListNode p = a;
        
        while(p != null){
            
            if(set.contains(p))
                return p;
            
            set.add(p);
            
            p = p.next;
        }
        
        return null;
    }
}
