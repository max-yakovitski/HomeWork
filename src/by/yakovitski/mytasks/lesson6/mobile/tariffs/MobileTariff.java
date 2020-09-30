package by.yakovitski.mytasks.lesson6.mobile.tariffs;

public abstract class MobileTariff {

    private String tariffName;
    private  double tariffPrice;
    private int usersQuantity;

    public MobileTariff(String tariffName, double tariffPrice, int usersQuantity) {
        this.tariffName = tariffName;
        this.tariffPrice = tariffPrice;
        this.usersQuantity = usersQuantity;
    }

    public String getTariffName() {
        return tariffName;
    }

    public void setTariffName(String tariffName) {
        this.tariffName = tariffName;
    }

    public double getTariffPrice() {
        return tariffPrice;
    }

    public void setTariffPrice(double tariffPrice) {
        this.tariffPrice = tariffPrice;
    }

    public int getUsersQuantity() {
        return usersQuantity;
    }

    public void setUsersQuantity(int usersQuantity) {
        this.usersQuantity = usersQuantity;
    }

    @Override
    public String toString() {
        return "Тарифный план - " + tariffName +
                ", стоимость : " + tariffPrice +
                ", колличество абонентов: " + usersQuantity;
    }

    public void printInfo () {
        System.out.println(toString());
    }

}