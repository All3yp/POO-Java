/*
Escreva um algoritmo que leia 10 números inseridos pelo usuário, armazene-os em um vetor e, em seguida, exiba os números e suas respectivas posições.
*/

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int vetor[] = new int [10];
    for(int i = 0; i <= 9; i++) {
      System.out.print("\nDigite o #"+(i+1)+" valor: ");
      vetor[i] = leitor.nextInt();
    }
    System.out.print("\n#-#-#-#-#-#-#-#-#-#-#-#-#");
    for(int i = 0; i <= 9; i++) {
      System.out.print("\n- Elemento " +vetor[i]);
      System.out.print(" Posição "+i);
    }
    System.out.print("\n#-#-#-#-#-#-#-#-#-#-#-#-#\n");
  }
}