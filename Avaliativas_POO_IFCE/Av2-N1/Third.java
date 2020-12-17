/*
Faça um programa em JAVA que simulará um caixa eletrônico. Para isso, o programa deverá exibir um menu com as seguintes opções: 
1 - Depósito; 
2 - Saque; 
3 - Exibir Saldo; 
0 - Sair. 
Em seguida deve ser lida a opção do usuário e executar sua respectiva ação, por exemplo, se for escolhida a opção 1, deverá ser realizado um depósito no saldo do usuário. O saldo inicialmente terá valor zero. O programa só deverá parar quando o usuário digitar a opção de sair (zero).
*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    
    int caixa = -1;
    float saldoAtual = 0;

    while (caixa != 0) {
      System.out.println("\n\n#-#-#-#-#-#-#-#-#-#-#-#-#-#-#");
      System.out.println("# Escolha uma opção do MENU");
      System.out.println("# 1 - Depósito");
      System.out.println("# 2 - Saque");
      System.out.println("# 3 - Exibir Saldo");
      System.out.println("# 0 - Sair");
      System.out.println("#-#-#-#-#-#-#-#-#-#-#-#-#-#-#");
      System.out.println("\n\n");

      caixa = leitor.nextInt();

      switch (caixa) {
      case 1:
        System.out.println("\n 1 - Depósito");
        System.out.println("Quanto deseja depositar: ");
        float deposito = leitor.nextFloat();
        saldoAtual = deposito + saldoAtual;
        break;
      case 2:
        System.out.println("\n 2 - Saque");
        System.out.println("Quanto deseja sacar: ");
        float saque = leitor.nextFloat();
        if (saque > saldoAtual) {
          System.out.println("Saldo insuficiente para saque.");
        } else {
          saldoAtual = saldoAtual - saque;
        }
        break;
      case 3:
        System.out.println("\n 3 - Exibir Saldo");
        String strSaldo = String.format("%.2f", saldoAtual);
        System.out.println("\n Saldo atual: " + strSaldo);
        break;
      case 0:
        System.out.println("\n 0 - Sair");
        break;
      default:
        System.out.println("\n Opção inválida.");
        break;
      }
    }
  }
}