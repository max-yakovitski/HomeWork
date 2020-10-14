package by.yakovitski.mytasks.lesson6.vacation;

import by.yakovitski.mytasks.lesson6.vacation.enums.FoodOption;
import by.yakovitski.mytasks.lesson6.vacation.enums.TypeOfTransport;
import by.yakovitski.mytasks.lesson6.vacation.types.Recreation;

import java.util.List;

public class SearchTools {
    public static Recreation findTour (List<Recreation> list, String name) {
        Recreation recreation = null;
        for (int i = 0; i < list.size(); i++) {
           if (list.get(i).getName().equals(name)) {
               recreation = list.get(i);
           }
        }
        return recreation;
    }

    public static Recreation findTour (List<Recreation> list, int duration) {
        Recreation recreation = null;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getDuration() == duration) {
                recreation = list.get(i);
            }
        }
        return recreation;
    }

    public static Recreation findTour (List<Recreation> list, TypeOfTransport typeOfTransport) {
        Recreation recreation = null;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getTypeOfTransport() == typeOfTransport) {
                recreation = list.get(i);
            }
        }
        return recreation;
    }

    public static Recreation findTour (List<Recreation> list, FoodOption foodOption) {
        Recreation recreation = null;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getFoodOption() == foodOption) {
                recreation = list.get(i);
            }
        }
        return recreation;
    }
}
