package exe6;



public class App {

    public static void main(String[] args) throws Exception {

        Car carro = new Car();

        // Definindo valores para os atributos
        carro.setNomeDaEmpresa("Toyota");
        carro.setnomeDoModelo("Corolla");
        carro.setAno(2020);
        carro.setQuilometragem(15000.5);

        // Acessando e exibindo os valores dos atributos
        System.out.println("Nome da Empresa: " + carro.getNomeDaEmpresa());
        System.out.println("Nome do Modelo: " + carro.getNomeDoModelo());
        System.out.println("Ano: " + carro.getAno());
        System.out.println("Quilometragem: " + carro.getQuilometragem() + " km");
    }

}