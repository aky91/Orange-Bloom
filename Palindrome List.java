//https://www.interviewbit.com/problems/palindrome-list/#

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    
    public int lPalin(ListNode A) {
        
        ListNode p1 = A, p2 = A;
        
        int N = 0;
        
        while(p1 != null){
            p1 = p1.next;
            N++;
        }
        
        p1 = A;
        
        if(N == 1) return 1;
        
        if(N == 2){
            p2 = p2.next;
            
            if(p1.val == p2.val) return 1;
            
            return 0;
        }
        
        p1 = A;
        
        // N/2 is half
        
        int mid = N/2 - 1;
        
        for(int i = 1; i <= mid; i++)
            p2 = p2.next;
            
        if(N%2 == 0){
            if(p2.val != p2.next.val) return 0;
        }
        
        p2 = p2.next;
            
        ListNode saved = p2;
        
        ListNode prev = p2;
        ListNode head = p2.next;
        
        //reverse from p2 onwards
        
        while(head != null){
            
            ListNode temp = head.next;
            head.next = prev;
            
            prev = head;
            head = temp;
        }
        
        
        p2 = prev;
        
        //check
        
        int ans = 1;
        
        while(true){
            
            if(p1 == saved || p2 == saved || p1 == p2)
                break;
                
            if(p1.val != p2.val){
                ans = 0;
                break;
            }
            
            p1 = p1.next;
            p2 = p2.next;
        }
        
        return ans;

    }
    
}
