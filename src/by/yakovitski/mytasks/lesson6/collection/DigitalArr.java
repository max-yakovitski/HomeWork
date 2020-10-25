package by.yakovitski.mytasks.lesson6.collection;

import java.util.*;

public class DigitalArr {
    public static void main(String[] args) {
        List <Integer> digitalList = new ArrayList<>();
        Set<Integer> digitalSet = new HashSet<>();
        Random random = new Random();

        for (int i = 0; i < 10_000; i++) {
            digitalList.add(random.nextInt(10));
            digitalSet.add(random.nextInt(10));
        }
        //реализация с сортировкой
//        System.out.println(digitalList);
        long timeStart = System.currentTimeMillis();//начало работы сортировки
        Collections.sort(digitalList);
        for (int i = 0; i < digitalList.size() - 1; i++) {
            if (digitalList.get(i).equals(digitalList.get(i + 1))) {
                digitalList.remove(digitalList.get(i + 1));
                i--;
            }
        }
        System.out.println(digitalList);
        long timeEnd = System.currentTimeMillis();// конец работы сортировки
        long workTime = timeEnd - timeStart;//время работы
        System.out.println("вариант курильщика - " + workTime + " mls");
        //реализация через Set
        long timeStart2 = System.currentTimeMillis();//начало работы сортировки
        List<Integer> setToList = new ArrayList<>(digitalSet);
        System.out.println(setToList);
        long timeEnd2 = System.currentTimeMillis();// конец работы сортировки
        long workTime2 = timeEnd2 - timeStart2;//время работы
        System.out.println("вариант здорового человека - " + workTime2 + " mls");
    }

}