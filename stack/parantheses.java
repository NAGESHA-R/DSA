package stack;

class stackNode {
    Node top;

    stackNode() {
        this.top = null;

    }

    class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            next = null;
        }
    }

    public boolean isEmpty() {
        return top == null;
    }

    public boolean push(char c) {
        Node newNode = new Node(c);
        newNode.next = top;
        top = newNode;
        return top != null;
    }

    public char pop() {
        if (isEmpty()) {
            return '\0';
        }
        char c = top.data;
        top = top.next;
        return c;
    }

    public void display() {
        Node curr = top;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
}
public class parantheses{
    public static void main(String[] args) {
        stackNode node = new stackNode();
        String s = "{({}})}";
        boolean isBalanced = true;
    
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
    
            if (c == '(' || c == '{') {
                node.push(c);
            } else if (c == ')' || c == '}') {
                if (node.isEmpty()) {
                    break;
                }
                char topChar = node.pop();
                if ((c == ')' && topChar != '(') || (c == '}' && topChar != '{')) {
                    break;
                }
            }
        }
        
        if (!node.isEmpty()) {
            isBalanced = false;
        }
    
        if (isBalanced) {
            System.out.println("Parentheses are balanced");
        } else {
            System.out.println("Parentheses are not balanced");
        }
    }
    
}
