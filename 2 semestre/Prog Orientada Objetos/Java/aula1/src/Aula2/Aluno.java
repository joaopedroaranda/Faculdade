package src.Aula2;

public class Aluno {
    private String nome;
    private String ra;

    
    // private Integer idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", RA: " + ra;
    }

}
