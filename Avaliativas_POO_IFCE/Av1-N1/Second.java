
/*
Escreva um programa em Java que, a partir de um mês fornecido (número inteiro de 1 a 12), escreva o nome do mês por extenso.
*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    System.out.println("\n\nDigite um número (1 a 12) do mês: \n");
    int mes = leitor.nextInt();
    switch (mes) {
    case 1:
      System.out.println("\nJaneiro");
      break;
    case 2:
      System.out.println("\nFevereiro");
      break;
    case 3:
      System.out.println("\nMarço");
      break;
    case 4:
      System.out.println("\nAbril");
      break;
    case 5:
      System.out.println("\nMaio");
      break;
    case 6:
      System.out.println("\nJunho");
      break;
    case 7:
      System.out.println("\nJulho");
      break;
    case 8:
      System.out.println("\nAgosto");
      break;
    case 9:
      System.out.println("\nSetembro");
      break;
    case 10:
      System.out.println("\nOutubro");
      break;
    case 11:
      System.out.println("\nNovembro");
      break;
    case 12:
      System.out.println("\nDezembro");
      break;
    default:
      System.out.println("\nO numero digitado não corresponde a um mês do ano.");
    }
  }
}