package by.yakovitski.mytasks.lesson6.mobile;

import by.yakovitski.mytasks.lesson6.mobile.tariffs.MobileTariff;

import java.util.List;
import java.util.Scanner;

public class Input {

    public static void start (List<MobileTariff> list) {
        System.out.println("Введите название тарифа или желаемую стоимость.");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        try {
            double price = Double.parseDouble(input);
            System.out.println("вы ввели стоимость тарифа: "  +  price);
            new MobileOperator().findTariff(list, price);

        } catch (NumberFormatException e) {
            System.out.println("вы ввели название тарифа: "  +  input);
            new MobileOperator().findTariff(list, input);
        }
    }
}