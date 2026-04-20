package repositories;

import entities.Student;

import java.util.ArrayList;

public class StudentRepository {
    private ArrayList<Student> list = new ArrayList<>();

    public void create(Student s){
        list.add(s);
    }

    public ArrayList<Student> getAll(){
        return list;
    }

    public Student getByCode(int code){
        for(Student s: list){
            if(s.getCode() == code){
                return s;
            }
        }
        return null;
    }

    public boolean deleteByCode(int code){
        return list.removeIf(s -> s.getCode() == code);
    }
}
