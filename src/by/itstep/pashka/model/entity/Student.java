package by.itstep.pashka.model.entity;

public class Student extends Human {
    public static final int MAX_AGE = 100;
    public static final int MIN_AGE = 0;
    private double mark;

    public Student() {
        super();
    }

    public Student(String name, int age, double mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(int mark) {
        if (mark >= MIN_AGE && mark <= MAX_AGE) {
            this.mark = mark;
        }
    }

    public String getInfo() {
        return name + ": age =  " + age + ", mark = " + mark;
    }
}


