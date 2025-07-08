package Quantum_Bookstore;

public class MailService {
    public static void send(String email, Book book) {
        System.out.println("Sending " + book.title + " to email: " + email);
    }
}

