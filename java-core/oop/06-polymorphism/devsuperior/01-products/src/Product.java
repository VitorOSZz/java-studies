public class Product {

    private String name;
    private long price;

    public Product(String name, double price) {
        this.name = name;
        this.price = (long) (price * 1000);
    }

    long getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    // Polymorphism
    public String priceTag() {
        return this.getName() + " $ " + (this.getPrice() / 1000.00);
    }
}
