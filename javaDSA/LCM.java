package javaDSA;
import java.util.*;

public class LCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int a=sc.nextInt();
        System.out.println("Enter the element");
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];

        for(int i=0;i<a;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int lcm=max;
        
        System.out.println("max:"+lcm);
          while(true){
           int p=1;
           for(int i=0;i<a;i++){
            if(lcm%arr[i]!=0){
                p=0;
                break;
           }
          }
          if(p==1){
            break;
          }
          lcm+=max;
        }
          
        // System.out.println("Enter the number1");
        // int a=sc.nextInt();
        // System.out.println("Enter the number2");
        // int b=sc.nextInt();
        // int max=0,lcm=0;
        // if(a>b){
        //     max=a;
        // }
        // else{
        //     max=b;
        //     lcm=max;
        // }
        // while(true){
        //     if(lcm%a==0 && lcm%b==0){
        //         break;
        //     }
        //     lcm=lcm+max;
        // }
        // System.out.println("LMC"+lcm);
        System.out.println("LCM::"+lcm);
        sc.close();
}
}
