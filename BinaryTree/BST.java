package BinaryTree;

class BSTs {
    public class Node {
        int val;
        Node left;
        Node right;
        int height;

        Node(int data) {
            this.val = data;
        }
    }

    BSTs() {

    }

    private Node root;

    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int data) {
        if (root == null) {
            root = new Node(data);
        }
        insert(root, data);
    }

    public Node insert(Node node, int data) {
        if (node == null) {
            node = new Node(data);
            return node;
        }
        if (node.val > data) {
            node.left = insert(node.left, data);
        }
        if (node.val < data) {
            node.right = insert(node.right, data);
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node;
    }

    public boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {
        if (node == null) {
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void displaying() {
        displaying(root, 0);
    }

    private void displaying(Node node, int l) {
        if (node == null) {
            return;
        }
        displaying(node.right, l + 1);
        if (l != 0) {
            for (int i = 0; i < l - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------->" + node.val);
        }
        else{
            System.out.println(node.val);
        }

        displaying(node.left, l + 1);

    }
    
}

public class BST {
    public static void main(String[] args) {
        BSTs tree = new BSTs();
        int[] arr = {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < arr.length; i++) {
            tree.insert(arr[i]);
        }
        tree.displaying();
        if(tree.balanced()){
            System.out.println("balanced tree!!");
        }
        else{
            System.out.println("not balanced tree!!");

        }
    }
}