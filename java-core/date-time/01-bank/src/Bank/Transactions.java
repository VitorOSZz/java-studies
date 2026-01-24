package Bank;

import java.time.LocalDateTime;

public class Transactions {

    private final Entity payer;
    private final Entity receiver;
    private final long money;
    private final LocalDateTime date;
    private final boolean realized;

    public Transactions(Entity payer, Entity receiver, long money, LocalDateTime date, boolean realized) {
        this.payer = payer;
        this.receiver = receiver;
        this.money = money;
        this.date = date;
        this.realized = realized;
    }

    public boolean isRealized() {
        return realized;
    }
}
