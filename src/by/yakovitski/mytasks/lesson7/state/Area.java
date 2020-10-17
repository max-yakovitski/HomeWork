package by.yakovitski.mytasks.lesson7.state;
//область
public class Area extends Region {
    private boolean isCapital;

    public Area(String areaName, int population, double square, City city, boolean isCapital) {
        super(areaName, population, square, city);
        this.isCapital = isCapital;
    }

    public boolean isCapital() {
        return isCapital;
    }

    public void setCapital(boolean capital) {
        isCapital = capital;
    }
}
