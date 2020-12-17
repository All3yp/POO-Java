/*
Para uma turma de 45 alunos, construa um programa em Java que determine: 
a) A idade média dos alunos com menos de 1,70m de altura; 
b) A altura média dos alunos com mais de 20 anos.
*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    double[] idades = { 12, 30, 18, 15, 20, 18, 38, 63, 16, 12, 21, 34, 65, 23, 17, 20, 31, 21, 22, 40, 29, 43, 19, 51, 43, 49, 50, 11, 52, 48, 35, 13, 10, 53, 41, 25, 23, 19, 54, 45, 26, 20, 18, 50, 23, };

    double[] alturas = { 1.50, 1.98, 1.64, 1.71, 2.18, 1.51, 2.12, 1.50, 1.72, 1.28, 1.52, 1.87, 1.71, 1.73, 1.68, 1.53, 1.89, 1.51, 1.74, 1.48, 1.54, 1.95, 1.49, 1.75, 1.58, 1.75, 1.92, 1.63, 1.76, 1.68, 1.60, 1.40, 1.54, 1.77, 1.78, 1.50, 1.90, 1.43, 1.78, 1.88, 1.70, 2.01, 1.49, 1.79, 1.98, };

    for (int i = 0; i < 45; i++) {
      System.out.print((i + 1) + " - Idade: " + idades[i]);
      System.out.println(" e Altura: " + alturas[i]);
    }

    double qtd_soma_idade = 0;
    double qtd_soma_altura = 0;

    double acumulador_soma_idade = 0;
    double acumulador_soma_altura = 0;

    for (int i = 0; i < 45; i++) {
      // ALUNO
      double idade = idades[i];
      double altura = alturas[i];

      // a) A idade média dos alunos com menos de 1,70m de altura;
      if (altura < 1.70) {
        acumulador_soma_altura = acumulador_soma_altura + altura;
        qtd_soma_altura++;
      }

      // b) A altura média dos alunos com mais de 20 anos.*/
      if (idade > 20) {
        acumulador_soma_idade = acumulador_soma_idade + idade;
        qtd_soma_idade++;
      }

    }

    double media_idade = acumulador_soma_idade / qtd_soma_idade;
    double media_altura = acumulador_soma_altura / qtd_soma_altura;

    System.out.print("\n#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#");
    System.out.printf("\nA altura média dos alunos com mais de 20 anos: %.2f", media_altura);

    System.out.printf("\nA idade média dos alunos com menos de 1,70m de altura: %d", (int)media_idade);
    System.out.print("\n#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#");
  }
}