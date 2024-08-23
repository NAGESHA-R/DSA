package javaDSA;

public class fibonaci_series {
    public static void main(String[] args) {
        int a = 20;
        int n1 = 0;
        int n2 = 1;
        System.out.print(n1 + "\t" + n2);
        for (int i = 2; i < a; i++) {
            int n3=n1+n2;
            System.out.print("\t"+n3);
            n1=n2;
            n2=n3;
        }
    }
}
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181
