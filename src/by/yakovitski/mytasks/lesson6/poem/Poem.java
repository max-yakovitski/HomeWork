package by.yakovitski.mytasks.lesson6.poem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Poem {
    private List<String> stringlines;

    public Poem() {
        stringlines = new ArrayList<>();
    }

    public List<String> getLines() {
        return stringlines;
    }

    public void setLines(List<String> lines) {
        this.stringlines = lines;
    }

    public void addText(String string) {
        stringlines.add(string);
    }

    public  void  sortLine () {
        Collections.sort(this.getLines(), new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
    }

    public void print(){
        for (String str: stringlines) {
            System.out.println(str);
        }
    }
}
