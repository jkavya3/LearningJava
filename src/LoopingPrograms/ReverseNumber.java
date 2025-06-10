package LoopingPrograms;

public class ReverseNumber {
    public static void main(String[] args) {


        int n = 1234;
        int rem = 0, rev = 0;
        for (; n > 0; n = n / 10) {
            rem = n % 10;
            rev = rev * 10 + rem;
        }

        System.out.println("Reverse of a number is " + rev);
    }
}
