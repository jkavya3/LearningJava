package oopsConcepts;

public class Book {
    String title;
    String author;
    float price;

    public Book(String tit,String auth,float pri) {
        title = tit;
        author=auth;
        price=pri;

        System.out.println("Tilte:" + title + " Author" + author +"Price" + price);
    }

    public static void main (String[] args){
        Book b = new Book("Revolution 2020","Chetan Bhagat",359.78f);
    }

}
