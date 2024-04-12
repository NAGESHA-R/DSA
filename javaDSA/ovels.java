package javaDSA;
import java.util.*;
public class ovels {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character");
        int in=sc.next().charAt(0);
        switch (in) {
            case 'a','e','i','o','u':
            case 'A','E','I','O','U':
            System.out.println("its a vowel");
                break;
            default:
            System.out.println("its not a vowel");
                break;
        }
        sc.close();
    }
}
