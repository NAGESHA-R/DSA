package javaDSA;

import java.util.*;
public class oddOrEven {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if((a&1)==1){
            System.out.println("odd");
        }
        else{
            System.out.println("even");
        }
        sc.close();
    }
}
