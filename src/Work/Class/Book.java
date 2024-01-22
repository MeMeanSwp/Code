package Work.Class;

import java.util.ArrayList;

public class Book {

    //Book Task 2 
    public String isbn;
    public String title;
    public String type;
    public double price;

    //Book Task 3
    public Book(String isbn, String title, String type, double price){

    //Book Task 4
        this.isbn = isbn;
        this.title = title;
        this.type = type;
        this.price = price;
    }
}
    //Book Task 6
class BookStore {
    public ArrayList<Book> books = new ArrayList<>();

    //Book Task 7
    public void addBook(String isbn, String title, String type, double price){
        Book book = new Book(isbn, title, type, price);
        books.add(book);
    }
}
