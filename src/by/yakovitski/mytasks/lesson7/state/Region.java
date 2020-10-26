package by.yakovitski.mytasks.lesson7.state;
//район
public class Region extends City {
    private String cityName;

    public Region (String regionName, int population, double square, City city) {
        super(regionName, population, square);
        this.cityName = city.getName();
    }

    public String getCity() {
        return cityName;
    }

    public void setCity(String cityName) {
        this.cityName = cityName;
    }

}
