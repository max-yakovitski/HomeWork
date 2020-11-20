package by.yakovitski.mytasks.lesson8.serializework;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class SerializeTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("/Users/ma_yak/HomeWork/src/by/yakovitski/mytasks/lesson8/serializework/people.bin");
        Person person1 = new Person(34, "Max");
        Person person2 = new Person(455, "Darya");
        Person person3 = new Person(5, "Sofia");
        ArrayList<Person> list = new ArrayList<>();
        list.add(person1);
        list.add(person2);
        list.add(person3);
        IOtools.writeInTheFile(list, file);
        System.out.println(IOtools.readTheFile(file));
    }
}
