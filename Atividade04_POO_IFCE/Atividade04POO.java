/*
Faça um programa em Java que leia os valores de COMPRIMENTO, LARGURA e ALTURA e apresente o valor do volume de uma caixa retangular. Utilize para o cálculo a fórmula VOLUME = COMPRIMENTO * LARGURA * ALTURA.
*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  Scanner leitor = new Scanner(System.in);
  System.out.println("\nDigite o Comprimento: ");
  float comprimento = leitor.nextFloat();
  System.out.println("\nDigite a Largura: ");
  float largura = leitor.nextFloat();
  System.out.println("\nDigite a altura: ");
  float altura = leitor.nextFloat();
  float volume = comprimento * largura * altura;
  System.out.println("\nO volume da caixa é "+volume);
  }
}
