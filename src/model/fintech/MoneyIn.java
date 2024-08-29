package model.fintech;


public class MoneyIn extends Transaction {
    private String source;

    public MoneyIn(String source, double value, String createdAt, String description) {
        super(value, createdAt, description);
        this.source = source;
    }
    @Override
    public String getType() {
        return "Receita";
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

}
