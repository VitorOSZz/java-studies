package Bank;

import java.time.LocalDateTime;
import java.util.List;

public class Entity {

    private String name;
    private long totalMoney;
    private List<Transactions> transactions;

    public Entity(String name, long TotalMoney, List<Transactions> transactions) {
        this.name = name;
        this.totalMoney = TotalMoney;
        this.transactions = transactions;
    }


    void takeMoney(long money) {
        this.totalMoney -= money;
    }

    void addMoney(long money) {
        this.totalMoney += money;
    }

    boolean hasMoney(long money) {
        return (this.totalMoney >= money);
    }

    public void pay(Entity receiver, long money) {
        boolean realized = false;
        if (this.hasMoney(money)) {
            this.takeMoney(money);
            receiver.addMoney(money);
            realized = true;
        }
        LocalDateTime localDateTime = LocalDateTime.now();
        Transactions e = new Transactions(this, receiver, money, localDateTime, realized);
        this.transactions.add(e);
        receiver.addTransaction(e);
    }

    public long getTotalMoney() {
        return totalMoney;
    }

    public List<Transactions> getTransactions() {
        return List.copyOf(transactions);
    }
    protected void addTransaction(Transactions e) {
        this.transactions.add(e);
    }
}