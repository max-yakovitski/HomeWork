package by.yakovitski.mytasks.lesson6.vacation.types;

import by.yakovitski.mytasks.lesson6.vacation.enums.FoodOption;
import by.yakovitski.mytasks.lesson6.vacation.enums.TypeOfTransport;

import java.util.Arrays;

public class Therapy extends Recreation{

    public Therapy(String name, int duration, TypeOfTransport typeOfTransport, FoodOption foodOption) {
        super(name, duration, typeOfTransport, foodOption);
    }

    @Override
    public void selectAdditionalOptions(String type) {
        if (type == null) {
            System.out.println("Введите тип лечения");
        }
        else {
        String[] services = new String[]{"Кварцевание", "Грязевые ванны", " Массаж"};
        int count = 0;
        for (int i = 0; i < services.length; i++) {
            if (type.equals(services[i])) {
                count++;
            }
        }
        if (count == 1) {
            System.out.println("Мы рады подобрать вам услугу " + type);
        }
        else {
            System.out.println("Пожалйста, выбкрите другую процедуру из списка: " + Arrays.toString(services));
            }
        }
    }
}
