public class BST {
    public static void main(String[] args) {
        BinaryNode node=new BinaryNode();
        node.insert(5);
        node.insert(10);
        node.insert(3);
        node.insert(4);
        node.insert(2);
        node.insert(1);
        node.insert(12);
        node.insert(11);
        // node.insert(-1);
        // node.insert(-1);
        node.display();
        System.out.println(node.hasPathSum(node.root, 12));
        // node.preOrder();
        // System.out.println();   
        // node.inOrder();
        // System.out.println();
        // node.postOrder();
        // String s="1-2--3--4-5--6--7";
        // BinaryNode b=node.buildTree(s,0);
        // b.display();
        // node.insertAVL(30);
        // node.insertAVL(20);
        // node.insertAVL(40);
        // node.insertAVL(10);
        // node.insertAVL(25);
        // node.insertAVL(35);
        // node.insertAVL(50);
        
        // node.display();
    }
}
