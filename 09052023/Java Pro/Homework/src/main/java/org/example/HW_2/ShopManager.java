package org.example.HW_2;

import java.util.ArrayList;
import java.util.List;

public class ShopManager {

    //Поле products (массив товаров)
     private List<Product> products = new ArrayList<>();



     //Метод addProduct(Product product) для добавления товара в список
    public void addProduct(Product product) {
        products.add(product);
    }

    // Распечатать весь массив продуктов
    public void printAllProducts(){
        for (Product products:
             products) {
            System.out.println("Product: " + products.getName() + ", category - " + products.getCategory()
                    +", price = " + products.getPrice() + "." + products.getCurrency());
        }
    }

    // Метод getProductsByCategory(ProductCategory category) для получения списка товаров по заданной категории
    public List<Product> getProductsByCategory(ProductCategory category){
        List<Product> inCategory = new ArrayList<>();
        for (Product product:
             products) {
            if (product.getCategory()==category){
                inCategory.add(product);
            }
        }
        return inCategory;
    }


    //Метод getProductsByPriceRange(double minPrice, double maxPrice, Currency currency) для получения списка товаров в
    //заданном диапазоне цен и в указанной валюте
    public List<Product> getProductsByPriceRange(double minPrice, double maxPrice, Currency currency){
        List<Product> inPriceRange = new ArrayList<>();
        for (Product product:products) {
            if  (product.getPrice()>= minPrice && product.getPrice() <= maxPrice && product.getCurrency().equals(currency)) {
                inPriceRange.add(product);
            }
        }
        return inPriceRange;
    }



    public static void main(String[] args) {
        ShopManager shopManager = new ShopManager();

        Clothing product1 = new Clothing(001, "Blue Jeans", ProductCategory.JEANS, 20, Currency.EUR, Size.L);
        Clothing product2 = new Clothing(002, "Red Dress", ProductCategory.DRESS, 15, Currency.GBP, Size.S);
        Clothing product3 = new Clothing(003, "Leather Jacket", ProductCategory.WINTER_CLOTHES, 50, Currency.USD, Size.XL);
        Clothing product4 = new Clothing(004, "T-shirt", ProductCategory.SUMMER_CLOTHES, 5, Currency.GBP, Size.M);
        Clothing product5 = new Clothing(005, "Hoodie", ProductCategory.CASUAL_CLOTHES, 30, Currency.EUR, Size.XS);


        //Метод addProduct(Product product) для добавления товара в список
        shopManager.addProduct(product1);
        shopManager.addProduct(product2);
        shopManager.addProduct(product3);
        shopManager.addProduct(product4);
        shopManager.addProduct(product5);


        // Распечатать весь массив продуктов
        shopManager.printAllProducts();



        System.out.println("Список товаров по заданной категории: "
                + shopManager.getProductsByCategory(ProductCategory.SUMMER_CLOTHES));


        System.out.println("Товар(ы) в заданном диапазоне цен и в указанной валюте: "
                + shopManager.getProductsByPriceRange(10,50, Currency.EUR));
    }
}
