import java.time.LocalDate;

public class UsedProduct extends Product {

    private final LocalDate manufactureDate;

    public UsedProduct(String name, double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    // Polymorphism
    @Override
    public String priceTag() {
        return this.getName() + " (used) $ "
                + (this.getPrice() / 1000.00 + " (manufacture date: " + this.manufactureDate + ")");
    }
}
