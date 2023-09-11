package org.example._2023_09_04;

import java.lang.annotation.Annotation;

public class PhysicalProduct extends Product implements Discountable, ShippingCharge {
    public PhysicalProduct(String name, int preis) {
        super(name, preis);
    }

    @Override
    public void discount(double percentage) {

    }

    @Override
    public void delivery(double charge) {

    }
}