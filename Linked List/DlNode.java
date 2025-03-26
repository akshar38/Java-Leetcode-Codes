public class DlNode {
    DlNode next;
    DlNode prev;
    DlNode head;
    DlNode tail;
    int val;
    public DlNode(){
        
    }
    public DlNode(int val){
        this.val=val;
    }
    public void insert(int val){
        DlNode n=new DlNode(val);
        if(head==null || tail==null){
            head=n;
            tail=head;
        }
        else{
            DlNode temp=head;
            while (temp.next!=null) {
                temp=temp.next;
            }
            temp.next=n;
            n.prev=temp;
            tail=n;
        }
    }
    public void display() {
        DlNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.print("END");
        System.out.println();
    }
    public void displayRev(){
        DlNode temp=tail;
        while (temp!=null) {
            System.out.print(temp.val+"->");
            temp=temp.prev;
        }
        System.out.print("END");
        System.out.println();
    }
}
