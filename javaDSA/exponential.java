package javaDSA;
import java.util.*;
public class exponential {
    public static void main(String[] args) {
        System.out.println("enter the range:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int q,max=0,c;
        for(int i=a;i<=b;i++){
            c=0;q=i;
            while(q>0&&q%2==0){
                q=q/2;
                c++;
            }
            if(max<c){
                max=c;
            }
        }
        System.out.println("max"+max);
        sc.close();
    }
}
