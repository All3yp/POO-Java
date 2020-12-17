/*
Escreva um programa, em Java, que leia os elementos (números inteiros) de uma matriz de 3 linhas e 2 colunas e os exiba.
*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    // primeiro linhas, depois colunas
    int matrizNumeros[][] = new int[3][2];

    for (int linha = 0; linha <= 2; linha++) {
      for (int coluna = 0; coluna <= 1; coluna++) {
        System.out.print("\nDigite um valor: ");
        matrizNumeros[linha][coluna] = leitor.nextInt();
      }
    }
    System.out.println("\n#-#-#-#");
    for (int linha = 0; linha <= 2; linha++) {
      System.out.print("# ");
      for (int coluna = 0; coluna <= 1; coluna++) {
        System.out.print(+matrizNumeros[linha][coluna] + "  ");
      }
      System.out.println();
    }
    System.out.println("#-#-#-#");
    System.out.println();
  }
}