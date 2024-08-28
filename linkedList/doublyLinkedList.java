package linkedList;
import java.util.*;
class doublyList {
    Node head;

    doublyList() {
        head = null;
    }

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int d) {
            this.data = d;
            this.next = null;
            this.prev=null;
        }
    }
        public boolean addingAtFirst(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
            }
            else{
                newNode.next=head;
                head.prev=newNode;
                head=newNode;
            }
            return true;
        }
        public boolean addingAtLast(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node curr = head;
                while (curr.next!= null) {
                    curr=curr.next;
                }
                curr.next=newNode;
                newNode.prev=curr;
            }
            return true;
        }
        public void addingAfterKey(int data, int key){
            Node newNode=new Node(data);
            if(head==null){
                System.out.println("Empty List");
            }
            if(head.data==key){
                head.next=newNode;
                newNode.prev=head;
            }
            Node curr=head;
            while(curr!=null){
                if(curr.data==key){
                    newNode.next=curr.next;
                    curr.next.prev=newNode;
                    curr.next=newNode;
                    newNode.prev=curr;
                    break;
                }
                curr=curr.next;
            }
        }
        public void addingBeforeKey(int data, int key){
            Node newNode=new Node(data);
            if(head==null){
                System.out.println("Empty List");
            }
            if(head.data==key){
                newNode.next=head;
                head.prev=newNode;
                
            }
            Node curr=head;
            while(curr.next!=null){
                if(curr.next.data==key){
                    newNode.next=curr.next;
                    curr.next.prev=newNode;
                    curr.next=newNode;
                    newNode.prev=curr;
                    break;
                }
                curr=curr.next;
            }
        }
    public void dispaying(){
        if(head==null){
            System.out.println("empty list");
        }
        System.out.print("List elements:");
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"\t");
            curr=curr.next;
        }
    }
}
public class doublyLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        doublyList node = new doublyList();
        boolean flag = true;
        while (flag) {
            System.out.println("\n1.Enter the data to add At last:");
            System.out.println("2.Enter the data to add At first");
            System.out.println("3.Dispaly the list");
            System.out.println("4.searching for element");
            System.out.println("5.removing the key");
            System.out.println("6.Exit");
            switch (sc.nextInt()) {
                case 1:
                    System.out.println("Enetr the Node data");
                    int data = sc.nextInt();
                    node.addingAtLast(data);
                    break;
                case 2:
                    System.out.println("Enetr the Node data");
                    data = sc.nextInt();
                    node.addingAtFirst(data);
                    break;
                case 3:
                    node.dispaying();
                    break;
                case 4:
                    System.out.println("Enter data and key:");
                     data = sc.nextInt();
                    int key= sc.nextInt();
                    node.addingAfterKey(data,key);
                    break;
                case 5:
                    System.out.println("Enter the key to remove:");
                     data= sc.nextInt();
                    key= sc.nextInt();
                    node.addingBeforeKey(data,key);
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    break;
            }
        }
        sc.close();
    }
}