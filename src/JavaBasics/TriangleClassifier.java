package JavaBasics;

public class TriangleClassifier {
    public static void main (String[] args){


            int l1 = 0, l2 =8, l3 = 7;


            if (l1 == l2 && l2 == l3 && l1==l3) {
                System.out.println("Triangle is equilateral");
            } else if (l1 == l2 || l2 == l3 || l1 == l3) {
                System.out.println("Triangle is isoceles");
            }
            else {
                System.out.println("Triangle is scalene");
            }
                  }
}
