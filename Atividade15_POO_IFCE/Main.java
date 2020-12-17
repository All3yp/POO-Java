/*
Continuei a atividade da aula 14: "Crie uma classe chamada Livro que contém os seguintes atributos: ISBN (código do livro), título, autor, editora e ano de publicação. No programa principal crie dois objetos dessa classe com seus respectivos dados e os exiba.". Adicionando um construtor e um método que exiba as informações do livro.
*/

class Main {
  public static void main(String[] args) {

    // objetos da classe livro 
    Livro percyJackson = new Livro("Percy Jackson and The Lightning Thief", "Rick Riordan", "Disney Publishing Worldwide", 2005, 12345);

    Livro fallen = new Livro("Fallen Torment", "Lauren Kate", "Random House", 2009, 67890);

    // chamando o metodo
    percyJackson.mostraLivro();
    fallen.mostraLivro();
  }
}