package by.yakovitski.mytasks.lesson6.vacation;

import by.yakovitski.mytasks.lesson6.vacation.enums.*;
import by.yakovitski.mytasks.lesson6.vacation.types.*;

import java.util.ArrayList;
import java.util.List;

public class VacationTest {
    public static void main(String[] args) {
        Recreation seaRelax = new SeaRelax("морской", 10, TypeOfTransport.PLANE, FoodOption.AI);
        Recreation excursion = new Excursion("экскурсия", 3, TypeOfTransport.BUS, FoodOption.RO);
        Recreation therapy = new Therapy("лечение", 7, TypeOfTransport.TRAIN, FoodOption.HB);
        Recreation shopping = new Shoping("шопинг", 2, TypeOfTransport.BUS, FoodOption.RO);
        Recreation cruise = new Cruise("морской круиз", 14, TypeOfTransport.LINER, FoodOption.UAI);
        cruise.selectAdditionalOptions("тест");
        seaRelax.selectAdditionalOptions("Turkey");
        shopping.selectAdditionalOptions("Молл");


        List<Recreation> list = new ArrayList<>();
        list.add(seaRelax);
        list.add(excursion);
        list.add(therapy);
        list.add(shopping);
        list.add(cruise);

//        System.out.println("Наиденый результат: " + '\n' + SearchTools.findTour(list, "шопинг"));
//        System.out.println("Наиденый результат: " + '\n' + SearchTools.findTour(list, 7));
//        System.out.println("Наиденый результат: " + '\n' + SearchTools.findTour(list, TypeOfTransport.BUS));
//        System.out.println("Наиденый результат: " + '\n' + SearchTools.findTour(list, FoodOption.UAI));
    }
}
