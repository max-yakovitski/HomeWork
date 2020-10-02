package by.yakovitski.mytasks.lesson6.vacation;

import by.yakovitski.mytasks.lesson6.vacation.enums.*;
import by.yakovitski.mytasks.lesson6.vacation.types.*;

import java.util.ArrayList;
import java.util.List;

public class VacationTest {
    public static void main(String[] args) {
        SeaRelax seaRelax = new SeaRelax("морской", 10, TypeOfTransport.PLANE, FoodOption.AI);
        Excursion excursion = new Excursion("экскурсия", 3, TypeOfTransport.BUS, FoodOption.RO);
        Therapy therapy = new Therapy("лечение", 7, TypeOfTransport.TRAIN, FoodOption.HB);
        Shoping shoping = new Shoping("шопинг", 2, TypeOfTransport.BUS, FoodOption.RO);
        Cruise cruise = new Cruise("морской круиз", 14, TypeOfTransport.LINER, FoodOption.UAI);

        List<Recreation> list = new ArrayList<>();
        list.add(seaRelax);
        list.add(excursion);
        list.add(therapy);
        list.add(shoping);
        list.add(cruise);

//        System.out.println("Наиденый результат: " + '\n' + SearchTools.findTour(list, "шопинг"));
//        System.out.println("Наиденый результат: " + '\n' + SearchTools.findTour(list, 7));
//        System.out.println("Наиденый результат: " + '\n' + SearchTools.findTour(list, TypeOfTransport.BUS));
        System.out.println("Наиденый результат: " + '\n' + SearchTools.findTour(list, FoodOption.UAI));
    }
}
