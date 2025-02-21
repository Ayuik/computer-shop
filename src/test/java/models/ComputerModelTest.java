package models;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ComputerModelTest {

    @Test
    @DisplayName("Should create a ComputerModel with the following details: brand, processor, memory, operatingSystem and price")
    void testComputerModel() {
        String brand, memory, processor,operatingSystem;
        float price;
        ComputerModel computerModel = new ComputerModel();
        computerModel.ComputerModel(brand, memory, processor, operatingSystem, price);
        computerModel.setBrand("Lenovo");
        computerModel.setMemory("32 GB");
        computerModel.setProcessor("Intel® Core™ Ultra 7");
        computerModel.setOperatingSystem("Windows 11 Pro 64");
        computerModel.setPrice(1999,00f);
        assertThat(computerModel.getBrand(), is ("Lenovo"));
        assertThat(computerModel.getMemory(), is ("32 GB"));
        assertThat(computerModel.getProcessor(), is("Intel® Core™ Ultra 7"));
        assertThat(computerModel.getOperatingSystem(), is("Windows 11 Pro 64"));
        assertThat(computerModel.getPrice(), is(1999,00f));        
    }
    
}
