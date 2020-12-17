public class Jogo {
  private String titulo;
  private Double preco;

  // construtor: Init da classe
  Jogo(String titulo, Double preco) {
    this.titulo = titulo;
    this.preco = preco;
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

  // Metodo: funcao associada ao objeto
  public void exibirJogo() {
    System.out.println("Título do jogo: " + this.titulo);
    System.out.println("Preço: R$ " + this.preco);
  }
}