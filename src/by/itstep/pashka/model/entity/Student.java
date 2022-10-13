package by.itstep.pashka.model.entity;

public class Student extends Human {
    public static final int MAX_AGE = 100;
    public static final int MIN_AGE = 0;

    private double mark;
    private String name;
    private MarkNote note;

    public Student() {
       super();
       note = new MarkNote();
       super.name = "Alex";
    }

    public Student(String name, int age, double mark) {
       super(name, age);
        this.mark = mark;
        note = new MarkNote(mark);
    }

    public double getMark() {
        return mark;
    }

    public void setMark(int mark) {
        if (mark >= MIN_AGE && mark <= MAX_AGE) {
            note.setMark(mark);
        }
    }

    public String getInfo() {
        return super.getInfo() + ", mark = " + mark;
    }
}


