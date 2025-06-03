package ArrayPrograms;

public class printSmallestNumInArray {
    public static void main(String[] args) {
        int a[]= {6,1,3,8,4,5};
        int min = a[0];
        for(int i=0;i<=a.length-1;i++)
        {
            if(a[i]<=min)
            {
                min = a[i];
            }
        }
        System.out.println("Minimun Number is" + min);
    }
}
