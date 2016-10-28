package strarr;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class IntersectionNode {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null) return null;
        ListNode a=headA;
        ListNode b=headB;
        while(a!=b){//set 2pointer start at the same time, when one reaches the end of Listnode,switch to 
        	      //the other listnode's head, so they will reach the intersection at the same time.
            a= a==null? headB:a.next;
            b= b==null? headA:b.next;
        }
        return a;
    }

}
