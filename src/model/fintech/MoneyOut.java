package model.fintech;

public class MoneyOut extends Transaction {
    private Category category;

    public MoneyOut(double value, String createdAt, String description, Category category) {
        super(value, createdAt, description);
        this.category = category;
    }

    @Override
    public String getType() {
        return "Despesas";
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
