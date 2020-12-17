/*
Crie uma classe chamada Livro que contém os seguintes atributos: ISBN (código do livro), título, autor, editora e ano de publicação. No programa principal crie dois objetos dessa classe com seus respectivos dados e os exiba.
*/

class Main {
  public static void main(String[] args) {

    Livro harryPotter = new Livro();
    harryPotter.editora = "Rocco";
    harryPotter.autor = "J. K. Rowling";
    harryPotter.titulo = "Calice de fogo";
    harryPotter.anoPublicado = 2000;
    harryPotter.isbn = 934;

    System.out.print("\nHarry Potter");
    System.out.println(" e o " + harryPotter.titulo);
    System.out.println("Autor: " + harryPotter.autor);

    Livro percyJackson = new Livro();
    percyJackson.editora = "Disney";
    percyJackson.autor = "Rick Riordan";
    percyJackson.titulo = "Labirinto do Fauno";
    percyJackson.anoPublicado = 2008;
    percyJackson.isbn = 935;

    System.out.print("\nPercy Jackson");
    System.out.println(" e o " + percyJackson.titulo);
    System.out.println("Autor: " + percyJackson.autor);

  }
}