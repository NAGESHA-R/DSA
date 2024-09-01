package stack;

class NodeList {
    Node top;

    NodeList() {
        this.top = null;
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    boolean isEmpty(){
        return top==null;
    }

    public boolean push(int data) {
        Node newNode = new Node(data);
        newNode.next=top;
        top=newNode;
        return top!=null;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("empty stack");;
        }
        Node curr=top;
        while(curr!=null){
            System.out.print(curr.data+"\t");
            curr=curr.next;
        }
    }
    public void peek(){
        if(isEmpty()){
            System.out.println("empty stack");
        }
        System.out.println("\n"+top.data);
    }
    public int pop(){
        if(isEmpty()){
            return -1;
        }
        int topdata=top.data;
        top=top.next;
        return topdata;
    }
    public void Size(){
        if(isEmpty()){
            System.out.println("Empty stack");
        }
        System.out.println(top);
    }
}

public class stacks {
    public static void main(String[] args) {
        NodeList stack = new NodeList();
        stack.push(50);
        stack.push(45);
        stack.push(60);
        stack.push(12);
        stack.push(23);
        stack.push(82);
        
        
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.display();
        stack.peek();
        stack.Size();
    }

}
