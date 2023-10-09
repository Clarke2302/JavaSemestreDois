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

  public void novoValor(double novoValor){
    System.out.println("\n"+"-------------------------------------------");
    System.out.println("O novo valor do livro foi adicionado!");
    this.valor = novoValor;
    System.out.println("-------------------------------------------"+"\n");
  }

  public void novoEstoque(int novoEstoque){
    System.out.println("\n"+"-------------------------------------------");
    System.out.println("A quantidade no estoque desse produto foi atualizada!");
    //int novo = tec.nextInt();
    this.estoque = novoEstoque;
    System.out.println("-------------------------------------------"+"\n");
  }
  public void incrementaEstoque(int aumentaEstoque){
    this.estoque = aumentaEstoque+estoque;
  }
  public void decrementaEstoque(int diminuiEstoque){
    if(estoque>diminuiEstoque){
    this.estoque = estoque-diminuiEstoque;
    }else{
      this.estoque = diminuiEstoque-estoque;
    }
  }

}