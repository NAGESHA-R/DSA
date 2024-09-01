package BinaryTree;
import java.util.*;
class binaryTr{
   
    binaryTr(){

    }
    private class Node{
        int value;
        Node right;
        Node left;
        Node(int value){
            this.value=value;
        }
    }
    private Node root;
    //insert

    public void insert(Scanner sc){
        System.out.println("Enter the root node:");
        int value=sc.nextInt();
        root=new Node(value);
        insert(sc,root);
    }
    private void insert(Scanner sc,Node node){
        //left Node
        System.out.println("Do you like to enter the left Node after:"+node.value);
        boolean left=sc.nextBoolean();
        if(left){
            System.out.println("Enter the left node:");
            int value=sc.nextInt();
            node.left=new Node(value);
            insert(sc, node.left);
        }
        

        //right Node
        System.out.println("Do you like to enter 1the right Node after:"+node.value);
        boolean right=sc.nextBoolean();
        if(right){
            System.out.println("Enter the right Node:");
            int value=sc.nextInt();
            node.right=new Node(value);
            insert(sc, node.right);
        }
        
    }
    public void displaying(){
        displaying(root);
    }
    public void displaying(Node node){
        if(node==null){
            return;
        }
        System.out.println(node.value);
        displaying(node.left);
        System.out.print("\t");
        displaying(node.right);
    }
}
public class sampleTree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        binaryTr bt=new binaryTr();
        bt.insert(sc);
        bt.displaying();
    }
    
}
