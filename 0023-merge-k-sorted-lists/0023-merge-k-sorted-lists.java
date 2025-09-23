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
    public ListNode mergeKLists(ListNode[] lists) {
        

    if(lists.length==0)
    {
        return null;
    }
     return  merge(lists,0,lists.length-1);




    }


ListNode merge(ListNode[] lists,int start,int end)
{
   
  if(start==end)
  {
    return lists[start];
  }

   int mid=(start+end)/2;


   ListNode head1=merge(lists,start,mid);

    ListNode head2=merge(lists,mid+1,end);

       return mergesort(head1,head2);


}

ListNode mergesort(ListNode head1,ListNode head2)
{
     if(head1==null)
     {
        return head2;
     }
     if(head2==null)
     {
        return head1;
     }




     
    ListNode temp=null;

    if(head1.val>head2.val)
    {
        temp=head2;
        head2=head2.next;
    }
    else{
        temp=head1;
        head1=head1.next;
    }
    ListNode tail=temp;
     while(head1!=null && head2!=null)
     {
          if(head1.val>head2.val)
          {
            tail.next=head2;
            tail=tail.next;
            head2=head2.next;
          }
          else{
               tail.next=head1;
            tail=tail.next;
            head1=head1.next;
          }
 



     }

       if(head1==null)
       {
        tail.next=head2;
       }
       else{
        tail.next=head1;
       }


    return temp;


}


}