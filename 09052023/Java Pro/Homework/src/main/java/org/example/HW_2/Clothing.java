package org.example.HW_2;

public class Clothing extends Product {

    private Size size;

    public Clothing(int id, String name, ProductCategory category, int price, Currency currency, Size size) {
        super(id, name, category, price, currency);
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return super.toString() + ", size: " + size;
    }
}
