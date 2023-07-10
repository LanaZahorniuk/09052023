package de.telran.lesson13.practice;

public class BuildSquare {
    public static void main(String[] args) {
        build(7,3);
    }

    static void build(int width, int height) {
        for (int j = 0; j < height; j++) {
            for (int i = 0; i < width; i++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}
