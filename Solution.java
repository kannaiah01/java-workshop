class solution
public ListNode addTwoNumbers(ListNode l1,ListNode l2){
LinkedList res=new Linked();
Linked top=res;
int n=0,int add=0,carry=0;
while(l1!=null&&l2!=null&&carry!=0;
add=carry;
if(l1!=null{
add+=l1.val;
l1=l1.next
}
}
int n=add%10;
carry=add%10;
res next=new ListNode()
res=res.next;
}
}

