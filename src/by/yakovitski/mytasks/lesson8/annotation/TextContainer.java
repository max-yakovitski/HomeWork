package by.yakovitski.mytasks.lesson8.annotation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

@SaveTo
public class TextContainer {
    private String text;

    public TextContainer(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Saver
    public void saveTextInFile (String path) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(getText());
        bufferedWriter.close();
        fileWriter.close();
    }
}
