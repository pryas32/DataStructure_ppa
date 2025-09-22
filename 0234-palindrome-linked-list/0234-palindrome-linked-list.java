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
    public boolean isPalindrome(ListNode head) {
        
ListNode slow=head;
ListNode fast=head.next;

  while(fast!=null && fast.next!=null)
  {
    slow=slow.next;
    fast=fast.next.next;
  }

ListNode head1=slow.next;
slow.next=null;

   ListNode head2=reverseList(head1);

  while(head!=null && head2!=null)
  {
    if(head.val!=head2.val)
    {
        return false;
    }
    head=head.next;
    head2=head2.next;
  }

return true;




    }
 public ListNode reverseList(ListNode head) {
        
ListNode prev=null;
ListNode current=head;

while(current!=null)
{
    ListNode head2=current.next;
    current.next=prev;
    prev=current;
    current=head2;
}

return prev;       
    }
}