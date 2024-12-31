package tests;

import Base.BaseTest;


import core.AddOrRemoveProduct;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class AddProducts extends BaseTest{


    @Test
    public void addproducts(){
//        add products
        Assertions.assertEquals( "laptop", AddOrRemoveProduct.addproducts("laptop"),"first product is not added correctly");
        Assertions.assertEquals( "tv", AddOrRemoveProduct.addproducts("tv"),"second product is not added correctly");
        Assertions.assertEquals( "phone", AddOrRemoveProduct.addproducts("phone"),"third product is not added correctly");
//         verify added
        Assertions.assertEquals( 3, AddOrRemoveProduct.productCountAdde()," number of products are not correct");

    }


}
