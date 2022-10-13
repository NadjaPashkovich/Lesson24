package by.itstep.pashka.model.entity;

public class Student extends Human {
    private int mark;

    public Student() {

    }

    public Student(String name, int age, double mark) {
        setName("");
        setAge(age);
        this.mark = mark;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}


