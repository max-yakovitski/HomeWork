package by.yakovitski.mytasks.lesson6.vacation;

import by.yakovitski.mytasks.lesson6.vacation.enums.FoodOption;
import by.yakovitski.mytasks.lesson6.vacation.enums.TypeOfTransport;
import by.yakovitski.mytasks.lesson6.vacation.types.Recreation;

import java.util.List;

public class SearchTools {
    public static Recreation findTour (List<Recreation> list, String name) {
        for (int i = 0; i < list.size(); i++) {
           if (list.get(i).getName().equals(name)) {
               return list.get(i);
           }
        }
        return null;
    }

    public static Recreation findTour (List<Recreation> list, int duration) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getDuration() == duration) {
                return list.get(i);
            }
        }
        return null;
    }

    public static Recreation findTour (List<Recreation> list, TypeOfTransport typeOfTransport) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getTypeOfTransport() == typeOfTransport) {
                return list.get(i);
            }
        }
        return null;
    }

    public static Recreation findTour (List<Recreation> list, FoodOption foodOption) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getFoodOption() == foodOption) {
                return list.get(i);
            }
        }
        return null;
    }
}
