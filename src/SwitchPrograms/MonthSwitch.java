package SwitchPrograms;

import java.util.Scanner;

public class MonthSwitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month:");
        int month = sc.nextInt();
        System.out.println("Enter year:");
        int year = sc.nextInt();

        switch(month)
        {
            case 1,3,5,7,8,10,12:
                System.out.println("Month has 31 days");
                break;

            case 4,6,9,11:
                System.out.println("Month has 31 days");
                break;

            case 2:
                if((year%4==0 && year%100!=0)||year%400==0)
                {
                    System.out.println("Month has 29 days");
                } else
                    System.out.println("Month has 28 days");

                        }
    }
}
