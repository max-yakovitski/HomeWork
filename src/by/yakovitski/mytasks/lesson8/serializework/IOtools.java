package by.yakovitski.mytasks.lesson8.serializework;

import java.io.*;
import java.util.ArrayList;

public class IOtools {

    public static void writeInTheFile(ArrayList<Person> list, File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeInt(list.size());
        for (Person person: list) {
        objectOutputStream.writeObject(person);
        }
        objectOutputStream.close();
    }

    public static ArrayList<Person> readTheFile(File file) throws IOException, ClassNotFoundException {
        ArrayList<Person> list = new ArrayList<>();
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        int peopleCount = objectInputStream.readInt();
        for (int i = 0; i < peopleCount; i++) {
            list.add((Person) objectInputStream.readObject());
        }
        objectInputStream.close();
        return list;
    }
}
