
package javaDSA;

// import java.util.*;

// public class repeateNumber {
//     public static void main(String[] args) {
//         int[] a = { 3, 5, 3, 6, 6,1,4,0,2, 5, 2 };
//         ArrayList<Integer> arr = new ArrayList<>();
        
//         // boolean flag=true;
//         // for(int i=0;i<a.length;i++){
//         // for(int j=i+1;j<a.length;j++){
//         // if(a[i]==a[j]){
//         // flag=false;
//         // System.out.println(a[i]+"\t"+a[j]+"\n");
//         // break;
//         // }
//         // flag=true;
//         // }
//         // if(!flag){
//         // break;
//         // }
//         // }
//         // if(flag){
//         // System.out.println("unique");
//         // }
//         // else{
//         // System.out.println("not unique");
//         // }

//         // unique numbers in array
//         for (int i = 0; i < a.length; i++) {
//             for (int j = i + 1; j < a.length; j++) {
//                 if (a[i] == a[j]) {
//                     arr.add(j);
//                     arr.add(i);
//                 }

//             }
//         }
//         for (int i = 0; i < a.length; i++) {
//             if(arr.contains(i)){
//                 continue;
//             }
//             else{
//                 System.out.println(a[i]);
//             }
//         }
//     }
// }
import java.util.HashSet;
import java.util.Set;

public class UniqueElements {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 2, 5, 1};
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            if (!seen.add(a[i])) {
                duplicates.add(a[i]);
                
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (!duplicates.contains(a[i])) {
                System.out.println(a[i]);
            }
        }
    }
}

