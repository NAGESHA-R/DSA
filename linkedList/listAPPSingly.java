package linkedList;

import java.util.*;

class Linkedlist {
    Node head;

    Linkedlist() {
        head = null;
    }

    class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    // searchingKey
    public void searchKey(int k) {
        if (head == null) {
            System.out.println("list is empty");
        }
        Node curr = head;
        while (curr != null) {
            if (curr.data == k) {
                System.out.println("searching key is found:");
                break;
            }
            curr = curr.next;
        }
    }

    public boolean addingLast(int d) {
        Node newNode = new Node(d);
        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
        return true;
    }

    public void printlist() {
        if (head == null) {
            System.out.println("empty list");
        }
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "\t");
            curr = curr.next;
        }
    }

    public boolean addAtfirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        return true;
    }

    public boolean addAfterkey(int data, int key) {
        Node newNode = new Node(data);

        if (head == null) {
            System.out.println("Empty list");
            return false;
        } else if (head.data == key) {
            newNode.next = head.next;
            head.next = newNode;
        } else {
            Node curr = head;
            while (curr != null) {
                if (curr.data == key) {
                    newNode.next = curr.next;
                    curr.next = newNode;
                }
                curr = curr.next;
            }
        }
        return true;
    }

    public boolean addBeforekey(int data, int key) {
        Node newNode = new Node(data);
        if (head == null) {
            System.out.println("empty list");
            return false;
        }
        if (head.data == key) {
            newNode.next = head;
            head = newNode;
            return true;
        }
        Node curr = head;
        while (curr.next != null) {
            if (curr.next.data == key) {
                newNode.next = curr.next;
                curr.next = newNode;
                return true;
            }
            curr = curr.next;
            
        }
        return true;
    }
}

public class listAPPSingly {
    public static void main(String[] args) {
        Linkedlist node = new Linkedlist();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("\n1.For add atlast.");
            System.out.println("2.For dispaying data.");
            System.out.println("3.Searching perticular key.");
            System.out.println("4.Add at first.");
            System.out.println("5.Add After key.");
            System.out.println("6.Add Before key.");
            System.out.println("7.exit");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter the data for newnode:");
                    int data = sc.nextInt();
                    if (node.addingLast(data)) {
                        System.out.println(data + " added at last");
                    }
                    break;
                case 2:
                    System.out.println("list data:");
                    node.printlist();
                    break;
                case 3:
                    System.out.println("enter key to search:");
                    int key = sc.nextInt();
                    node.searchKey(key);
                    break;
                case 4:
                    System.out.println("enter data to addAtFirst:");
                    data = sc.nextInt();
                    if (node.addAtfirst(data)) {
                        System.out.println(data + " added at first");
                    }
                    break;
                case 5:
                    System.out.println("enter data and key:");
                    data = sc.nextInt();
                    key = sc.nextInt();
                    if (node.addAfterkey(data, key)) {
                        System.out.println(data + " added after " + key);
                    }
                    break;
                case 6:
                    System.out.println("enter data and key:");
                    data = sc.nextInt();
                    key = sc.nextInt();
                    if (node.addBeforekey(data, key)) {
                        System.out.println(data + " added Before " + key);
                    }
                    break;
                case 7:
                    flag = false;
                    System.out.println("Successfully exited...");
                    break;
                default:
                    break;
            }
        }
        sc.close();
    }
}
