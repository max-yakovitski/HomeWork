package by.yakovitski.mytasks.lesson8.datesort;

import java.io.*;

public class DateText {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/ma_yak/HomeWork/src/by/yakovitski/mytasks/lesson8/datesort/People");
        makeDir(file);
    }
    public static void makeDir(File file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;

        while((line = reader.readLine()) != null) {
            String [] text = line.split(" - ");
            File fileDir = new File("/Users/ma_yak/HomeWork/src/by/yakovitski/mytasks/lesson8/datesort", text[0]);
            if (!fileDir.exists()){
                File fileInfo = new File("/Users/ma_yak/HomeWork/src/by/yakovitski/mytasks/lesson8/datesort/" + text[0], "info.txt");
                fileDir.mkdir();
                BufferedWriter writer = new BufferedWriter(new FileWriter(fileInfo));
                writer.write(text[1]);
                writer.close();
            }
            else {
                FileWriter fileWriter = new FileWriter("/Users/ma_yak/HomeWork/src/by/yakovitski/mytasks/lesson8/datesort/" + text[0] + "/info.txt", true);
                BufferedWriter writer1 = new BufferedWriter(fileWriter);
                writer1.write("\n" + text[1]);
                writer1.close();
            }
        }
        reader.close();
    }
}
