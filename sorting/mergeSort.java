package sorting;
import java.util.*;
public class mergeSort {
    public static void main(String[] args){
        int[] arr={1,2,1};
        arr=MergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static int[] MergeSort(int[] arr){
        if(arr.length<=1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left=MergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right=MergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left,right);
    }
    private static int[] merge(int[] first,int[] second){
        int[] result=new int[first.length+second.length];

        int i=0,j=0,k=0;
        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                result[k]=first[i];
                i++;
            }
            else{
                result[k]=second[j];
                j++;
            }
            k++;
        }
        while(i<first.length){
            result[k]=first[i];
                i++;
                k++;
        }
        while(j<second.length){
            result[k]=second[j];
            j++;
            k++;
        }
        return result;
    }
}
