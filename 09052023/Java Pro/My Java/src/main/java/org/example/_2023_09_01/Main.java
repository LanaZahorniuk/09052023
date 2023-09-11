package org.example._2023_09_01;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Batman", "Superman", "Spiderman", "Joker"};
        Random random = new Random();
        String randomName = names[random.nextInt(names.length)];
        System.out.println(randomName);

        System.out.println();

    }
}





/*
Superhero battle

Superhero class:
- name
- health
- force
- Weapon class: - name
			    - force
- Protection class: - name
				    - level

методы:
- generateRandomSuperHero()
- fight()  ----> health =  health - (force1 - force2) / level

public static void main(String[] args) {
        String[] names = {"Batman", "Superman", "Spiderman", "Joker"};
        Random random = new Random();
        String randomName = names[random.nextInt(names.length)];
        System.out.println(randomName);
    }
 */