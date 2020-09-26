package by.yakovitski.mytasks.lesson6.dictionary;
import java.util.*;

public class Text {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Text(String text) {
        this.text = text;
    }

    public void makeFrequencyDictionary() {
        String[] strings = this.getText().toLowerCase().split("[,;!?]\\s");

        TreeMap<String, Integer> wordList = new TreeMap();
        for (int i = 0; i < strings.length; i++) {
            wordList.compute(strings[i], (String, Integer)
                    -> Integer == null ? 1 : Integer + 1);
        }
        System.out.println(wordList);
    }
}