/*
Faça um programa em Java que leia um valor inteiro e apresente os resultados do quadrado e do cubo do valor lido.
*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    System.out.println("\nDigite um número inteiro: ");
    int numeroInteiro = leitor.nextInt();
    int quadrado = numeroInteiro * numeroInteiro;
    int cubo = numeroInteiro * numeroInteiro * numeroInteiro;
    System.out.println("\nO quadrado de "+numeroInteiro + " é: "+quadrado);
    System.out.println("\nO cubo de "+numeroInteiro+ " é: "+cubo);
  }
}