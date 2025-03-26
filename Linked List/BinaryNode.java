import java.util.Stack;

import javax.swing.tree.TreeNode;

public class BinaryNode {
    int val;
    int height;
    BinaryNode root;
    BinaryNode left;
    BinaryNode right;
    BinaryNode(){

    }
    BinaryNode(int val){
        this.val=val;
    }
    public int getValue(){
        return val;
    }
    public int height(BinaryNode node){
        if(node==null){
            return -1;
        }
        else{
            return node.height;
        }
    }
    public void insert(int val){
        root=insert(val,root);
    }
    public BinaryNode insert(int val,BinaryNode bn){
        if(bn==null){
            bn=new BinaryNode();
            bn.val=val;
            return bn;
        }
        if(val<=bn.val){
            bn.left=insert(val, bn.left);
        }
        if(val>bn.val){
            bn.right=insert(val, bn.right);
        }
        bn.height=Math.max(height(bn.left),height(bn.right))+1;
        return bn;
    }
    public void insertD(BinaryNode temp,int val){
        
    }
    public void display(){
        BinaryNode temp=root;
        System.out.println("The root node is "+root.val);
        display(temp,"");
    }
    public void display(BinaryNode node,String detail){
        if(node==null){
            return;
        }
        System.out.println(detail+node.val);
        display(node.left,"the left node of "+node.val+" : ");
        display(node.right,"the right node of "+node.val+" : ");
    }
    public boolean balanced(){
        return balanced(root);
    }
    public boolean balanced(BinaryNode node){
        if(node==null){
            return true;
        }
        return Math.abs(height(node.left)-height(node.right))<=1 && balanced(node.left) && balanced(node.right);
    }
    public void preOrder(){
        preOrder(root);
    }
    void preOrder(BinaryNode bn){
        if(bn==null){
            return;
        }
        System.out.print(bn.val+"->");
        preOrder(bn.left);
        preOrder(bn.right);
    }
    public void postOrder(){
        postOrder(root);
    }
    void postOrder(BinaryNode bn){
        if(bn==null){
            return;
        }
        postOrder(bn.left);
        postOrder(bn.right);
        System.out.print(bn.val+"->");
    }
    public void inOrder(){
        inOrder(root);
    }
    void inOrder(BinaryNode bn){
        if(bn==null){
            return;
        }
        inOrder(bn.left);
        System.out.print(bn.val+"->");
        inOrder(bn.right);
        //System.out.print(bn.val+"->");
    }

    int index=0;
    public BinaryNode buildTree(String traversal,int depth){

        int count = 0;  
        while (index + count < traversal.length() && traversal.charAt(index + count) == '-') {  
            count++;  
        }  
        // Check if current depth matches the number of dashes  
        if (count != depth) {  
            return null; // If not, we can't construct a node here  
        }  
        // Move the index past the dashes to obtain the value of the current node  
        index += count;  
        // Parse the value  
        StringBuilder sb = new StringBuilder();  
        while (index < traversal.length() && Character.isDigit(traversal.charAt(index))) {  
            sb.append(traversal.charAt(index++));  
        }  
        
        // Create the current node  
        BinaryNode node = new BinaryNode(Integer.parseInt(sb.toString()));  
        
        // Recursive calls to build left and right subtrees  
        node.left = buildTree(traversal, depth + 1);  
        node.right = buildTree(traversal, depth + 1);  
        root=node;
        return node;
    }
    public void convert(String s,BinaryNode n,int a){
        if(n==null){
            return;
        }
        if((n.left==null||n.right==null) && s.length()==0 ){
            BinaryNode bn=new BinaryNode();
            bn.val=a;
            if(n.left==null){
                n.left=bn;
            }
            else{
                n.right=bn;
            }
            return;
        }
        if(s.length()!=0){
            s=s.substring(1);
        }
        convert(s,n.left,a);
        convert(s,n.right,a);
    }



    public void insertAVL(int val){
        root=insertAVL(val,root);
    }
    public BinaryNode insertAVL(int val,BinaryNode bn){
        if(bn==null){
            bn=new BinaryNode();
            bn.val=val;
            return bn;
        }
        if(val<=bn.val){
            bn.left=insertAVL(val, bn.left);
        }
        if(val>bn.val){
            bn.right=insertAVL(val, bn.right);
        }
        bn.height=Math.max(height(bn.left),height(bn.right))+1;
        return rotate(bn);
    }

    public BinaryNode rotate(BinaryNode bn){
        if(height(bn.left)-height(bn.right)>1){
            if(height(bn.left.left)-height(bn.left.right)>0){
                return rightrotate(bn);
            }
            else if(height(bn.left.left)-height(bn.left.right)<0){
                bn.left=leftrotate(bn.left);
                return rightrotate(bn);
            }
        }
        if(height(bn.right)-height(bn.left)>1){
            if(height(bn.right.right)-height(bn.right.left)>0){
                return leftrotate(bn);
            }
            else if(height(bn.right.right)-height(bn.right.left)<0){
                bn.right=rightrotate(bn.right);
                return leftrotate(bn);
            }
        }
        bn.height=Math.max(height(bn.left),height(bn.right))+1;
        return bn;
    }
    public BinaryNode leftrotate(BinaryNode c){
        BinaryNode g=c.right;
        BinaryNode t=g.left;
        g.left=c;
        c.right=t;
        return g;
    }
    public BinaryNode rightrotate(BinaryNode p){
        BinaryNode c=p.left;
        BinaryNode t=c.right;
        c.right=p;
        p.left=t;
        return c;
    }
    int sum=0;
    public boolean hasPathSum(BinaryNode root, int targetSum) {
        if(root==null){
            return false;
        }
        sum+=root.val;
        if(sum>targetSum){
            sum-=root.val;
            return false;
        }
        else if(sum==targetSum){
            return true;
        }
        return hasPathSum(root.left,targetSum) || hasPathSum(root.right,targetSum);
    }
}
