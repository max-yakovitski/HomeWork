package by.yakovitski.mytasks.lesson6.vacation.types;

import by.yakovitski.mytasks.lesson6.vacation.enums.FoodOption;
import by.yakovitski.mytasks.lesson6.vacation.enums.TypeOfTransport;

public class Cruise extends Recreation{

    public Cruise(String name, int duration, TypeOfTransport typeOfTransport, FoodOption foodOption) {
        super(name, duration, typeOfTransport, foodOption);
    }
}
