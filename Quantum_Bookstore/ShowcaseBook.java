package Quantum_Bookstore;

public class ShowcaseBook extends Book{

    public ShowcaseBook(String ISBN, String title, int year) {

        super(ISBN, title, year,0.0);
    }

    @Override
    public double buy(String ISBN, int quantity, String email, String address) {

        throw new UnsupportedOperationException("Not supported.This book isn't for sale.");
    }
}

