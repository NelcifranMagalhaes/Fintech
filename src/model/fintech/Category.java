package model.fintech;

import java.util.UUID;

public class Category {
    private final String id;
    public enum Type {
        COMIDA,
        TRANSPORTE,
        DIVERSAO,
        SAUDE,
        OUTRO,
        FREELANCE
    }
    private Type name;
    public Category(Type name) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public Type getName() {
        return name;
    }

    public void setName(Type name) {
        this.name = name;
    }

}
