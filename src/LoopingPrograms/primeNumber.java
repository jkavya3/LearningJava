package LoopingPrograms;

public class primeNumber {
    public static void main(String[] args) {
        int n=13;
        boolean flag = false;
        if(n==0||n==1)
        {
            flag = true;
            //System.out.println("Not a prime number");
        }
        for(int i=2;i<=n/2;i++)
        {
            if (n%i==0) {
                flag = true;
                break;
            }

        }
        if(!flag)
        {
            System.out.println( n + "is a prime number");
        } else {
            System.out.println( n + "is not a prime number");
        }

    }
}
