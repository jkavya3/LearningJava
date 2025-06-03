package ArrayPrograms;

import java.util.Arrays;

public class ExtractZerosAtEnd {
    public static void main(String[] args) {
        int a[] = {1,3,6,7,3,0,3,0,4};
        int j=0,temp=0;
        for(int i=0;i<=a.length-1;i++)
        {
            if(a[i]!=0 && a[j]==0)
            {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }

            if(a[j]!=0)
            {
                j++;
            }
                    }
        System.out.println(Arrays.toString(a));
    }
}
