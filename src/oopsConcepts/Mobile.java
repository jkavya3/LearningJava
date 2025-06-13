package oopsConcepts;

public class Mobile {
    String brand;
    long price;

    public Mobile (String brnd){
        brand = brnd;
        System.out.println(brand);
    }

    public Mobile (String brnd,long pri){
        brand = brnd;
        price = pri;
        System.out.println(brand + price);
    }


    public static void main(String[] args) {
        Mobile m1 = new Mobile("Samsung");
        Mobile m2 = new Mobile("Oneplus",28000);

    }
}
