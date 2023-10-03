package org.example._2023_09_18;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TaskMap {

    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(1, "Anna");
        hashMap.put(2, "Lana");
        hashMap.put(3, "Vera");
        hashMap.put(4, "Tom");
        hashMap.put(5, "John");

        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
        treeMap.put(1, "Anna-Maria");
        treeMap.put(2, "Lana");
        treeMap.put(3, "Vera");
        treeMap.put(4, "Tom");
        treeMap.put(5, "John");
        treeMap.put(6, "Stephen");
        treeMap.put(7, "Lara");
        treeMap.put(8, "Luisa");


        getKeyAndValue(hashMap, treeMap);
        System.out.println("Сумма длин ключей = " + getSumKeyLengths(hashMap, treeMap));
        getArithmeticMeanValues(hashMap, treeMap);
        System.out.println("Максимальное значение ключа HashMap: " + getKeyMax(hashMap));
        System.out.println("Минимальное значение ключа TreeMap: " + getKeyMin(treeMap));
        getNoEvenValues(hashMap);


    }


    // Переберите все ключи и значения в HashMap и TreeMap и выведите их на экран.
    static void getKeyAndValue(HashMap<Integer, String> hashMap, TreeMap<Integer, String> treeMap) {
        for (Map.Entry<Integer, String> set : hashMap.entrySet()) {
            System.out.println("HashMap: " + set.getKey() + "|" + set.getValue());
        }
        System.out.println("----------------------------------------------");
        for (Map.Entry<Integer, String> set : treeMap.entrySet()) {
            System.out.println("TreeMap: " + set.getKey() + "|" + set.getValue());
        }

    }


    // Переберите только ключи в HashMap и TreeMap и найдите сумму их длин.
    public static int getSumKeyLengths(HashMap<Integer, String> hashMap, TreeMap<Integer, String> treeMap) {
        int result = 0;
        for (Integer current : hashMap.keySet()) {
            result += current.toString().length();
        }

        for (Integer current : treeMap.keySet()) {
            result += current.toString().length();
        }
        return result;
    }


        // Переберите только значения в HashMap и TreeMap и найдите их среднее значение.
        static void getArithmeticMeanValues
        (HashMap < Integer, String > hashMap, TreeMap < Integer, String > treeMap){
            int h = 0;
            int t = 0;

            for (String string : hashMap.values()) {
                h += string.length();
            }
            System.out.println("среднее значение hashMap = "+h / hashMap.size());

            for (String string : treeMap.values()) {
                t += string.length();
            }
            System.out.println("среднее значение treeMap = "+t / treeMap.size());
        }


        // Переберите HashMap и найдите ключ с максимальным значением.
        static int getKeyMax(HashMap<Integer, String> hashMap) {
        int maxKey = 0;

            for (Map.Entry<Integer,String> entry: hashMap.entrySet()) {
                if (entry.getKey() > maxKey){
                    maxKey = entry.getKey();
                }
            }
            return maxKey;
        }


        // Переберите TreeMap и найдите ключ с минимальным значением.
        static int getKeyMin(TreeMap<Integer, String> treeMap) {
            int minKey = 0;

            for (Map.Entry<Integer,String> entry: treeMap.entrySet()) {
                if (entry.getKey() < minKey){
                    minKey = entry.getKey();
                }
            }
            return minKey;
        }


        // Переберите HashMap и удалите все элементы с четными значениями.
        static void getNoEvenValues(HashMap<Integer, String> hashMap) {
            for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
                if (entry.getValue().length() % 2 != 0) {
                    System.out.println("Вот результат без чётных значений: " + entry.getValue());
                }
            }
        }



    }









/*

Переберите TreeMap и удалите все элементы с ключами, начинающимися с буквы 'A'.
Переберите TreeMap и найдите наибольший ключ, который меньше или равен заданному ключу.
**Переберите HashMap и найдите ключ с максимальной суммой значений в его вложенных HashMap: HashMap<String, HashMap<String, Integer>> nestedHashMap = new HashMap<>();
*/