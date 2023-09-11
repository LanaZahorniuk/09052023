package org.example._2023_09_04;

public class DigitalProduct extends Product implements Discountable{
    public DigitalProduct(String name, int preis) {
        super(name, preis);
    }

    @Override
    public void discount(double percentage) {

    }
}
