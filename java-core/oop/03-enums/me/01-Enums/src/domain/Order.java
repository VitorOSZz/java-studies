package domain;

import java.time.Instant;

public class Order {

    private final Client client;
    private final Food food;
    private final int units;
    private final long unitPrice;
    private final Instant orderCreatedAt;
    final long deliveryPrice;
    private Status status;
    private final boolean delivery;

    Order(Client client, Food food, int units) {
        this.client = client;
        this.food = food;
        this.units = units;
        this.unitPrice = longprices(food);
        this.orderCreatedAt = Instant.now();
        this.deliveryPrice = 0;
        this.status = Status.UNSTARTED;
        this.delivery = false;
    }
    Order(Client client, Food food, int units, boolean delivery) {
        this.client = client;
        this.food = food;
        this.units = units;
        this.unitPrice = longprices(food);
        this.orderCreatedAt = Instant.now();
        this.deliveryPrice = (long) (9.99*1000L);
        this.status = Status.UNSTARTED;
        this.delivery = delivery;
    }

    static long longprices(Food food) {
        long price = 0;
        switch (food) {
            case PARMIGIANA_BEEF -> price = 40;
            case PARMIGIANA_CHICKEN -> price = (long) (32.99*1000L);
            case LUNCHBOX_FULL_BARBECUE -> price = (long) (45.90*1000L);
            case LUNCHBOX_NORMAL_BARBECUE -> price = (long) (37.99*1000L);
            case LUNCHBOX_SMALL_BARBECUE -> price = (long) (32.99*1000L);
        }
        return price;
    }

    void setStatus(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    Long getTotalMoney() {
        return this.units*this.unitPrice + this.deliveryPrice;
    }

    public Client getClient() {
        return client;
    }

    public Food getFood() {
        return food;
    }

    public int getUnits() {
        return units;
    }

    public long getUnitPrice() {
        return unitPrice;
    }

    public Instant getOrderCreatedAt() {
        return orderCreatedAt;
    }
}
