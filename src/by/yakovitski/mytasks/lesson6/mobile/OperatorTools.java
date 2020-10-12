package by.yakovitski.mytasks.lesson6.mobile;

import by.yakovitski.mytasks.lesson6.mobile.tariffs.MobileTariff;

import java.util.List;

public interface OperatorTools {

    void addAbonent (MobileTariff mobileTariff);
    void removeAbonent (MobileTariff mobileTariff);
    int getAllAbonentQuantity (List<MobileTariff> list);
    void sortTariffPrice (List<MobileTariff> list);
    String  findTariff (List<MobileTariff> list, String name);

}
