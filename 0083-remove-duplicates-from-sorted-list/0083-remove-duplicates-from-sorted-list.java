/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null|| head.next==null)
        {
            return head;
        }
        
        
        ListNode temp=head;
         ListNode head1=head.next;
     while(head1!=null)
     {
        if(temp.val!=head1.val)
        {
           temp.next=head1;
           temp=temp.next;
        }
        else{
            head1=head1.next;
        }

     }
   temp.next=null;

   return head;


    }
}