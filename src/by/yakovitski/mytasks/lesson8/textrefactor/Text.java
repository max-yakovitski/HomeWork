package by.yakovitski.mytasks.lesson8.textrefactor;

import java.io.*;

public class Text {
    public static void main(String[] args) throws IOException {
    File file = new File("/Users/ma_yak/HomeWork/src/by/yakovitski/mytasks/lesson8/textrefactor/TestText");
    rewriteFile(file);
    }

    public static  String readText(File file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        StringBuffer buffer = new StringBuffer();
        while (reader.ready()) {
            buffer.append(reader.readLine() + "\n");
        }
        reader.close();
        return buffer.toString();
    }

    public static String correctText(String string) {
        String [] text = string.split("\\s+");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < text.length; i++) {
            builder.append(text[i] + " ");
        }
        return builder.toString();
    }

    public static void rewriteFile (File file) throws IOException {
        String text = correctText(readText(file));
        file.delete();
        FileWriter fileWriter = new FileWriter("/Users/ma_yak/HomeWork/src/by/yakovitski/mytasks/lesson8/textrefactor/" + "TextForWork");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(text);
        bufferedWriter.close();
    }
}
