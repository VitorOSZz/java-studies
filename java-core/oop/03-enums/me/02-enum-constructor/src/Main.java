public class Main {
    public static void main(String[] args) {

        for (Stock s : Stock.values()) {

            System.out.println("Product: " + s + ", price " + s.price + ", Quantity in stock: " + s.quantity);
        }
    }
}