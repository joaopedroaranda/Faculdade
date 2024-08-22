package exe1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class exe {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        List<Person> pessoas = new ArrayList<>(); // cria uma lista

        Double media = 0.0;

        for(int i = 0; i < 10 ; i++){
            Person pessoa = new Person(); // aqui criamos um novo objeto pessoa

            System.out.print("Digite seu nome: ");
            pessoa.setName(input.nextLine());

            System.out.print("Digite sua idade: ");
            pessoa.setIdade(input.nextInt());

            System.out.print("Digite seu país: ");
            input.nextLine();
            pessoa.setPais(input.nextLine());

            System.out.println("Cadastrada com sucesso, bem vindo " + pessoa.getName());


            pessoas.add(pessoa);
        }

        System.out.println("\nInformações armazenadas:");
        // seria o for in lista em python para voce entender melhor
        for (Person pessoa : pessoas) { // aqui ele acessa a lista chamada pessoas e mostra um por um 
            System.out.println("Nome: " + pessoa.getName());
            System.out.println("Idade: " + pessoa.getIdade());
            System.out.println("País: " + pessoa.getPais());
            System.out.println();
            media = media + pessoa.getIdade();

        }
        media = media / 2;
        System.out.println("Media de idade " + media);
        // Fechando o scanner
        input.close();
        
    }
}
