package org.example.HW_2;

public class Product {
    private int id;
    private String name;
    private String category; // (категория товара из ProductCategory)
    private int price;
    private int currency; // (валюта цены из Currency)

public Product (int id, String name, String category, int price, int currency) {
    this.id = id;
    this.name = name;
    this.category = category;
    this.price = price;
    this.currency = currency;
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCurrency() {
        return currency;
    }

    public void setCurrency(int currency) {
        this.currency = currency;
    }

    public class Clothing {
        private int size; //(размер одежды из Size)

        public Clothing (int size) {
            this.size = size;
        }
    }
}

