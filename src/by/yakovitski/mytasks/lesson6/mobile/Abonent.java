package by.yakovitski.mytasks.lesson6.mobile;

//для возможного использования

import java.util.Objects;

public class Abonent {
    private  int id;
    private String name;
    private String surname;
    private int age;
    private Sex sex;

    public Abonent(int id, String name, String surname, int age, Sex sex) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Abonent)) return false;
        Abonent abonent = (Abonent) o;
        return id == abonent.id &&
                age == abonent.age &&
                Objects.equals(name, abonent.name) &&
                Objects.equals(surname, abonent.surname) &&
                sex == abonent.sex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, age, sex);
    }
}
