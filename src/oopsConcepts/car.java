package oopsConcepts;

public class car {
    String brand;
    String model;
    float price;

    public car (String brand,String model,float price) {
        this.brand = brand;
        this.model=model;
        this.price=price;

 System.out.println("Brand:" + brand + " Model:" + model + " Price:" + price);
    }

    public static void main(String[] args){

 car c = new car("Hyundai","Venue",123.4f);

    }
}

