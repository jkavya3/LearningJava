package LoopingPrograms;

public class fibnociiUsingRecursion {
    public static int fibnocii(int n)
    {
       if(n<=1) {
           return n;
       }
       return fibnocii(n - 1) + fibnocii(n - 2);

    }
    public static void main(String[] args) {
        int n=10;
        for(int i=0;i<=n;i++)
        {
          System.out.println(fibnocii(i));
        }

    }
}
