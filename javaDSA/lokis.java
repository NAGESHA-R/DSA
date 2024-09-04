package javaDSA;
import java.util.*;
public class lokis {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        Arrays.sort(arr);
        int sum1 = 0, count = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            sum1 = sum1 + arr[i];
            System.out.println("sum1:"+sum1);
            sum = sum - arr[i];
            System.out.println("sum:"+sum);
            count++;
            if (sum1 > sum)
                break;
        }

        System.out.println(count);
        sc.close();
    }
}
