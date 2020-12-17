public class Fornecedor extends Pessoa {
  private double valorDeCredito;
  private double valorDeDivida;

  // CONSTRUTOR: Init da classe
  public Fornecedor(String nome, String endereco, int telefone, double valorDeCredito, double valorDeDivida) {
    super(nome, endereco, telefone);
    this.valorDeCredito = valorDeCredito;
    this.valorDeDivida = valorDeDivida;
  }

  // METODO ACESSADOR (GET) DA SUBCLASSE
  public double getValorDeCredito() {
    return valorDeCredito;
  }

  public double getValorDeDivida() {
    return valorDeDivida;
  }

  // MÉTODOS MODIFICADORES (SET) DA SUBCLASSE
  public void setValorDeCredito(double valorDeCredito) {
    this.valorDeCredito = valorDeCredito;
  }

  public void setValorDeDivida(double valorDeDivida) {
    this.valorDeDivida = valorDeDivida;
  }

  public double obterSaldo() {
    return valorDeCredito - valorDeDivida;
  }

  // MÉTODO: Função associada ao objeto
  public void exibirPessoa() {
    super.exibirPessoa();
    System.out.println("Valor de crédito:  " + this.valorDeCredito);
    System.out.println("Valor de dívida: " + this.valorDeDivida);
  }
}