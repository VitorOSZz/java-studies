public class ImportedProduct extends Product {

    private long customsFee;

    public ImportedProduct(String name, double price, double customsFee) {
        super(name, price);
        this.customsFee = (long) (customsFee * 1000);
    }

    long getCustomsFee() {
        return customsFee;
    }

    public long totalPrice() {
        return this.getPrice() + this.customsFee;
    }

    // Polymorphism
    @Override
    public String priceTag() {
        return this.getName() + " $ " + (this.totalPrice() / 1000.00) + " (Custom Fee: $"
                + (this.getCustomsFee() / 1000.00) + ")";
    }
}
