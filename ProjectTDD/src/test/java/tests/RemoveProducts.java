package tests;



import Base.BaseTest;

import core.AddOrRemoveProduct;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveProducts extends BaseTest {

    @Test
    public void removeProduct(){
//        add products
        Assertions.assertEquals( "laptop", AddOrRemoveProduct.addproducts("laptop"),"first product is not added correctly");
        Assertions.assertEquals( "tv", AddOrRemoveProduct.addproducts("tv"),"second product is not added correctly");
        Assertions.assertEquals( "phone", AddOrRemoveProduct.addproducts("phone"),"third product is not added correctly");

        //remove products
        Assertions.assertEquals( "phone", AddOrRemoveProduct.removeproducts("phone"),"third product is not added correctly");
        //verify removed
        Assertions.assertEquals( 2, AddOrRemoveProduct.productCountRemoved()," number of products are not correct");


    }



}
