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
    long taxID = 123456789;

    ShopModel shopModel = new ShopModel();
    shopModel.ShopModel(name, owner, taxID);

    assertThat(shopModel.name, is("Computer Shop"));
    assertThat(shopModel.owner, is("Ayelén"));
    assertThat(shopModel.taxID, is(123456789));

    }
    
}
