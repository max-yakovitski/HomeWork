package by.yakovitski.mytasks.lesson7.talon;

import java.util.ArrayList;
import java.util.List;

public class MedicineSystemTest {
    public static void main(String[] args) {

        Hospital hospital1 = new Hospital("Инфекционная больница", 9);
        Doctor infectiologist = new Doctor("Иванов Михаил", "Врач-инфекционист", 1);
        Doctor bacteriologist = new Doctor("Петров Сергей", "Врач-бактериолог", 2);
        hospital1.addDoctor(infectiologist);
        hospital1.addDoctor(bacteriologist);

        Hospital hospital2 = new Hospital("Психиатрическая больница", 10);
        Doctor psychotherapist = new Doctor("Сидорова Анна", "Врач-психотерапевт", 23);
        Doctor psychiatrist = new Doctor("Климова Светлана", "Врач-психиатр", 25);
        hospital2.addDoctor(psychiatrist);
        hospital2.addDoctor(psychotherapist);

        List<Hospital> hospitalList = new ArrayList<>();
        hospitalList.add(hospital1);
        hospitalList.add(hospital2);

        InputSearchTool.findTalon(hospitalList);
    }
}
