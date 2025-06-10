package LoopingPrograms;

public class fibnociiUsingArrays {
    public static void main(String[] args) {
        int n=10;
        int num[]=new int[n];
        num[0]=0;
        num[1]=1;
        for(int i=2;i<n;i++)
        {
            num[i]=num[i-1]+num[i-2];
        }
        System.out.println("Fibnocii upto" + n+ "is");
        for(int i=0;i<n;i++)
        {
            System.out.println( num[i]);
        }
    }
}
