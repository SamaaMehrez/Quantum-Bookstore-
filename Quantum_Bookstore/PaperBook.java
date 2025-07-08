package Quantum_Bookstore;

public class PaperBook extends Book{
    private int stock;

    public PaperBook(String ISBN, String title, int year, double price,int stock) {

        super(ISBN, title, year, price);
        this.stock = stock;

    }

    @Override
    public double buy(String ISBN,int quantity,String email, String address) {
        if (quantity > stock) {
            throw new IllegalArgumentException("You can't buy this quantity.Not enough stock");
        }
        stock -= quantity;
        System.out.println("You bought " + quantity + " of book with ISBN " + ISBN + " to address " + address);
        ShippingService.send(address,this);
        return price * quantity;
    }
}
