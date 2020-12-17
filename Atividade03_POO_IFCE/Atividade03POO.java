/*
Faça um programa em Java que peça para o usuário digitar dois números inteiros. Em seguida realize a soma deles e exiba o resultado.
*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int numero1, numero2;

    System.out.print("\n####################");
    System.out.print("\n# Atividade 03 POO #");
    System.out.print("\n####################\n");

    System.out.print("\nDigite o primeiro numero a ser somado: ");
    numero1 = leitor.nextInt();
    System.out.print("\nDigite o segundo numero a ser somado: ");
    numero2 = leitor.nextInt();
    int soma = numero1 + numero2;
    System.out.print("\nA soma dos numeros é: " + soma);

  }
}
