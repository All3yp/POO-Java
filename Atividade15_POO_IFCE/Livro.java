/*
Continuei a atividade da aula 14: "Crie uma classe chamada Livro que contém os seguintes atributos: ISBN (código do livro), título, autor, editora e ano de publicação. No programa principal crie dois objetos dessa classe com seus respectivos dados e os exiba.". Adicionando um construtor e um método que exiba as informações do livro.
*/

public class Livro {
  String titulo;
  String autor;
  String editora;
  int anoPublicado;
  int isbn;

  // Construtor : Init da classe
  Livro(String titulo, String autor, String editora, int anoPublicado, int isbn) {

    this.titulo = titulo;
    this.autor = autor;
    this.editora = editora;
    this.anoPublicado = anoPublicado;
    this.isbn = isbn;
  }

  public void mostraLivro() {
    System.out.print("\n"+this.titulo);
    System.out.print("\n"+this.autor);
    System.out.print("\n"+this.editora);
    System.out.print("\n"+this.anoPublicado);
    System.out.print("\n"+this.isbn+"\n");
  }
}