package LoopingPrograms;

public class fibnocii {
    public static void main(String[] args) {

        int num1=0;
        int num2=1;
        int n=10;
        int num3 =0;

        System.out.println("Fibnocci Series upto" +n );
        for(int i=1;i<=n;i++)
        {
            System.out.println(num1);
            num3 = num1+num2;
            num1 = num2;
            num2=num3;

        }

    }
}
