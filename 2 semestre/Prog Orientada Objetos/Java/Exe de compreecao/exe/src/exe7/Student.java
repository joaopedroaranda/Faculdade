package exe7;
import java.util.ArrayList;
import java.util.List;

public class Student {

    private int student_id;
    private String student_name;
    private List<Double> notas = new ArrayList<>();

    // Construtor
    public Student(int student_id, String student_name) {
        this.student_id = student_id;
        this.student_name = student_name;
    }

    // Getters e Setters
    public int getStudentId() {
        return student_id;
    }

    public void setStudentId(int student_id) {
        this.student_id = student_id;
    }

    public String getStudentName() {
        return student_name;
    }

    public void setStudentName(String student_name) {
        this.student_name = student_name;
    }

    // Método para adicionar uma nota
    public void addGrade(double grade) {
        if (grade >= 0.0 && grade <= 10.0) {
            notas.add(grade);
        } else {
            System.out.println("Nota inválida! A nota deve estar entre 0.0 e 10.0.");
        }
    }

    // Método para obter as notas
    public List<Double> getGrades() {
        return notas;
    }
}
