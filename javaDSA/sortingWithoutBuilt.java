package javaDSA;
import java.util.Arrays;
public class sortingWithoutBuilt {
    public static void main(String[] args) {
        int a[]={1,2,5,3,4,6,7,8};
        
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println("second largest:"+a[a.length-2]);
    }
    
}
