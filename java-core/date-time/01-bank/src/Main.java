import Bank.Transactions;
import Bank.User;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

//        Date date = new Date();
//        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
//        System.out.println(dateFormat.format(date));


        List<Transactions> vitorTransactions = new ArrayList<>();
        User vitor = new User("Vitor", 1000, vitorTransactions);
        List<Transactions> sarahTransactions = new ArrayList<>();
        User sarah = new User("Sarah", 700, sarahTransactions);
        System.out.println(vitor);

        vitor.pay(sarah, 300);
        vitor.pay(sarah, 300);
        vitor.pay(sarah, 300);
        vitor.pay(sarah, 300);
        vitor.pay(sarah, 300);
        System.out.println("Vitor money: " + vitor.getTotalMoney());
        System.out.println("Sarah money: " + sarah.getTotalMoney());

        System.out.println(vitorTransactions);
    }
}