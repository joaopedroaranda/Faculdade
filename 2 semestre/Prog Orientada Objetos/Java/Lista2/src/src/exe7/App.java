package exe7;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) throws Exception {

        Student student = new Student(1, "joao");

        student.addGrade(8.4);
        student.addGrade(9.4);

        System.out.println("Notas de " + student.getStudentName() + ": " + student.getGrades());
    }
}