package ArrayPrograms;

public class SecondHighestInArray {
    public static void main(String[] args) {
        int a[]={34,23,6,7,34,13};
        int max=Integer.MIN_VALUE;
        int secondmax=Integer.MIN_VALUE;
        for(int i=0;i<=a.length-1;i++)
        {
            if(a[i]>max) {
                secondmax = max;
                max = a[i];
            } else if (a[i]>secondmax && a[i]!=max)
            {
                secondmax=a[i];
            }
        }
        System.out.println("Second max:" + secondmax);
    }
}
