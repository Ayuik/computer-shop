package models;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

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

    public void setComputerStock(ArrayList<ComputerModel> computerStock) {
        this.computerStock = computerStock;
    }

    public void addStock(ComputerModel computerModel) {
        computerStock.add(computerModel);
    }

    public void removeStock(String brand) {
        computerStock.removeIf(computerModel -> computerModel.getBrand().equals(brand));
    }

    public ArrayList<ComputerModel> searchStock(String brand) {
        ArrayList<ComputerModel> filteredComputers = new ArrayList<ComputerModel>();
        for (ComputerModel computerModel : computerStock) {
            if (computerModel.getBrand().equals(brand)) {
                filteredComputers.add(computerModel);
            }
        }
        return filteredComputers;
    }   
    
}
