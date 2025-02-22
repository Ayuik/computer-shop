package models;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ComputerModelTest {

    @Test
    @DisplayName("Should create a ComputerModel with the following details: brand, processor, memory, operatingSystem and price")
    void testComputerModel() {
        ComputerModel computerModel = new ComputerModel("Lenovo", "32 GB", "Intel® Core™ Ultra 7", "Windows 11 Pro 64", 1999.00f);
        assertThat(computerModel.getBrand(), is ("Lenovo"));
        assertThat(computerModel.getMemory(), is ("32 GB"));
        assertThat(computerModel.getProcessor(), is("Intel® Core™ Ultra 7"));
        assertThat(computerModel.getOperatingSystem(), is("Windows 11 Pro 64"));
        assertThat(computerModel.getPrice(), is(1999.00f));        
    }

    @Test
    @DisplayName("Should set the brand of the computer")
    void testSetBrand() {
        ComputerModel computerModel = new ComputerModel("Lenovo", "32 GB", "Intel® Core™ Ultra 7", "Windows 11 Pro 64", 1999.00f);
        computerModel.setBrand("HP");
        assertThat(computerModel.getBrand(), is("HP"));        
    }
    
}
