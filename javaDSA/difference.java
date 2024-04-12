package javaDSA;
import java.util.*;
public class difference {
    static int result(int n){
        int r=n%10;
        n=n/10;
        while(n>0){
            if(r-(n%10)!=1){
                return 0;
            }
            r=n++%10;
            n=n/10;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        // int arr[]=new int[a];
        // for(int i=a;i<=b;i++){
        //     arr[i]=i+1;
        // }
        for(int i=a;i<b;i++){
            int c=result(i);
            if(c==1){
                System.out.println(i);
            }
        }
        sc.close();
    }
    
}
