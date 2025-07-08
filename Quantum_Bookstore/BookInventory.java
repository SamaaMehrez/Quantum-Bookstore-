package Quantum_Bookstore;

import java.util.*;

public class BookInventory{
    private Map<String,Book> books = new HashMap<>();
    public void addBook(Book book){
        books.put(book.ISBN,book);
        System.out.println("Book with ISBN "  + book.ISBN + " is added");
    }
    public List<Book> removeOutdatedBooks(int currentYear, int maxNumberOfYears) {
        List<Book> outdatedBooks = new ArrayList<>();
        Iterator<Map.Entry<String, Book>> iterator = books.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Book> entry = iterator.next();
            Book book = entry.getValue();

            if ((currentYear - book.year) > maxNumberOfYears) {
                outdatedBooks.add(book);
                iterator.remove();
                System.out.println("Book with ISBN " + book.ISBN + " is removed");
            }
        }

        return outdatedBooks;
    }

    public double buyBook(String ISBN, int quantity, String email, String address){
        Book book = books.get(ISBN);
        if(book == null){
            throw new NullPointerException("Book with ISBN " + ISBN + " not found");
        }
        return book.buy(ISBN,quantity,email,address);

    }
    public void printBooks(){
        for(Book book : books.values()){
            System.out.println("ISBN: " + book.ISBN + "\nTitle: " + book.title);
            System.out.println("-------------------------------------------");
        }
    }
}
