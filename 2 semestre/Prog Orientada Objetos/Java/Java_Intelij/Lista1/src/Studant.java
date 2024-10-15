import java.util.ArrayList;
import java.util.List;

public class Studant {
    private int studante_id;
    private String studant_name;
    private List<Double> notas;

    public Studant(){

    }

    public Studant(int studante_id,String studant_name){
        this.studant_name = studant_name;
        this.notas = new ArrayList<>();
    }

    public int getStudante_id() {
        return studante_id;
    }

    public void setStudante_id(int studante_id) {
        this.studante_id = studante_id;
    }

    public String getStudant_name() {
        return studant_name;
    }

    public void setStudant_name(String studant_name) {
        this.studant_name = studant_name;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void adcionarNota(double nota){
        notas.add(nota);
    }

    public static void main(String[] args) {
        Studant joao = new Studant(1,"joao");
        joao.adcionarNota(2);
        joao.adcionarNota(5);
        joao.adcionarNota(10);

        System.out.println("Notas: " + joao.notas);
    }
}
