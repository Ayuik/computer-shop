package models;

import java.util.ArrayList;

public class ShopModel {
    String name;
    String owner;
    long taxID;
    ArrayList<ComputerModel> computerStock = new ArrayList<ComputerModel>();

    public ShopModel(String name, String owner, long taxID, ArrayList<ComputerModel> computerStock) {
        this.name = name;
        this.owner = owner;
        this.taxID = taxID;
        this.computerStock = computerStock;
    
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

    public ArrayList<ComputerModel> getComputerStock() {
        return computerStock;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setTaxID(long taxID) {
        this.taxID = taxID;
    }

    
}