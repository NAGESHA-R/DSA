package sorting;
import java.util.*;

public class insertionSort {
    public static void main(String[] args){
       int[] a={7,8,3,1,2};
       for(int i=0;i<a.length-1;i++){
        for(int j=i+1;j>0;j--){
            if(a[j]<a[j-1]){
                int temp=a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
                System.out.println(Arrays.toString(a));
            }
        }
       }
       System.out.println(Arrays.toString(a)); 
    }
}
