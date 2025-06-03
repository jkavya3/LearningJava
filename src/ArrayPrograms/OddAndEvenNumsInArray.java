package ArrayPrograms;

public class OddAndEvenNumsInArray {
    public static void main(String[] args) {
        int a[]= {5,3,6,8,5,2,8,9,0,1};
        for(int i=0;i<=a.length-1;i++)
        {
            if(a[i]%2==0)
            {
                System.out.println(a[i] + "is even");
            }
            else {
                System.out.println(a[i] + "is odd");
            }
        }
    }
}
