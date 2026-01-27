public enum Stock {
    TV(499.99, 10),
    CELLPHONE_XIAOMI_11(599.99, 10),
    CELLPHONE_XIAOMI_12(659.99, 5),
    LAPTOP_BASIC(499.99, 10),
    LAPTOP_NORMAL(599.99, 7),
    LAPTOP_HIGH(799.99, 4);

    public final double price;
    public final int quantity;

    Stock(double price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }
}
