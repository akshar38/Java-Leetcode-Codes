public class CycleLink {
    CycleLink next;
    int val;
    CycleLink head;
    CycleLink tail;
    public CycleLink(){
        
    }
    public CycleLink(int val){
        this.val=val;
    }
    public void cycle(int index){
        CycleLink temp=head;
        while(index-1!=0){
            temp=temp.next;
            index--;
        }
        tail.next=temp;
        tail=temp;
    }
    public CycleLink lenghtOfCycle(){
        CycleLink temp=head;
        int length=0;
        CycleLink fast=head;
        CycleLink slow=head;
        //boolean ans=false;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                CycleLink l=slow;
                do{
                    length++;
                    l=l.next;
                }while(l!=slow);      
                break;  
            }

        }
        int l2=length;
        CycleLink temp2=temp;
        CycleLink temp1=temp;
        while(l2>0){
            temp2=temp2.next;
            --l2;
        }
        //CycleLink res=new CycleLink();
        while(temp1!=temp2){
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return temp1;

    }
    public void insert(int val){
        CycleLink n=new CycleLink(val);
        if(head==null){
            head=n;
            tail=head;
            n.next=head;
        }
        else{
            CycleLink temp=head;
            while (temp.next!=head) {
                temp=temp.next;
            }
            temp.next=n;
            tail=n;
            n.next=head;
        }
    }
    public int getValue(CycleLink l){
        return l.val;
    }
    public void display() {
        CycleLink temp = head;
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
        CycleLink temp=head;
        while(temp.next.val!=value){
            temp=temp.next;
        }
        if(temp.next==tail){
            tail=temp;
        }
        temp.next=temp.next.next;
        
    }
}
