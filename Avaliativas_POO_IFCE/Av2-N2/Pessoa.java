public class Pessoa {
  private String nome;
  private String endereco;
  private int telefone;

  // CONSTRUTOR: Init da classe
  Pessoa(String nome, String endereco, int telefone) {
    this.nome = nome;
    this.endereco = endereco;
    this.telefone = telefone;
  }

  // MÉTODOS ACESSADORES (GET)
  public String getNome() {
    return nome;
  }

  public String getEndereco() {
    return endereco;
  }

  public int getTelefone() {
    return telefone;
  }

  // MÉTODOS MODIFICADORES (SET)
  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

   public void setTelefone(int telefone) {
    this.telefone = telefone;
  }

  // MÉTODO: Função associada ao objeto
  public void exibirPessoa() {
    System.out.println("Nome: " + this.nome);
    System.out.println("Endereço: " + this.endereco);
    System.out.println("Telefone: " + this.telefone);
  }
}