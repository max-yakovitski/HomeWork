package by.yakovitski.mytasks.lesson6.collection;

import java.util.*;

public class DigitalArr {
    public static void main(String[] args) {
        List <Integer> digitalList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            digitalList.add(random.nextInt(10));
        }
        System.out.println(digitalList);
        Collections.sort(digitalList);
        for (int i = 0; i < digitalList.size() - 1; i++) {
            if (digitalList.get(i).equals(digitalList.get(i + 1))) {
                digitalList.remove(digitalList.get(i + 1));
                i--;
            }
        }
        System.out.println(digitalList);
    }
}