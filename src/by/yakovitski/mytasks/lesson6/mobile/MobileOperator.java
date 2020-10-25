package by.yakovitski.mytasks.lesson6.mobile;

import by.yakovitski.mytasks.lesson6.mobile.tariffs.*;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MobileOperator implements OperatorTools {

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
    public  String findTariff(List<MobileTariff> list, String name) {
        int count = 0;
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getTariffName().equals(name)){
                index = i;
                count++;
            }
        }
        if (count > 0) {
            System.out.println(list.get(index));
                return "Тариф " + name + " найден";
        }
        else {
            System.out.println("Тариф с таким нащванием не найден, попробуйте снова");
                return "Тариф не найден";
        }
    }

    public double findTariff(List<MobileTariff> list, double price) {
        int count = 0;
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getTariffPrice() == price){
                index = i;
                count++;
            }
        }
        if (count > 0) {
            System.out.println(list.get(index));
            return price;
        }
        else {
            System.out.println("Тариф с такой стоимостью не найден, попробуйте снова");
            return 0;
        }
    }
}
