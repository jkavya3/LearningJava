package ArrayPrograms;

public class printLargestNumInArray {
    public static void main(String[] args) {
        int a[]= {1,2,3,4,5,7,6,8};
        int max =a[0];
        for (int i=0;i<=a.length-1;i++)
        {
           if(a[i]>=max)
           {
               max=a[i];
           }
        }
        System.out.println("Max number in array is:" +max);
    }
}
