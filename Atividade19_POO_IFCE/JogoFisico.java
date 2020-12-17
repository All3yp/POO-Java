public class JogoFisico extends Jogo {
  private int lote;

  // CONSTRUTOR: Init da classe
  public JogoFisico(String titulo, Double preco, int lote) {
    super(titulo, preco);
    this.lote = lote;
  }

  // METODO ACESSADOR (GET)
  public int getLote() {
    return lote;
  }

  // METODO MODIFICADOR (SET)
  public void setLoteDoJogo(int lote) {
    this.lote = lote;
  }

  // SOBRESCRITA DO METODO exibirJogo() DA CLASSE PAI
  public void exibirJogo() {
    super.exibirJogo();
    System.out.println("Codigo do Lote do Jogo: " + lote);
  }
}