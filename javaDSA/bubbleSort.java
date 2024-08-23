package javaDSA;
import java.util.*;
public class bubbleSort {
    public static void main(String[] args) {
        int[] a={4,1,3,9,7};

        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                if(a[i]>a[j]){
                    System.out.println(a[i]);
                    int temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                    
                }
                else{
                    continue;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
