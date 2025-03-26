class Solution {
    public class ListNode {
            int val;
            ListNode next;
            ListNode head;
            ListNode tail;
            public ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }
            public void insertFirst(int val) {
                if (head == null ) {
                    ListNode node = new ListNode(val);
                    node.next=head;
                    head=node;
                    tail = head;
                }
                else{
                    ListNode node = new ListNode(val);
                    node.next = head;
                    head = node;
                }
            }
            public void display(ListNode temp){
                while (temp != null) {
                    System.out.print(temp.val + "->");
                    temp = temp.next;
                }
                System.out.print("END");
                System.out.println();
            }
        }
    public boolean isPalindrome(ListNode head) {

        ListNode t=new ListNode();
        t=head;
        ListNode rev=reverse(t);
        t.display(head.head);
        rev.display(rev);
        return match(rev,t);
    }
    public ListNode reverse(ListNode head) {
        ListNode t1=null;
        ListNode t2=head;
        ListNode next=t2.next;
        while(t2!=null){    
            t2.next=t1;
            t1=t2;
            t2=next;
            if(next!=null){
                next=next.next;
            }
        }
        head=t1;
        return head;

    }
    public boolean match(ListNode t1,ListNode t2){
        while(t1!=null && t2!=null){
            if(t1.val!=t2.val){
                return false;
            }
            t1=t1.next;
            t2=t2.next;
        }
        return true;
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        ListNode h=s.new ListNode();
        h.insertFirst(1);
        h.insertFirst(2);
        h.insertFirst(1);
        h.insertFirst(1);
        //h.display(h.head);
        System.out.println(s.isPalindrome(h.head));
    }
}