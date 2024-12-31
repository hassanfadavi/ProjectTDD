package tests;

import Base.BaseTest;
import core.SortingProducts;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class sortProduct extends BaseTest {



    @Test
    public void sort(){

        SortingProducts.addproduct("phone");
        SortingProducts.addproduct("tv");
        SortingProducts.addproduct("laptop");

        Assertions.assertEquals("[laptop,phone,tv]",SortingProducts.sortProducts(),"not");

    }
}
