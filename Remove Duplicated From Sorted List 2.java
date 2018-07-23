//https://www.interviewbit.com/problems/remove-duplicates-from-sorted-list-ii/
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
        
        //remove from starting
        
        ListNode a = A;
        
        while(true){
            
            if(a.next != null && a.val == a.next.val){
                
                int q = a.val;
                
                ListNode p = a;
                
                while(p != null && p.val == q)
                    p = p.next;
                    
                if(p == null) return null;
                
                a = p;
            } else 
                break;
            
        }
        //do for middle
        
        A = a;
        
        if(a == null) return null;
        
        a = a.next;
        
        if(a == null) return A;
        
        
        ListNode prev = A;
        
        while(a!= null && prev != null){
        
            while(a != null && a.next != null && a.val == a.next.val){
                
                int data = a.val;
                ListNode link = a;
                
                while(link != null && link.val == data)
                    link = link.next;
                
                prev.next = link;
                a = link;
            }
            
            if(a == null) break;
            prev = prev.next;
            a = a.next;
        }
        
        return A;
    }
}
