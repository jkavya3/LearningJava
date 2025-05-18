package JavaBasics;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int age=sc.nextInt();
        String result="";
        result = (age> 18)?((age>65)?"Senior Citizen":"Adult"):"Minor";
        System.out.println(result);
    }
}
