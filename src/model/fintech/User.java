package model.fintech;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User {
    private final String id;
    private String name;
    private String email;
    private String birthdate;
    private String gender;
    private Address address;
    private List<Transaction> transactionList;

    public User(String name, String email, String birthdate, String gender, Address address) {
        this.name = name;
        this.email = email;
        this.birthdate = birthdate;
        this.gender = gender;
        this.address = address;
        this.id = UUID.randomUUID().toString();
        this.transactionList = new ArrayList<>();
    }

    public double calculateTotalMoneyIn() {
        double totalMoney = 0.0;

        for (Transaction moneyIn : transactionList) {
            if (moneyIn.getType().equals("Receita")) {
                totalMoney += moneyIn.getValue();
            }
        }
        return totalMoney;
    }

    public double calculateTotalMoneyOut() {
        double totalMoney = 0.0;

        for (Transaction moneyOut : transactionList) {
            if (moneyOut.getType().equals("Despesas")) {
                totalMoney += moneyOut.getValue();
            }
        }

        return totalMoney;
    }

    public void addTransaction(Transaction money) {
        transactionList.add(money);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<Transaction> TransactionList) {
        this.transactionList = TransactionList;
    }

}
