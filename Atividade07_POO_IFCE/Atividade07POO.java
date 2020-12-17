/*
Utilizando a estrutura de repetição FOR, some os números de 1 a 100 e imprima o valor.
*/

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    int result = 0;
    //int result = 1 + 2 + 3 + 4 + ... + 100
    for(int i = 0; i <= 100; i++) {
        result += i;
    }

    System.out.println("\n"+result);
  }
}