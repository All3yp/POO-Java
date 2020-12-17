/*
Escreva um programa em Java que leia os tamanhos dos lados de um triângulo e diga se o triângulo é isósceles, equilátero ou escaleno. Um triângulo é isósceles, se dois de seus lados tiverem tamanhos iguais. É equilátero se todos os seus lados forem iguais. E é escaleno se todos os seus lados forem diferentes.
*/

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    //leitura de input
    Scanner leitor = new Scanner(System.in);
    System.out.println("\n\n#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#");
    System.out.println("Digite o tamanho do primeiro lado do triângulo: ");
    float primeiroLado = leitor.nextFloat();
    System.out.println("\nDigite o tamanho do segundo lado do triângulo: ");
    float segundoLado = leitor.nextFloat();  
    System.out.println("\nDigite o tamanho do terceiro lado do triângulo: ");
    float terceiroLado = leitor.nextFloat();
    System.out.println("#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#");
      
    if(primeiroLado == segundoLado && primeiroLado == terceiroLado) {
      // verifica os lados pela logica transitiva
      System.out.println("\nTriângulo equilátero");

    } else if(primeiroLado != segundoLado && 
              primeiroLado != terceiroLado && 
              segundoLado != terceiroLado) {

      System.out.println("\nTriângulo escaleno");
    } else {
      System.out.println("\nTriângulo isósceles");
    } 
  }
}