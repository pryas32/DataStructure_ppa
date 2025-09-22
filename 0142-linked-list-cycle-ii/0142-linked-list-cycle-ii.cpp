/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode *detectCycle(ListNode *head) {

 map<ListNode*,int>loop;

  ListNode *head1=head;
  int count=0;
   while(head1!=NULL)
   {
    if(loop.find(head1)!=loop.end())
    {
       // int x=loop[head1];
        return head1;
    }
       loop[head1]=count;

             count++;
       head1=head1->next;
   }



  return NULL;









    }
};