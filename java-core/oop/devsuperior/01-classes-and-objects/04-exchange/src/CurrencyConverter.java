public class CurrencyConverter {

    public static double totalPrice(double value, double quantity) {
        return value*quantity;
    }

    public static double totalPriceWithTax(double value, double quantity) {
        return totalPrice(value, quantity)*1.06;
    }
}
