package LoopingPrograms;

public class Factorial {
    public static void main(String[] args) {

        int num = 1;
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of" + num + "is" +fact);
    }
}
