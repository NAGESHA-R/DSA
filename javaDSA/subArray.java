package javaDSA;
// import java.util.*;
public class subArray {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 3, 5, 7, 8, 9, 1, 2 };
        int l = arr.length;
        int c = 1,i=0,j=1;

        int maxc = 1;
        while (j < l) {
            if(arr[j]>arr[i]){
                j++;
                c++;
                maxc=Math.max(maxc, c);
            }
            else{
                i=j;
                c=1;
                j++;
            }
        }
        maxc=Math.max(maxc, c);
        System.out.println(maxc);

    }

}
