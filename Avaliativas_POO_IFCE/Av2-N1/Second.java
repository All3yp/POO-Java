/*
Escreva um programa em JAVA que receba uma quantidade indeterminada de números positivos e diga quantos deles estão no intervalo de 0 a 25, quantos estão no intervalo de 26 a 50 e quantos são maiores que 50. O programa deve parar quando o usuário digitar um número negativo.
*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int num = 0;
    int cont = 0;
    int cont2 = 0;
    int cont3 = 0;
    while (num >= 0) {
      System.out.println("\nDigite um num: ");
      num = leitor.nextInt();

      if (num >= 0 && num < 25) {
        cont++;
      } else if (num > 25 && num < 50) {
        cont2++;
      } else if (num >= 50){
        cont3++;
      }
    }
    System.out.println("\nA qt de numeros positivos menores que 25 é: " + cont);
    System.out.println("\nA qt de numeros maiores q 25 e menores que 50 é: " + cont2);
    System.out.println("\nA qt de numeros maiores/igual que 50 é: " + cont3);
  }
}