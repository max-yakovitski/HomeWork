package by.yakovitski.mytasks.lesson6.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DigitalArr {
    public static void main(String[] args) {
        List <Integer> digitalList = new ArrayList<>();//можно создать сразу TreeSet
        // - хранит только уникальные элементы
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            digitalList.add(random.nextInt(10));
        }
        System.out.println(digitalList);

        for (int i = 0; i < digitalList.size(); i++) {
            for (int j = i + 1; j < digitalList.size(); j++) {
                if (digitalList.get(i) == digitalList.get(j)){
                    digitalList.remove(i);
                }
            }
        }
        System.out.println(digitalList);
    }
}
