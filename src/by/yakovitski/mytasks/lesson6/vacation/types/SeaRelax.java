package by.yakovitski.mytasks.lesson6.vacation.types;

import by.yakovitski.mytasks.lesson6.vacation.enums.FoodOption;
import by.yakovitski.mytasks.lesson6.vacation.enums.TypeOfTransport;

import java.util.Arrays;

public class SeaRelax extends Recreation {

    public SeaRelax(String name, int duration, TypeOfTransport typeOfTransport, FoodOption foodOption) {
        super(name, duration, typeOfTransport, foodOption);
    }

    @Override
    public void selectAdditionalOptions(String countryName) {
        if (countryName == null) {
            System.out.println("Введите тип лечения");
        }
        else {
        String[] countries = new String[]{"Turkey", "Egypt", "Spain", "UAE", "Greece","Thailand"};
        int count = 0;
        for (int i = 0; i < countries.length; i++) {
            if (countryName.equals(countries[i])) {
                count++;
            }
        }
        if (count == 1) {
            System.out.println("Мы рады подобрать вам путевку по этому направлению - "  + countryName);
        }
        else {
            System.out.println("Пожалйста, выбкрите другую страну из списка: " + Arrays.toString(countries));
            }
        }
    }
}
