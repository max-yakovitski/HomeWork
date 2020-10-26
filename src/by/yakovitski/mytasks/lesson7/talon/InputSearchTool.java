package by.yakovitski.mytasks.lesson7.talon;

import java.util.List;
import java.util.Scanner;

public class InputSearchTool {

    public static String getInputInfo () {
        return new Scanner(System.in).nextLine();
    }

    public static Hospital findHospital (List<Hospital> list) {
        Hospital hospital  = null;
        String inputHospital = getInputInfo();
        for (int i = 0; i < list.size(); i++) {
            if (inputHospital.equals(list.get(i).getName())) {
                hospital = list.get(i);
            }
        }
        return hospital;
    }

    public static Doctor findDoctor (List<Doctor> list) {
        Doctor doctor = null;
        String inputDoctor = getInputInfo();
        for (int i = 0; i < list.size(); i++) {
            if (inputDoctor.equals(list.get(i).getOccupation())) {
                doctor = list.get(i);
            }
        }
        return doctor;
    }

    public static void findTalon(List<Hospital> list) {
        System.out.println("Введите наименование больницы из списка: " + list);
        Hospital hospital  = findHospital(list);
        if (hospital != null) {
            System.out.println("Введите назавние требуемого специалиста из списка: " + hospital.getDoctors());
            Doctor doctor = findDoctor(hospital.getDoctors());
            if (doctor != null) {
                System.out.println(new Talon() + "\n" + hospital);
                System.out.println(doctor.getName() + " : " + doctor);
            }
            else {
                System.out.println("Доктор не найден, повторите попытку");
            }
        }
        else {
            System.out.println("Больница не найдена, повторите попытку");
        }
    }
}
