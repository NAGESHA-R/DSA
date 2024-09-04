package sorting; 
import java.util.*;
public class bubbleSort {
    public static void main(String[] args){
        int[] arr={2,5,1,4,3};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    System.out.println("before:"+Arrays.toString(arr));
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    System.out.println(Arrays.toString(arr));
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
