package Aula3;

import java.util.ArrayList;

public class Compra {

    private Integer nfe;
    private ArrayList<Produto> listaDeProdutos = new ArrayList<>(); // Inicialização

    public Integer getNfe() {
        return nfe;
    }
    
    public void setNfe(Integer nfe) {
        this.nfe = nfe;
    }
    
    public ArrayList<Produto> getListaDeProdutos() {
        return listaDeProdutos;
    }
    
    public void setListaDeProdutos(ArrayList<Produto> listaDeProdutos) {
        this.listaDeProdutos = listaDeProdutos;
    }

    public Double calcularImposto() {
        Double totalDeImposto = 0.0;
        for (Produto prod : listaDeProdutos) {
            switch (prod.getTipo()) {
                case ELETRONICO:
                    totalDeImposto += prod.getValor() * 0.45;
                    break;
                case ALIMENTO:
                    totalDeImposto += prod.getValor() * 0.12;
                    break;
                case LIVRO:
                    totalDeImposto += prod.getValor() * 0.05;
                    break;
                case VESTUARIO:
                    totalDeImposto += prod.getValor() * 0.25;
                    break;
            }
        }
        return totalDeImposto;
    }

    public Double calculaValorCompra(){
        Double totalValores = 0.0;
        for (Produto prod : listaDeProdutos) {
            totalValores += prod.getValor();
        }
        return totalValores;
    }
}
