package models;

public class ShopModel {
    String name;
    String owner;
    long taxID;

    public void ShopModel(String name, String owner, long taxID) {
        this.name = name;
        this.owner = owner;
        this.taxID = taxID;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public long getTaxID() {
        return taxID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setTaxID(long taxID) {
        this.taxID = taxID;
    }

    
}