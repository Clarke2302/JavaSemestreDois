class Livro {

  String titulo;
  String isbn;
  double valor;
  String autor;
  String editora;
  int estoque;

  Livro(String titulo, String isbn, double valor, String autor, String editora, int estoque) {
    this.titulo = titulo;
    this.isbn = isbn;
    this.valor = valor;
    this.autor = autor;
    this.editora = editora;
    this.estoque = estoque;
  }

  public void infoLivro() {
    System.out.println("|-------------------------------------------|");
    System.out.println("   Livro");
    System.out.println("Título do Livro: "+this.titulo+"\n"+"ISBN: "+ this.isbn+"\n"+ "Valor: R$"+this.valor+"0"+"\n"+"Autor: "+this.autor+"\n"+"Editora: "+this.editora+"\n"+"Quantidade em Estoque: "+this.estoque);

  }

}