package Aula2;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos registros serão inseridos: ");

        Integer qtde = input.nextInt();

        ArrayList<Aluno> alunos = new ArrayList<>();

        for(Integer i=0; i < qtde; i++){
            Aluno alunoTmp = new Aluno();
            System.out.print("Entre com o nome do Aluno: ");
            alunoTmp.setNome(input.next());
            System.out.print("Entre com Ra: ");
            alunoTmp.setRa(input.next());
            alunos.add(alunoTmp);
        }

        System.out.println("\nRegistros dos Alunos:");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
    }
}
}
