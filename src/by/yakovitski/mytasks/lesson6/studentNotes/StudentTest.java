package by.yakovitski.mytasks.lesson6.studentNotes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StudentTest {
    public static void main(String[] args) {
        List<Student> list = new ArrayList(5);
        Random random = new Random();
        list.add(new Student(random.nextInt(10)));
        list.add(new Student(random.nextInt(10)));
        list.add(new Student(random.nextInt(10)));
        list.add(new Student(random.nextInt(10)));
        list.add(new Student(random.nextInt(10)));

        Student.printList(list);
        System.out.println("Самая высокая: " + Student.searchTheHighestNote(list));
    }
}
