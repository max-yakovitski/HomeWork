package by.yakovitski.mytasks.lesson6.poem;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Poem {
    private List<String> poem;

    public Poem(List<String> poem) {
        this.poem = poem;
    }

    public List<String> getPoem() {
        return poem;
    }

    public void setPoem(List<String> poem) {
        this.poem = poem;
    }

    public void addText(String string) {
        poem.add(string);
    }

    public  void  sortLine () {
        Collections.sort(this.getPoem(), new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
    }

    public void print(){
        for (String str: poem) {
            System.out.println(str);
        }
    }
}
