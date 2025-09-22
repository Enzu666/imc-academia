package br.com.senaijandira.imcacademia;
import java.util.Scanner;

public class ImcAcademia {
    String nomeDoAluno;
    double pesoDoAluno;
    double alturaDoAluno;
    double imcAluno;

    public void obterDadosAluno() {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        nomeDoAluno = leitor.nextLine();

        System.out.print("Digite o peso do aluno: ");
        pesoDoAluno = leitor.nextDouble();

        System.out.print("Digite a altura do aluno: ");
        alturaDoAluno = leitor.nextDouble();
        calcularImc();
    }

    public void calcularImc() {
        imcAluno = pesoDoAluno / (alturaDoAluno * alturaDoAluno);
        System.out.println(imcAluno);
    }
}