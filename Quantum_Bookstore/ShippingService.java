package Quantum_Bookstore;

public class ShippingService {
    public static void send(String address, Book book) {
        System.out.println("Shipping " + book.title + " to address: " + address);
    }
}
