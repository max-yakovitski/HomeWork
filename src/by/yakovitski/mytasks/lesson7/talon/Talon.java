package by.yakovitski.mytasks.lesson7.talon;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

public class Talon {
    static int id;
    private Date date;

    public Talon() {
        id++;
        date = new Date(ThreadLocalRandom.current().nextLong(1604000000000l, 1606000000000l));
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy 'время приёма ' hh:mm");
        return "Талон № " + id +
                ", дата: " + dateFormat.format(date);
    }
}
