package by.yakovitski.mytasks.lesson6.vacation.enums;

public enum FoodOption {
    RO ("без питаная"),
    BB ("только завтрак"),
    HB("полупансион"),
    FB("полный пансион"),
    AI("всё включено"),
    UAI("ультра всё включено");

    private String FoodOption;

    FoodOption(String FoodOption) {
        this.FoodOption = FoodOption;
    }

    public String getFoodOption() {
        return FoodOption;
    }
}
