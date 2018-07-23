//https://www.interviewbit.com/problems/merge-two-sorted-lists/
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        
        if(A.val > B.val)
            return mergeTwoLists(B, A);
            
        ListNode head = A, p = A;
        
        A = A.next;
        
        while(A!=null && B!=null){
            
            if(A.val < B.val){
                
                p.next = A;
                A = A.next;
                
            } else {
                
                p.next = B;
                B = B.next;
            }
            
            p = p.next;
        }
        
        if(B == null && A != null)
            p.next = A;
        
        if(A == null && B != null)
            p.next = B;
            
        return head;
    }
}
