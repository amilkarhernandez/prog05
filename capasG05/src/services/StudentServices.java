package services;

import entities.Student;
import repositories.StudentRepository;

import java.util.ArrayList;

public class StudentServices {

    private StudentRepository studentRepository = new StudentRepository();

    public void register(Student s){

        // Validations
        if(s.getNote() < 0 || s.getNote() > 5){
            System.out.println("La nota debe estar entre 0 y 5");
            return;
        }

        if(studentRepository.getByCode(s.getCode()) != null){
            System.out.println("El estudiante se encuentra registrado");
            return;
        }

        studentRepository.create(s);
        System.out.println("El estudiante se ha creado correctamente");
    }

    public void listAll(){
        if(studentRepository.getAll().isEmpty()){
            System.out.println("No existe Ningun Estudiante registrado");
        }
        studentRepository.getAllStudents();
    }

    public boolean deleteStudent(int code){
        return studentRepository.deleteByCode(code);
    }

    public double calculateAverage(){
        ArrayList<Student> list = studentRepository.getAll();

        if(list.isEmpty()) return 0;
        double average = 0;
        for(Student s : list){
            average += s.getNote();
        }
        return average/list.size();
    }

}
