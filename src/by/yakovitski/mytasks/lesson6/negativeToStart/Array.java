package by.yakovitski.mytasks.lesson6.negativeToStart;

import java.util.*;

public class Array {
    public static void main(String[] args) {
        List<Integer> digitalList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int digital = random.nextInt();
            digitalList.add(digital);
        }
        digitalList.sort(Comparator.naturalOrder());
        System.out.println(digitalList);
    }
}
