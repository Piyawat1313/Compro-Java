import java.util.ArrayList;

class Book{
    String isbn;
    String title; 
    String type; 
    double price; 
    public Book(String isbn, String title, String type, double price) {
        this.isbn = isbn;
        this.title = title;
        this.type = type;
        this.price = price;
    }
    
        
}

class BookStore {
    public ArrayList<Book> books = new ArrayList<>();

    public void addBook(String isbn, String title, String type,double price){
        Book New_B = new Book(isbn, title, type, price);
        books.add(New_B);

    }
}
