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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        
       ListNode head=list1;
       ListNode top=list1;
     int count=0;

        while(count<a-1)
        {
            count++;
            head=head.next;
        }

            

         ListNode head2=head;
          
         int counting=a;


         while(counting<=b)
         {
            head2=head2.next;
            counting++;
         } 

        head.next=list2;
          head=head.next;
         while(head.next!=null)
         {
                head=head.next;
         }

          head.next=head2.next;
         return top;

    }
}