public class JogoDigital extends Jogo {
  private int codigo;

  // CONSTRUTOR: Init da classe
  public JogoDigital(String titulo, Double preco, int codigo) {
    super(titulo, preco);
    this.codigo = codigo;
  }

  // METODO ACESSADOR (GET)
  public int getCodigo() {
    return codigo;
  }

  // METODO MODIFICADOR (SET)
  public void setCodigoDoJogo(int codigo) {
    this.codigo = codigo;
  }

  // SOBRESCRITA DO METODO exibirJogo() DA CLASSE PAI
  public void exibirJogo() {
    super.exibirJogo();
    System.out.println("Codigo do Jogo Digital: " + codigo);
  }
}