package core;

import java.util.ArrayList;
import java.util.Collections;

public class SortingProducts {



  public static ArrayList <String> productList=new ArrayList<>();

   public static void    addproduct(String product){
       productList.add(product);
   }
    public static  String sortProducts() {
      Collections.sort(productList);
      return productList.toString().replaceAll(" ","");
    }


}
