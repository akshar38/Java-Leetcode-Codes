public class CLNode {
    CLNode next;
    int val;
    CLNode head;
    CLNode tail;
    public CLNode(){
        
    }
    public CLNode(int val){
        this.val=val;
    }
    public void insert(int val){
        CLNode n=new CLNode(val);
        if(head==null){
            head=n;
            tail=head;
            n.next=head;
        }
        else{
            CLNode temp=head;
            while (temp.next!=head) {
                temp=temp.next;
            }
            temp.next=n;
            tail=n;
            n.next=head;
        }
    }
    public void display() {
        CLNode temp = head;
        System.out.print(temp.val + "->");
        temp=temp.next;
        while (temp != head) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.print("END");
        System.out.println();
    }
    public void delete(int value){
        CLNode temp=head;
        while(temp.next.val!=value){
            temp=temp.next;
        }
        if(temp.next==tail){
            tail=temp;
        }
        temp.next=temp.next.next;
        
    }
}
