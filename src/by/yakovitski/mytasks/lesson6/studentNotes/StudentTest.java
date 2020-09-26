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

        printList(list);
        searchTheHighestNote(list);
    }

    public static void printList(List<Student>list){
        for (Student student : list) {
            System.out.println(student);
        }
    }

    public static void searchTheHighestNote(List<Student>list) {
        int maxNote = 0;
        for (int i = 0; i < list.size(); i++) {
            if (maxNote < list.get(i).getNote()){
                maxNote = list.get(i).getNote();
            }
        }
        System.out.println("Самая высокая оценка: " + maxNote);
    }
}
