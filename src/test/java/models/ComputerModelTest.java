package models;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ComputerModelTest {
    ComputerModel computerModel;

    @BeforeEach
    void setUp() {
        computerModel = new ComputerModel("Lenovo", "32 GB", "Intel® Core™ Ultra 7", "Windows 11 Pro 64", 1999.00f);
    }


    @Test
    @DisplayName("Should create a ComputerModel with the following details: brand, processor, memory, operatingSystem and price")
    void testComputerModel() {
        assertThat(computerModel.getBrand(), is ("Lenovo"));
        assertThat(computerModel.getMemory(), is ("32 GB"));
        assertThat(computerModel.getProcessor(), is("Intel® Core™ Ultra 7"));
        assertThat(computerModel.getOperatingSystem(), is("Windows 11 Pro 64"));
        assertThat(computerModel.getPrice(), is(1999.00f));        
    }

    @Test
    @DisplayName("Should set the brand of the computer")
    void testSetBrand() {
        computerModel.setBrand("HP");
        assertThat(computerModel.getBrand(), is("HP"));        
    }

    @Test
    @DisplayName("Should set the memory of the computer")
    void testSetMemory() {
        computerModel.setMemory("24 GB");
        assertThat(computerModel.getMemory(), is("24 GB"));        
    }

    @Test
    @DisplayName("Should set the processor of the computer")
    void testSetProcessor() {
        computerModel.setProcessor("Intel® Core™ Ultra 9");
        assertThat(computerModel.getProcessor(), is("Intel® Core™ Ultra 9"));        
    }

    @Test
    @DisplayName("Should set the operating system of the computer")
    void testSetOperatingSystem() {
        computerModel.setOperatingSystem("Windows 10 Home");
        assertThat(computerModel.getOperatingSystem(), is("Windows 10 Home"));        
    }

    @Test
    @DisplayName("Should set the price of the computer")
    void testSetPrice() {
        computerModel.setPrice(1849.99f);
        assertThat(computerModel.getPrice(), is(1849.99f));        
    }

}
