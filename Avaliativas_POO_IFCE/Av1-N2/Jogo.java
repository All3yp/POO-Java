/*
Implemente uma classe chamada Jogo que tem como atributos um título e um preço. Faça seu construtor e dois métodos: um que exibe as informações do jogo e outro que atualiza o preço para um novo valor. No programa principal crie um objeto dessa classe e chame os dois métodos criados.
*/

public class Jogo {
  String titulo;
  Double preco;

  // construtor: Init da classe
  Jogo(String titulo, Double preco) {
    this.titulo = titulo;
    this.preco = preco;
  }

  // Metodo: funcao associada ao objeto
  public void mostraJogo() {
    System.out.print("\n\nVocê escolheu o jogo " + this.titulo);
    System.out.print(", o preço dele é de R$: " + this.preco+" reais");
  }

  public void aumentaPreco(Double novoPreco) {
    this.preco = preco+novoPreco;
    System.out.print("\n\nOops, houve um aumento de R$: "+novoPreco+" reais. O atual valor do jogo é de R$: "+preco);
    System.out.println("\n");
  }
}