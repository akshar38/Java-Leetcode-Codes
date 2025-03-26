
public class Node {
    Node next;
    int val;
    Node head;
    Node tail;
    public Node(){

    }
    public void delete(int value){
        Node temp=head;
        Node temp1=head;
        while(temp.val!=value){
            temp1=temp;
            temp=temp.next;
        }
        temp1.next=temp.next;
    }
    public void insertAfter(int value,int val){
        Node temp=head;
        while(temp.val!=value){
            temp=temp.next;
        }
        Node n=new Node();
        n.addNext(val, temp.next);
        temp.next=n;
    }
    public Node(int val) {
        this.val = val;
    }

    public void addNext(int val, Node next) {
        this.val = val;
        this.next = next;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }

    }
    public void insertRec(int val,int index,Node head){
        Node temp=head;
        if(index==1){
            Node n=new Node(val);
            n=temp.next;
            n.next=temp.next.next;   
            return;
        }
        if(temp.next==null){
            Node n=new Node(val);
            temp.next=n;
        }
        insertRec(val, index-1, temp.next);
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.print("END");
        System.out.println();
    }
    public Node reverseBetween(Node head, int left, int right) {
        if(left==right){
            return head;
        }
        int i=1;
        Node t1=null;
        Node t2=head;
        while(i<left){
            t1=t2;
            t2=t2.next;
            ++i;
        }
        Node head1=t1;
        Node tailnew=t2;
        Node next=t2.next;
        //t2=t2.next;
        while(i<=right){
            
            t2.next=t1;
            t1=t2;
            t2=next;
            next=next.next;
            ++i;
        }
        head1.next=t1;
        tailnew.next=t2;
        return head;
    }
    public Node reverse(Node head) {
        Node t1=null;
        Node t2=head;
        tail=t2;
        Node next=t2.next;
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
    public boolean match(Node t1,Node t2){
        while(t1!=null && t2!=null){
            if(t1.val!=t2.val){
                return false;
            }
            t1=t1.next;
            t2=t2.next;
        }
        return true;
    }
    public void display(Node temp){
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.print("END");
        System.out.println();
    }
    public Node deletenode(Node h,int n){
        Node fast=h;
        Node slow=h;
        int length=1;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            length+=2;
            slow=slow.next;
        }
        
        if(fast==null){
            length-=1;
            System.out.println("length="+length);
        }
        //int diff=length-n;
        if(n<(length/2)-2 && length>=6){
            int diff=(length/2)-n;
            while(diff>0){
                slow=slow.next;
                diff--;
            }
            slow.next=slow.next.next;
        }
        else{
            Node temp=h;
            Node temp1=null;
            int diff=length-n;
            while(diff>0 && temp!=null){
                temp1=temp;
                temp=temp.next;
                diff--;
            }
            if(temp1!=null){
                temp1.next=temp.next;
            }
            else{
                h=temp.next;
                temp.next=null;
            }
        }
        return h;
    }
}
