class Remedio {

  String nome;
  String tarja;
  double valor;
  String laboratorio;
  int Estoque;

  Remedio(String nome, String tarja, double valor, String laboratorio, int Estoque) {
    this.nome = nome;
    this.tarja = tarja;
    this.valor = valor;
    this.laboratorio = laboratorio;
    this.Estoque = Estoque;
  }

  public void infoRemedio() {
    System.out.println("|-------------------------------------------|");
    System.out.println("   Remédio");
    System.out.println("Nome: "+this.nome+"\n"+"Tarja: "+ this.tarja+"\n"+ "Valor: R$"+this.valor+"0"+"\n"+"Laboratório: "+this.laboratorio+"\n"+"Quantidade em Estoque: "+this.Estoque);

  }

}