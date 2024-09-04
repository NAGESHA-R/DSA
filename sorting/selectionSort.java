package sorting;
import java.util.*;
public class selectionSort {
    public static void main(String[] args){
        int[] a={7,8,3,1,2};
        for(int i=0;i<a.length-1;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[min]>a[j]){
                    min=j;
                }
            }
            int temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
