//https://www.interviewbit.com/problems/remove-nth-node-from-list-end/
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode A, int B) {
        
        if(A == null) return null;
        
        int N = 0;
        ListNode p = A;
        
        while(p!=null){p = p.next; N++;}
        
        if(B >= N){
            return A.next;
        }
        
        B = N - B;
        
        //remove Bth node from first
        
        ListNode head = A;
        
        for(int i = 1; i < B; i++)
            A = A.next;
        
        A.next = A.next.next;
        
        return head;
    }
}
