package models;

public class ShopModel {
    String name;
    String owner;
    String taxID;

    public void ShopModel(String name, String owner, long taxID) {
        this.name = name;   
        this.owner = owner;
        this.taxID = taxID;
    }

}
