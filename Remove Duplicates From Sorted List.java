//https://www.interviewbit.com/problems/remove-duplicates-from-sorted-list/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode A) {
        
        ListNode a = A;
        
        while(a != null){
            
            int data = a.val;
            
            ListNode link = a;
            
            while(link != null && link.val == a.val)
                link = link.next;
                
            a.next = link;
            
            if(a != null)
                a = a.next;
        }
        
        return A;
    }
}
