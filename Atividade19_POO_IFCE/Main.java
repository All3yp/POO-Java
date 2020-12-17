/*
Implemente a classe Jogo que tem como atributos um título e um preço. Faça seu construtor, os métodos acessadores e modificadores e um método chamado exibir que irá imprimir na tela o título e o preço. Em seguida, implemente as classes Fisico e Digital que são subclasses de Jogo. A classe Fisico possui um atributo chamado lote e a classe Digital possui um atributo chamado codigo. Para essas duas classes implemente também o construtor, métodos acessadores e modificadores e faça a sobrescrita do método exibir para acrescentar o atributo individual de cada uma. Observe que todos os atributos (em todas as classes) estão privados. No programa principal (main), crie um objeto da classe Físico e outro da Digital. Logo em seguida chame o método exibir para cada um dos objetos criados.
*/

class Main {
  public static void main(String[] args) {

    //Criando os objetos
    Jogo tlou2 = new Jogo("The Last of Us Part II", 300.0);
    JogoDigital tlouDigital = new JogoDigital("The Last of us", 250.0, 123456);
    JogoFisico tlou1Fisico = new JogoFisico("The Last of Us Remastered", 59.9, 789012);

    //Chamada do método exibirJogo
    System.out.println("\n### Objeto da Classe Jogo");
    tlou2.exibirJogo();

    System.out.println("\n### Objeto da Classe JogoDigital");
    tlouDigital.exibirJogo();

    System.out.println("\n### Objeto da Classe JogoFisico");
    tlou1Fisico.exibirJogo();
  }
}