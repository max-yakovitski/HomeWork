package by.yakovitski.mytasks.lesson6.vacation.types;

import by.yakovitski.mytasks.lesson6.vacation.enums.FoodOption;
import by.yakovitski.mytasks.lesson6.vacation.enums.TypeOfTransport;

import java.util.Arrays;

public class Cruise extends Recreation{

    public Cruise(String name, int duration, TypeOfTransport typeOfTransport, FoodOption foodOption) {
        super(name, duration, typeOfTransport, foodOption);
    }

    @Override
    public void selectAdditionalOptions(String type) {
        if (type == null) {
            System.out.println("Введите тип лечения");
        }
        else {
        String[] liners = new String[]{"Болшой океанский лайнер", "Средний морской лайнер", " Малый речной лайнер"};
            int count = 0;
            for (int i = 0; i < liners.length; i++) {
                if (type.equals(liners[i])) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println("Мы рады подобрать вам предложить путешествие на " + type);
            }
            else {
                System.out.println("Пожалйста, выберите другой тип лайнера из списка: " + Arrays.toString(liners));
            }
        }
    }
}
