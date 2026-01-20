public class Main {
    public static void main(String[] args) {

        Product p1 = new Product("Tv", 900);
        Product p2 = p1;

        p1.name = "Computer";

        Product p3 = new Product("Fan", 150);
        System.out.println(p2.name);

    }
}