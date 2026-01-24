package Bank;

import java.util.List;

public class User extends Entity {
    public User(String name, long money, List<Transactions> transactions) {
        super(name, money, transactions);
    }
}