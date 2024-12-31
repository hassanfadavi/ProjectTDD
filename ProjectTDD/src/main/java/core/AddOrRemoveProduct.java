package core;

public class AddOrRemoveProduct {


    public static int productCount=0;

    public static String addproducts  (String p1 ){
        return addToCart(p1);
    }
    public static String removeproducts  (String p1 ){
        return removeFromeCart(p1);
    }
    public static String addToCart(String cart){
        productCount++;
        return cart;
    }
    public static String removeFromeCart(String cart){
        productCount--;
        return cart;
    }
    public static int productCountAdde( ){
        return  productCount++;
    }
    public static int productCountRemoved( ){
        return  productCount--;
    }





}
