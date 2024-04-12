package javaDSA;
// import java.util.*;
public class slidingWindow {
    public static void main(String[] args) {
        int a[]={9,2,3,4,5,9,1,7};
        int k=2;
        int sum1=0,sum2=0;
        for(int i=0;i<k;i++){
            sum1+=a[i];
            sum2+=a[(a.length-k)+i];
        }
        // for(int i=a.length-1;i>=a.length-k;i--){
        //     sum2+=a[i];
        // }
        if(sum1>sum2){
            System.out.println("max:"+sum1);
        }
        else{
            System.out.println("max:"+sum2);
        }
    } 
}
