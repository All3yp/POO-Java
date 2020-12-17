/*
Escreva um programa em Java que leia o peso e a altura de uma pessoa e diga se ela está ou não no peso ideal. O cálculo do Índice de Massa Corpórea (IMC) de uma pessoa é obtido pela divisão entre o valor do seu peso e o quadrado do valor da sua altura. O valor do IMC para o peso ideal deve estar entre 20 e 25.
*/

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    System.out.println("\nDigite o seu peso: ");
    float peso = leitor.nextFloat();
    System.out.println("\nDigite a sua altura: ");
    float altura = leitor.nextFloat();
    float imc = peso/(altura*altura);
    System.out.println("\nO IMC é de "+imc);
    if (imc > 20 && imc < 25) {
      System.out.println("Peso ideal");
    } else {
      System.out.println("Peso não ideal");
    }
  }
}
