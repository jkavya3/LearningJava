package JavaBasics;

public class IncrementDecrementOperators {

    public static void main(String[] args) {
        //sce 1
        int z = 11;

        z = z++ + ++z;

        System.out.println(z);

        //sce 2


        int a = 11, b = 22, c;

        c = a + b + a++ + b++ + ++a + ++b;

        System.out.println("a=" + a);

        System.out.println("b=" + b);

        System.out.println("c=" + c);

        int i = 1, j = 2, k = 3;

        int m = i-- - j-- - k--;

        System.out.println("i=" + i + ", j=" + j + ", k=" + k + ", m=" + m);
    }
}
