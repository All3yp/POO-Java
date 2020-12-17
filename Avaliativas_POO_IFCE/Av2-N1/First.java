/*
Escreva um programa em JAVA, utilizando estrutura de repetição, que leia as duas notas de cinco alunos de uma turma, calcule e mostre:

Da pra fazer para cada aluno (ou seja, dentro de um loop que roda 5 vezes).
0. leia as duas notas;
a. calcula a média aritmética de cada aluno;
b. mostra a mensagem de aluno reprovado, caso a média seja menor que 4.0;
c. mostra a mensagem de aluno em recuperação, caso a média esteja entre 4.0 e 7.0;
d. mostra a mensagem de aluno aprovado, caso a média seja maior ou igual a 7.0;

e. o total de alunos aprovados;
f. o total de alunos reprovados;g. o total de alunos em recuperação.
*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    int alunosAprovados = 0;
    int alunosReprovados = 0;
    int alunosRecuperacao = 0;

    for (int i = 0; i < 5; i++) {
      System.out.println("\nDigite a primeira nota: ");
      int nota1 = leitor.nextInt();
      System.out.println("Digite a segunda nota: ");
      int nota2 = leitor.nextInt();

      float media = (nota1 + nota2) / 2;
      System.out.println("A média do aluno é: " + media);

      if (media >= 0 && media < 4) {
        System.out.println("ALUNO REPROVADO");
        alunosReprovados += 1;

      } else if (media >= 4 && media < 7) {
        System.out.println("ALUNO DE RECUPERAÇÃO");
        alunosRecuperacao += 1;

      } else {
        System.out.println("ALUNO APROVADO");
        alunosAprovados += 1;
      }
    }
    System.out.println("\n\nO total de alunos Aprovados é: "+alunosAprovados);
    System.out.println("\n\nO total de alunos em Recuperação é: "+alunosRecuperacao);
    System.out.println("\n\nO total de alunos Reprovados é: "+alunosReprovados);
  }
}