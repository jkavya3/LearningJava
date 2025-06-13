package oopsConcepts;

public class Rectangle {

    int length;
    int breadth;

    public Rectangle (int len, int bth)
    {
        length = len;
        breadth = bth;
    }

    public int area() {
        int area = length*breadth;
        return area;
    }

    public static void main(String[] args){
        Rectangle r=new Rectangle(10,20);
        System.out.println(r.area());

    }
}
