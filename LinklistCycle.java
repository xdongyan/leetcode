package strarr;

public class LinklistCycle {public boolean hasCycle(ListNode head) {
    ListNode fast= head;
    ListNode slow= head;
    if(head==null) return false;
    while(fast!=null){
        if(fast.next!=null)
        {
         fast=fast.next.next;
         slow=slow.next;
         if (fast==slow) return true;
            }
        else return false;
        
        }
    return false;
    
}

}
