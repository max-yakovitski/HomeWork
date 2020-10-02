package by.yakovitski.mytasks.lesson6.vacation.types;

import by.yakovitski.mytasks.lesson6.vacation.enums.FoodOption;
import by.yakovitski.mytasks.lesson6.vacation.enums.TypeOfTransport;

public class Therapy extends Recreation{

    public Therapy(String name, int duration, TypeOfTransport typeOfTransport, FoodOption foodOption) {
        super(name, duration, typeOfTransport, foodOption);
    }
}
