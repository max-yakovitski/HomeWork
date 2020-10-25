package by.yakovitski.mytasks.lesson6.vacation.types;

import by.yakovitski.mytasks.lesson6.vacation.enums.FoodOption;
import by.yakovitski.mytasks.lesson6.vacation.enums.TypeOfTransport;

import java.util.Arrays;

public class Shoping extends Recreation{

    public Shoping(String name, int duration, TypeOfTransport typeOfTransport, FoodOption foodOption) {
        super(name, duration, typeOfTransport, foodOption);
    }

    @Override
    public void selectAdditionalOptions(String type) {
        if (type == null) {
            System.out.println("Введите название торгового центра");
        }
        else {
            String[] boutiques = new String[]{"Молл", "Торговый центр", "Базар"};
            int count = 0;
            for (int i = 0; i < boutiques.length; i++) {
                if (type.equals(boutiques[i])) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println("Мы рады отвезти вас в/на " + type);
            }
            else {
                System.out.println("Пожалйста, выбкрите другую тип торогового места: " + Arrays.toString(boutiques));
            }
        }
    }
}
