public class LinkedList {
    public static void main(String[] args) {
        
        Node n=new Node();
        n.insertFirst(2);
        n.insertFirst(1);
        n.insertFirst(9);
        n.insertFirst(9);
        n.insertFirst(5);
        n.insertFirst(7);
        Node n2=new Node();
        n2.head=n.deletenode(n.head, 1);
        n2.display();
    }
}
