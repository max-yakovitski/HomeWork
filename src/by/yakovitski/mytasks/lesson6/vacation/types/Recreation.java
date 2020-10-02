package by.yakovitski.mytasks.lesson6.vacation.types;

import by.yakovitski.mytasks.lesson6.vacation.enums.FoodOption;
import by.yakovitski.mytasks.lesson6.vacation.enums.TypeOfTransport;

public abstract class Recreation {
    private String name;
    private int duration;
    private TypeOfTransport typeOfTransport;


    private FoodOption foodOption;

    public Recreation(String name, int duration, TypeOfTransport typeOfTransport, FoodOption foodOption) {
        if (name == null) {
            System.out.println("Введите имя тура");
        }
        else {
        this.name = name;
        }
        if (duration > 0 && duration < 15) {
            this.duration = duration;
        }
        else {
            System.out.println("Некорректный срок отдыха, ваш тур не может длиться меньше 1 и больше 14 дней");
        }
        this.typeOfTransport = typeOfTransport;
        this.foodOption = foodOption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            System.out.println("Введите имя тура");
        }
        else {
            this.name = name;
        }
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        if (duration > 0 && duration < 15) {
            this.duration = duration;
        }
        else {
            System.out.println("Вы ввели некорректный срок отдыха, ваш тур не может длиться меньше 1 и больше 14 дней");
        }
    }

    public TypeOfTransport getTypeOfTransport() {
        return typeOfTransport;
    }

    public void setTypeOfTransport(TypeOfTransport typeOfTransport) {
        this.typeOfTransport = typeOfTransport;
    }

    public FoodOption getFoodOption() {
        return foodOption;
    }

    public void setFoodOption(FoodOption foodOption) {
        this.foodOption = foodOption;
    }

    @Override
    public String toString() {
        return "тип отдыха = " + name +
                ", длительность = " + duration + " дней " +
                ", тип транспорта = " + typeOfTransport.getTypeOfTransport() +
                ", питание = " + foodOption.getFoodOption();
    }
}
