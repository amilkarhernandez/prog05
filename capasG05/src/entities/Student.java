package entities;

public class Student {
    private int code;
    private String name;
    private int note;

    public Student(int code, String name, int note) {
        this.code = code;
        this.name = name;
        this.note = note;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Student{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", note=" + note +
                '}';
    }
}
