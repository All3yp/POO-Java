/*
Dê continuidade a calculadora iniciada na aula 9, adicionando as operações de Multiplicação e Divisão.
*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    int opcao;
    do {
      System.out.println("\n\n#-#-#-#-CALCULADORA-#-#-#-#");
      System.out.println("\n1 - Multiplicar");
      System.out.println("2 - Dividir");
      System.out.println("0 - Sair\n");
      System.out.println("#-#-#-#-#-#-#-#-#-#-#-#-#");

      System.out.print("\nDigite uma opção do menu: ");
      opcao = leitor.nextInt();
      switch (opcao) {
      case 1:
        System.out.print("\nDigite o primeiro numero: ");
        int num1 = leitor.nextInt();
        System.out.print("\nDigite o segundo numero: ");
        int num2 = leitor.nextInt();
        System.out.println("\n\nO resultado da multiplicação é: " + (num1 * num2));
        return;
      case 2:
        System.out.print("\nDigite o primeiro numero: ");
        int numero1 = leitor.nextInt();
        System.out.print("\nDigite o segundo numero: ");
        int numero2 = leitor.nextInt();
        System.out.println("\n\nO resultado da divisão é: " + (numero1 / numero2));
        return;
      default:
        System.out.println("\nOpção inválida");
        return;
      }
    } while (opcao != 0);
  }
}