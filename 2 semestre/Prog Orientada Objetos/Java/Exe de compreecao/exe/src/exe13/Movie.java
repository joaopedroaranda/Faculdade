package exe13;

public class Movie {
    private String titulo;
    private String diretor;
    private int duracao; // duração em minutos

    public Movie(String titulo, String diretor, int duracao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getMovieDetails() {
        return String.format("Título: %s\nDiretor: %s\nDuração: %d minutos", titulo, diretor, duracao);
    }
}
