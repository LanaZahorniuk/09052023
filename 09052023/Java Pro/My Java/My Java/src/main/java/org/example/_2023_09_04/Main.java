package org.example._2023_09_04;

public class Main {

        public static void main(String[] args) {
            PhysicalProduct physicalProduct = new PhysicalProduct("Phone", 500);
            DigitalProduct digitalProduct = new DigitalProduct("Ebook", 20);

            physicalProduct.discount(15);
            digitalProduct.discount(25);

            System.out.println("Physical product price after discount: " + physicalProduct.getName());
            System.out.println("Digital product price after discount: " + digitalProduct.getPreis());
        }
    }

