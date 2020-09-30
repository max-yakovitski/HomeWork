package by.yakovitski.mytasks.lesson6.mobile;

import by.yakovitski.mytasks.lesson6.mobile.tariffs.MobileTariff;

import java.util.List;

public interface OperatorTools {

    public void addAbonent (MobileTariff mobileTariff);
    public void removeAbonent (MobileTariff mobileTariff);
    public int getAllAbonentQuantity (List<MobileTariff> list);
    public void sortTariffPrice (List<MobileTariff> list);
    public void  findTariff (List<MobileTariff> list, String name);

}
