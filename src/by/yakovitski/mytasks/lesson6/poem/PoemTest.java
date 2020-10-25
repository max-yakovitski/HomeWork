package by.yakovitski.mytasks.lesson6.poem;

import java.util.ArrayList;

public class PoemTest {
    public static void main(String[] args) {
        Poem poem = new Poem();
        poem.addText("А хто там ідзе, а хто там ідзе");
        poem.addText("У агромністай такой грамадзе?");
        poem.addText("— Беларусы.");
        poem.addText("А што яны нясуць на худых плячах,");
        poem.addText("На руках ў крыві, на нагах у лапцях?");
        poem.addText("— Сваю крыўду.");
        poem.print();
        System.out.println();
        poem.sortLine();
        poem.print();
    }
}
