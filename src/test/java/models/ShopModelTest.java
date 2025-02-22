package models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ShopModelTest {
    ShopModel shopModel;

    @BeforeEach
    void setUp() {
        shopModel = new ShopModel("Computer Shop", "Ayelen", 123456789L);
    }

    @Test
    @DisplayName("Should create a ShopModel with a name, owner and a tax identification number")
    void testShopModel() {
    assertThat(shopModel.name, is("Computer Shop"));
    assertThat(shopModel.owner, is("Ayelen"));
    assertThat(shopModel.taxID, is(123456789L));
    }

    @Test
    @DisplayName("Should return the name of the shop")
    void testGetName() {
        String name = shopModel.getName();
        assertThat(name, is("Computer Shop"));
    }

    @Test
    @DisplayName("Should return the owner of the shop")
    void testGetOwner() {
        String owner = shopModel.getOwner();
        assertThat(owner, is("Ayelen"));
    }

    @Test
    @DisplayName("Should return the tax identification number of the shop")
    void testGetTaxID() {
        long taxID = shopModel.getTaxID();
        assertThat(taxID, is(123456789L));
    }

    @Test
    @DisplayName("Should set the name of the shop")
    void testSetName() {
        shopModel.setName("E Shop");
        assertThat(shopModel.getName(), is("E Shop"));
    }

    @Test
    @DisplayName("Should set the owner of the shop")
    void testSetOwner() {
        shopModel.setOwner("Maria");
        assertThat(shopModel.getOwner(), is("Maria"));
    }

    @Test
    @DisplayName("Should set the tax identification number of the shop")
    void testTaxID() {
        shopModel.setTaxID(987654321L);
        assertThat(shopModel.getTaxID(), is(987654321L));
    }
    

}
