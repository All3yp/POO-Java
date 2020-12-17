/*
Continue a implementação da classe Jogo: "Implemente uma classe chamada Jogo que tem como atributos um título e um preço. Faça seu construtor e dois métodos: um que exibe as informações do jogo e outro que atualiza o preço para um novo valor. " Agora altere o modificador de acesso dos atributos da classe para privado. Implemente os métodos acessadores e modificadores. No programa principal crie um objeto dessa classe e teste os novos métodos que foram criados.
*/

public class Jogo {
  private String titulo;
  private Double preco;

  // construtor: Init da classe
  Jogo(String titulo, Double preco) {
    this.titulo = titulo;
    this.preco = preco;
  }

  // Metodo: funcao associada ao objeto
  public void mostraJogo() {
    System.out.println("Título do jogo: " + this.titulo);
    System.out.println("Preço: R$ " + this.preco);
  }

  // METODOS ACESSADORES (GET)
  public String getTitulo() {
    return titulo;
  }

  public Double getPreco() {
    return preco;
  }

  // METODOS MODIFICADORES (SET)
  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public void setPreco(Double preco) {
    this.preco = preco;
  }

  public void novoPreco(Double novoPreco) {
    setPreco(novoPreco);
    System.out.print("O novo preço do jogo é de R$: " + novoPreco);
    System.out.println("\n");
  }
}