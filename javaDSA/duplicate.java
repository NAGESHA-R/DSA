package javaDSA;
import java.util.*;

public class duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the arr1 size:");
        int a = sc.nextInt();
        System.out.println("enter the arr2 size:");
        int b = sc.nextInt();
        int arr1[] = new int[a];
        int arr2[] = new int[b];
        // ArrayList<Integer> darr = new ArrayList<>();
        System.out.println("enter the arr1 element:");
        for (int i = 0; i < a; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("enter the arr2 element:");
        for (int j = 0; j < b; j++) {
            arr2[j] = sc.nextInt();
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (arr1[i] == arr2[j]) {
                    arr1[i] = 0;
                    arr2[j] = 0;
                    break;
                }
            }
        }
        int t = 0;
        for (int i = 0; i < a; i++) {
            if (arr1[i] != 0) {
                t += arr1[i];
            }
        }
        for (int j = 0; j < b; j++) {
            if (arr2[j] != 0) {
                t += arr2[j];
            }
        }
        System.out.println("total:"+t);
        sc.close();
    }
}
