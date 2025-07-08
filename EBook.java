package Quantum_Bookstore;

public class EBook extends Book{
    private  String fileType;
    public EBook(String ISBN, String title, int year, double price, String fileType) {
        super(ISBN, title, year, price);
        this.fileType = fileType;
        
    }

    @Override
    public double buy(String ISBN, int quantity, String email, String address) {
        System.out.println("You bought " + quantity + " of book with ISBN " + ISBN + " to" + email);
        MailService.send(email,this);
        return price * quantity;
    }
}
