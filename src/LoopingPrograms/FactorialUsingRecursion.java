package LoopingPrograms;

public class FactorialUsingRecursion {
    public static int factorial(int n)
    {
        if(n<=1)
        {
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String[] args)
    {
        int num=0;

        System.out.println("Factorial of " +num + "is " + factorial(num));
    }

}
