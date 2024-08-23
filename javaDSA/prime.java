package javaDSA;

public class prime {
    /*
     * 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71,
     * 73, 79, 83, 89, 97.
     */
    public static void main(String arsg[]) {
        int a = 999;
        for(int i=1;i<=a;i++){
            if(isprime(i)){
                System.out.print(i+"\t");
            }
        }
    }

    private static boolean isprime(int a) {
        boolean flag=false;
        if (a <= 1) {
            flag=false;
        } else if (a == 2 || a == 3) {
            flag=true;
        }
            int count = 0;
            for (int i = 1; i <= a; i++) {
                if (a % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                flag=true;
            }
        return flag;
    }
}
