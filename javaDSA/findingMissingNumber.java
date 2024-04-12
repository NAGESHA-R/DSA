package javaDSA;
import java.util.*;
public class findingMissingNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the Size:");
        int n=sc.nextInt();
        int a[]=new int[n];
        int num=n+1;
        int sum=num*(num+1)/2;
        System.out.println("Enter the range elements:");
        
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            sum=sum-a[i];
        }
        System.out.println("missing element:"+sum);
        sc.close();
    }
}
