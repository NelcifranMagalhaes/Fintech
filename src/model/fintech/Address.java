package model.fintech;

import java.util.UUID;

public class Address {

    private final String id;
    private int houseNumber;
    private String cep;
    private String street;
    private String cityName;


    public Address(int houseNumber, String cep, String street, String cityName){
        this.houseNumber = houseNumber;
        this.cep = cep;
        this.street = street;
        this.cityName = cityName;
        this.id = UUID.randomUUID().toString();
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getId() {
        return id;
    }

    public String getFullAddress() {

        return "Rua: " + this.street + ", Numero: " + this.houseNumber + ", Cidade: "+ this.cityName + ", CEP: "+ this.cep;
    }
}
