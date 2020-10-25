package by.yakovitski.mytasks.lesson6.poem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Poem {
    private List<String> lines;

    public Poem() {
        lines = new ArrayList<>();
    }

    public List<String> getLines() {
        return lines;
    }

    public void setLines(List<String> lines) {
        this.lines = lines;
    }

    public void addText(String string) {
        lines.add(string);
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
        for (String str: lines) {
            System.out.println(str);
        }
    }
}
