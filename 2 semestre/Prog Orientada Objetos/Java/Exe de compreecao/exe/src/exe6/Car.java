package exe6;

public class Car {
    
    private String nomeDaEmpresa;
    private String nomeDoModelo;
    private int ano;
    private Double quilometragem;

    public String getNomeDaEmpresa() {
        return nomeDaEmpresa;
    }

    public void setNomeDaEmpresa(String nomeDaEmpresa) {
        this.nomeDaEmpresa = nomeDaEmpresa;
    }

    // Getter e Setter para nome_do_modelo
    public String getNomeDoModelo() {
        return nomeDoModelo;
    }

    public void setnomeDoModelo(String nomeDoModelo) {
        this.nomeDoModelo = nomeDoModelo;
    }

    // Getter e Setter para ano
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // Getter para quilometragem
    public double getQuilometragem() {
        return quilometragem;
    }

    // Setter para quilometragem (opcional, se necessário)
    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }
}
