package linkedList;

import java.util.*;

class listNode {
    Node tail;

    listNode() {
        tail = null;
    }

    class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    public boolean addingAtLast(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            tail = newNode;
            tail.next = tail;
        }
        newNode.next = tail.next;
        tail.next = newNode;
        tail = newNode;
        return true;
    }

    public boolean addingAtFirst(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            tail = newNode;
            tail.next = tail;
        }
        newNode.next = tail.next;
        tail.next = newNode;
        return true;
    }

    public void dispaying() {
        if (tail == null) {
            System.out.println("Empty list");
        } else {
            Node curr = tail.next;
            System.out.print("list elements:");
            do {

                System.out.print(curr.data + "\t");
                curr = curr.next;
            } while (curr != tail.next);
        }
    }

    public void searching(int key) {
        if (tail == null) {
            System.out.println("Empty list");
        }
        boolean flag = false;
        Node curr = tail.next;
        do {
            if (curr.data == key) {
                System.out.println("key found");
                flag = true;
            }
            curr = curr.next;
        } while (curr != tail.next);
        if (flag != true) {
            System.out.println("key not found!!");
        }
    }

    public boolean removekey(int key) {
        if (tail == null) {
            System.out.println("Empty list");
            return false;
        }
        if (tail.next == tail && tail.next.data == key) {
            tail = null;
            return true;
        }
        Node curr = tail.next;
        do {
            if (curr.next.data == key) {
                curr.next = curr.next.next;
            }
            curr = curr.next;
        } while (curr != tail.next);
        return true;
    }
}

public class linkedListCirSingly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        listNode node = new listNode();
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
                    System.out.println("Enter the key to search:");
                    int key = sc.nextInt();
                    node.searching(key);
                    break;
                case 5:
                    System.out.println("Enter the key to remove:");
                    key = sc.nextInt();
                    if (node.removekey(key)) {
                        System.out.println("successfully removed the key!!");
                    }
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
