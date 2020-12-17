/*
Faça um programa em Java que solicite dois números para o usuário e imprima a metade do primeiro número e o dobro do segundo apenas se a soma deles for maior que 50.
 */

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
   Scanner leitor = new Scanner(System.in);
    System.out.println("\nDigite o primeiro número: ");
    int n1 = leitor.nextInt();
    System.out.println("Digite o segundo número: ");
    int n2 = leitor.nextInt();

    if(n1 + n2 > 50) {
      System.out.println("\nMetade de N1: "+n1/2);
      System.out.println("Dobro de N2: "+n2*2);
    }
  }
}