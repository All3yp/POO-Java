/*
Implemente uma classe chamada Jogo que tem como atributos um título e um preço. Faça seu construtor e dois métodos: um que exibe as informações do jogo e outro que atualiza o preço para um novo valor. No programa principal crie um objeto dessa classe e chame os dois métodos criados.
*/

import java.util.Scanner;

class Main {

  public static Jogo lerValoresECriaJogo() {

    Scanner leitor = new Scanner(System.in);

    System.out.print("\ntitulo: ");
    String titulo = leitor.next();

    System.out.print("\npreco: ");
    Double preco = leitor.nextDouble();

    Jogo jogo = new Jogo(titulo, preco);
    return jogo;
  }

  public static void main(String[] args) {

    Jogo jogo = lerValoresECriaJogo();
    jogo.mostraJogo();
    jogo.aumentaPreco(100.0);
    jogo.mostraJogo();  
  }
}