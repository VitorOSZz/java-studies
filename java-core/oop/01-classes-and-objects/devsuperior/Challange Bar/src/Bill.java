public class Bill {

    char gender;
    int beer;
    int barbecue;
    int softDrink;

    public double feeding() {
        return (beer*5+softDrink*3+barbecue*7);
    }

    public double cover() {
        double price = 4;
        if (feeding() > 30) {
            price = 0;
        }
        return price;
    }

    public double ticket() {
        int price = 10;
        if (gender == 'F') {
            price = 8;
        }
        return price;
    }

    public double total() {
        return (feeding()+cover()+ticket());
    }
}
