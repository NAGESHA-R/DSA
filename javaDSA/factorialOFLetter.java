package javaDSA;
import java.util.Scanner;

public class factorialOFLetter {
    public static int fact(int n) {
        if (n <= 1)
            return 1;
        else
            return n * fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int num = fact(str.length());
        int[] a = new int[26];
        for (int i = 0; i < str.length(); i++) {
            a[str.charAt(i) - 'a']++;
        }
        int den = 1;
        for (int i = 0; i < 26; i++) {
            if (a[i] > 1)
                den *= fact(a[i]);
        }
        System.out.println(num / den);
        scanner.close();
    }
}

// public class factorialOFLetter {
//     public static void main(String[] args) {
//         String str = "aaabb";
//         int n = str.length();
//         for (int i = 0; i < n; i++) {
//             if (str.charAt(i) == '\0') {
//                 continue;
//             }
//             int count = 1;
//             for (int j = i + 1; j < n; j++) {
//                 if (str.charAt(i) == str.charAt(j)) {
//                     count++;
//                     str = str.substring(0, j) + '\0' + str.substring(j + 1);
//                 }
//             }
//             System.out.println(count);
//         }
//     }
// }
