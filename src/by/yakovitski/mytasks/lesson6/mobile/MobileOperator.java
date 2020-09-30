package by.yakovitski.mytasks.lesson6.mobile;

import by.yakovitski.mytasks.lesson6.mobile.tariffs.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MobileOperator implements OperatorTools {
    public static void main(String[] args) {
        List<MobileTariff> list = new ArrayList<>();

        WithoutLimit wl = new WithoutLimit("Безлимит", 19.5, 567_345);
        ForKids fk = new ForKids("Детский", 7.3, 57_350);
        Special sp = new Special("Специальный", 11.45, 20_981);

        list.add(wl);
        list.add(fk);
        list.add(sp);

//        new MobileOperator().sortTariffPrice(list);
//        for (MobileTariff tariff: list
//             ) {
//            System.out.println(tariff);
//        }
        new MobileOperator().findTariff(list,19.5);
    }

    @Override
    public void addAbonent(MobileTariff mobileTariff) {
        mobileTariff.setUsersQuantity(mobileTariff.getUsersQuantity() + 1);
    }

    @Override
    public void removeAbonent(MobileTariff mobileTariff) {
        mobileTariff.setUsersQuantity(mobileTariff.getUsersQuantity() - 1);
    }

    @Override
    public int getAllAbonentQuantity(List<MobileTariff> list) {
        int total = 0;
        for (int i = 0; i < list.size(); i++) {
            total+=list.get(i).getUsersQuantity();
        }
        return total;
    }

    @Override
    public void sortTariffPrice(List<MobileTariff> list) {
       Collections.sort(list, new Comparator<MobileTariff>() {
           @Override
           public int compare(MobileTariff o1, MobileTariff o2) {
               return (int) (o1.getTariffPrice() - o2.getTariffPrice());
           }
       });
    }

    @Override
    public void findTariff(List<MobileTariff> list, String name) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getTariffName().equals(name)){
                count++;
            }
        }
        if (count > 0) {
                System.out.println("Тариф " + name + " найден");
        }
        else {
                System.out.println("Тариф не найден");
        }
    }

    public void findTariff(List<MobileTariff> list, double price) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getTariffPrice() == price){
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Тариф " + price + " найден");
        }
        else {
            System.out.println("Тариф не найден");
        }
    }
}
