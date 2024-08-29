package model.fintech;

import java.util.UUID;

public abstract class Transaction {
    private final String id;
    private double value;
    private String createdAt;
    private String description;

    public Transaction(double value, String createdAt, String description) {
        this.value = value;
        this.createdAt = createdAt;
        this.id = UUID.randomUUID().toString();
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public abstract String getType();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
