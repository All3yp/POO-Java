public class Empregado extends Pessoa {
  private int codigoDoSetor;
  private double salario;

  // CONSTRUTOR: Init da classe
  public Empregado(String nome, String endereco, int telefone, int codigoDoSetor, double salario) {
    super(nome, endereco, telefone);
    this.codigoDoSetor = codigoDoSetor;
    this.salario = salario;
  }

  // METODO ACESSADOR (GET) DA SUBCLASSE
  public int getCodigoSetorDoEmpregado() {
    return codigoDoSetor;
  }

  public double getSalarioDoEmpregado() {
    return salario;
  }

// MÉTODOS MODIFICADORES (SET) DA SUBCLASSE
  public void setCodigoSetorDoEmpregado(int codigoDoSetor) {
    this.codigoDoSetor = codigoDoSetor;
  }

  public void setSalarioDoEmpregado(double salario) {
    this.salario = salario;
  }
  
    // MÉTODO: Função associada ao objeto
  public void exibirPessoa() {
    super.exibirPessoa();
    System.out.println("Codigo do setor do funcionário:  " + this.codigoDoSetor);
    System.out.println("Salário do funcionário: " + this.salario);
  }
  
}