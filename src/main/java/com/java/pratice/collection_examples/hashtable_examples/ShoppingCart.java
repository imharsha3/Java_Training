package com.java.pratice.collection_examples.hashtable_examples;

import java.util.Hashtable;

class Product{
    String productName;
    int quantity;

    public Product(String pName, int quantity) {
        this.productName = pName;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        Hashtable<String, Product> shoppingCart = new Hashtable<>();
        shoppingCart.put("P001", new Product("Apple", 3));
        shoppingCart.put("P002", new Product("Banana", 6));
        shoppingCart.put("P003", new Product("Grapes", 1));

        System.out.println("Items in the cart:");
        displayCart(shoppingCart);

        addItem(shoppingCart);
        System.out.println("Updated Items in the cart:");
        displayCart(shoppingCart);

        shoppingCart.remove("P003");
        System.out.println("Updated Items in the cart:");
        displayCart(shoppingCart);

        String productCode = "P004";
        Product cherry = shoppingCart.get("P004");
        if(cherry != null){
            System.out.println("This item already added in the cart" + cherry);
        }else {
            System.out.println(productCode + " is not in the cart.");
        }

    }

    private static void addItem(Hashtable<String, Product> shoppingCart) {
        Product apple = shoppingCart.get("P001");
        if(apple != null){
            apple.quantity = apple.quantity+1;
            shoppingCart.put("P001", apple);
        }
    }

    private static void displayCart(Hashtable<String, Product> shoppingCart) {
        for(String productCode: shoppingCart.keySet()){
            System.out.println("Product Code:" + productCode + "," + shoppingCart.get(productCode));
        }
    }
}
