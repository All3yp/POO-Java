/*
Continue a implementação da classe Jogo: "Implemente uma classe chamada Jogo que tem como atributos um título e um preço. Faça seu construtor e dois métodos: um que exibe as informações do jogo e outro que atualiza o preço para um novo valor. " Agora altere o modificador de acesso dos atributos da classe para privado. Implemente os métodos acessadores e modificadores. No programa principal crie um objeto dessa classe e teste os novos métodos que foram criados.
*/

import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    // No programa principal crie um objeto dessa classe
    Jogo tlou2 = new Jogo("The Last of Us 2", 250.00);

    //Chamada de cada método da Classe Jogo
    System.out.println("\n#### Chamada do método .mostraJogo()");
    tlou2.mostraJogo();
    
    System.out.println("\n#### Chamada do método .setTitulo(String)");
    tlou2.setTitulo("The Last of Us Part II");
  
    System.out.println("\n#### Chamada do método .getTitulo()");
    System.out.println(tlou2.getTitulo());

    System.out.println("\n#### Chamada do método .setPreco(Double)");
    tlou2.setPreco(150.00);

    System.out.println("\n#### Chamada do método .getPreco()");
    System.out.println(tlou2.getPreco());        
        
    System.out.println("\n#### Chamada do método .novoPreco(Double)");
    tlou2.novoPreco(200.00);
  }
}