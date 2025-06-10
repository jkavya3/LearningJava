package LoopingPrograms;

public class AmstrongNumber {
    public static void main(String[] args) {
        int n = 153,temp,rem;
        double Ams=0;
        temp=n;
        while (n!=0)
        {
            rem = n%10;
            Ams=Ams+Math.pow(rem,3);
            n=n/10;
        }

        if(Ams==temp)
        {
            System.out.println(temp +"is an Amstrong number");
        }else
            System.out.println(temp +"is not an Amstrong number");

    }
}
