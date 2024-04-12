package javaDSA;
import java.util.*;

public class secondLargest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a[] = {3,5,7,4,2,1,6};
        // int arr[] = new int[a.length];
        int max=0;
        for(int i=0;i<a.length;i++){
            for( int j=0;j<a.length;j++){
                if(a[j]>a[i]){
                    max=a[j];
                    a[j]=a[i];
                    a[i]=max;
                }
            }
        }
        System.out.println("array:\t"+Arrays.toString(a));
        System.out.println("arrays second largest:"+(a[a.length-2]));
        s.close();
    }
}
