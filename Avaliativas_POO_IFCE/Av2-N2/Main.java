/*
Implemente a classe Pessoa que tem como atributos um nome, endereço e telefone. 
Faça seu construtor, os métodos acessadores e modificadores e um método chamado exibir que irá imprimir na tela todos seus atributos. 
Em seguida, implemente as classes Fornecedor e Empregado que são subclasses de Pessoa. A classe Fornecedor possui como atributos um valor de crédito e um valor de dívida. 
Já a classe Empregado possui um código do setor e um salário. Para essas duas classes implemente também o construtor, métodos acessadores e modificadores e faça a sobrescrita do método exibir para acrescentar os atributos individuais de cada uma.
 Observe que todos os atributos (em todas as classes) estão privados. 

Obs. 1: O método obterSaldo calcula a subtração do valorCredito com valorDivida.
Obs. 2: O método exibir, exibe todas as informações da classe.
No programa principal: Crie um Fornecedor e exiba suas informações completas (incluindo Nome, Endereco e Telefone). Exiba também o saldo.
Crie um Empregado e exiba suas informações completas.
*/

class Main {
  public static void main(String[] args) {
    System.out.println("\n#-Atividade avaliativa 2 N2-#\n");

    // Criando os objetos
    Pessoa pessoa01 = new Pessoa("Yudi Tamashiro", "Rua do Preistecho 2", 40028922);

    Empregado empregado = new Empregado("Yudi", "Rua Bom dia & Cia", 40018921, 12, 7000.0);

    Fornecedor fornecedor = new Fornecedor("SBT", "Rua do SBT", 980101010, 50000.0, 2000.0);

    // Chamada do método exibirJogo
    System.out.println("\n### Objeto da Classe Pessoa");
    pessoa01.exibirPessoa();

    System.out.println("\n### Objeto da Classe Fornecedor");
    fornecedor.exibirPessoa();
    double empregador = fornecedor.obterSaldo();
    System.out.println("O saldo do fornecedor é de " + empregador);

    System.out.println("\n### Objeto da Classe Empregado");
    empregado.exibirPessoa();
  }
}