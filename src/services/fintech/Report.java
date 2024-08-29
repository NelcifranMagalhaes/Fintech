package services.fintech;

import model.fintech.Transaction;
import model.fintech.User;

import java.util.Date;
import java.util.List;

public class Report {
    private User user;

    public Report(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String TotalMoney() {
        double moneyIn = user.calculateTotalMoneyIn();
        double moneyOut = user.calculateTotalMoneyOut();
        return String.format("Seu saldo atual é : R$%.2f", (moneyIn - moneyOut));
    }
}
