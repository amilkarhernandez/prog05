import entities.Student;
import services.StudentServices;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        StudentServices studentServices = new StudentServices();
        Scanner scanner = new Scanner(System.in);

        int option;

        do {
            System.out.println("\n===== MENÚ ESTUDIANTES =====");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Listar todos los estudiantes");
            System.out.println("3. Eliminar estudiante por código");
            System.out.println("4. Calcular promedio de notas");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    createStudent(scanner, studentServices);
                    break;

                case 2:
                    listStudents(studentServices);
                    break;

                case 3:
                    deleteStudent(scanner, studentServices);
                    break;

                case 4:
                    calculateAverage(studentServices);
                    break;

                case 0:
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (option != 0);

        scanner.close();
    }

    static void createStudent(Scanner sc, StudentServices services){

        System.out.println("Ingrese el codigo: ");
        int code = sc.nextInt();

        System.out.println("Ingrese el Nombre: ");
        String name = sc.next();

        System.out.println("Ingrese la Nota: ");
        int note = sc.nextInt();

        Student s = new Student(code, name, note);

        services.register(s);
    }

    static void listStudents(StudentServices services){
        services.listAll();
    }

    static void deleteStudent(Scanner sc, StudentServices services){
        System.out.println("Ingrese el codigo del estudiante a Eliminar");
        int code = sc.nextInt();

        if(services.deleteStudent(code)){
            System.out.println("El estudiante se ha eliminado correctamente");
        }else{
            System.out.println("Ocurrio un error eliminando al estudiante");
        }

    }

    static void calculateAverage(StudentServices services){
        System.out.println("El promedio es: " + services.calculateAverage());
    }
}