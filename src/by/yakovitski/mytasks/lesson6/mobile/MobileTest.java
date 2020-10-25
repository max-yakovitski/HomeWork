package by.yakovitski.mytasks.lesson6.mobile;

import by.yakovitski.mytasks.lesson6.mobile.tariffs.ForKids;
import by.yakovitski.mytasks.lesson6.mobile.tariffs.MobileTariff;
import by.yakovitski.mytasks.lesson6.mobile.tariffs.Special;
import by.yakovitski.mytasks.lesson6.mobile.tariffs.WithoutLimit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MobileTest {
    public static void main(String[] args) {
        List<MobileTariff> list = new ArrayList<>();

        MobileTariff wl = new WithoutLimit("Безлимит", 19.5, 567_345);
        MobileTariff fk = new ForKids("Детский", 7.3, 57_350);
        MobileTariff sp = new Special("Специальный", 11.45, 20_981);

        list.add(wl);
        list.add(fk);
        list.add(sp);

        Input.start(list);
    }
}