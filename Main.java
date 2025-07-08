import Quantum_Bookstore.*;

import java.util.List;

public class Main {
        public static void main(String[] args) {
            BookInventory inventory = getBookInventory();

            System.out.println("\n<-- Buying a paper book -->");
            double amount1 = inventory.buyBook("B001", 2, "Paper@gmail.com", "Egypt");
            System.out.println("Amount paid: " + amount1);

            System.out.println("\n<-- Buying an eBook -->");
            double amount2 = inventory.buyBook("B002", 1, "E@gmail.com", "N/A");
            System.out.println("Amount paid: " + amount2);

            System.out.println("\n<-- Buying a showcase book -->");
            try {
                inventory.buyBook("B003", 1, "show@gmail.com", "N/A");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println("\n<-- Buying a paper book -->");
            try{
                inventory.buyBook("B004", 6, "paper2@gmail.com", "Cairo");
            }catch(Exception e){
                System.out.println(e.getMessage());
            }

            System.out.println("\n<-- Removing outdated books -->");
           List<Book> books = inventory.removeOutdatedBooks(2025, 5);
            System.out.println("\n<-- Outdated books -->");
           for (Book book : books) {
               System.out.println("ISBN: " + book.getISBN() + "\nTitle: " + book.getTitle());
               System.out.println("-------------------------------------------");
           }
            System.out.println("\n<-- Remaining books -->");
            inventory.printBooks();
        }

    private static BookInventory getBookInventory() {
        BookInventory inventory = new BookInventory();

        Book book1 = new PaperBook("B001", "Programming", 2018, 300.0, 10);
        Book ebook1 = new EBook("B002", "Tech", 2021, 150.0, "Pdf");
        Book showcasebook1 = new ShowcaseBook("B003", "History", 2000);
        Book book2 = new PaperBook("B004", "Graphic", 2024, 200.0, 1);

        inventory.addBook(book1);
        inventory.addBook(ebook1);
        inventory.addBook(showcasebook1);
        inventory.addBook(book2);
        return inventory;
    }
}