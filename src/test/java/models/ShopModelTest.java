package models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ShopModelTest {

    @Test
    @DisplayName("Should create a ShopModel with a name, owner and a tax identification number")
    void testShopModel() {
    String name = "Computer Shop";
    String owner = "Ayelén";
    long taxID = 123456789L;

    ShopModel shopModel = new ShopModel();
    shopModel.ShopModel(name, owner, taxID);

    assertThat(shopModel.name, is("Computer Shop"));
    assertThat(shopModel.owner, is("Ayelén"));
    assertThat(shopModel.taxID, is(123456789L));
    }

    @Test
    @DisplayName("Should return the name of the shop")
    void testGetName() {
        ShopModel shopModel = new ShopModel();
        shopModel.name = "Computer Shop";
        String name = shopModel.getName();
        assertThat(name, is("Computer Shop"));
    }

    @Test
    @DisplayName("Should return the owner of the shop")
    void testGetOwner() {
        ShopModel shopModel = new ShopModel();
        shopModel.owner = "Ayelen";
        String owner = shopModel.getOwner();
        assertThat(owner, is("Ayelen"));
    }

    @Test
    @DisplayName("Should return the tax identification number of the shop")
    void testGetTaxID() {
        ShopModel shopModel = new ShopModel();
        shopModel.taxID = 123456789L;
        String taxID = shopModel.getTaxID();
        assertThat(taxID, is(123456789L));
    }

}
