package javaDSA;
// import java.util.*;
// import java.lang.*;
public class square {
    public static void main(String[] args){
        // int n=7;
        // double res=Math.pow(n,0.5);
        // int a=(int)(res);
        // System.out.println(a);
        // 5 is: 2.23606797749979

        int n=5;
        float x=2;
        float s=0;
        int i=1;
        while(i!=n){
            s=(x+(n/x))/2;
            x=s;
            i++;
        }
        System.out.println(s);
    }
}
