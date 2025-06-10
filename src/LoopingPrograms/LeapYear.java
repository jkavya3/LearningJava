package LoopingPrograms;

public class LeapYear {
    public static void main(String[] args) {


        int year = 2020;
        boolean leap=false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    leap=true;
                else
                    leap=false;
            } else
               leap=true;

        } else
            leap = false;
        if(leap = true) {
            System.out.println("Year is a leap year" + year);
        } else {
            System.out.println("Year is not a leap year" + year);
        }
    }
}
