package models;

public class ComputerModel {
    private String brand, memory, processor, operatingSystem;
    private float price;

    public ComputerModel(String brand, String memory, String processor, String operatingSystem, float price) {
        this.brand = brand;
        this.memory = memory;
        this.processor = processor;
        this.operatingSystem = operatingSystem;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getMemory() {
        return memory;
    }

    public String getProcessor() {
        return processor;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public float getPrice() {
        return price;
    }

}
