import java.util.Scanner;
class Remedio {

  Scanner tec = new Scanner(System.in);

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

  public void novoValor(double novoValor){
    System.out.println("\n"+"-------------------------------------------");
    System.out.println("O novo valor do produto foi adicionado!");
    //double novo = tec.nextDouble();
    this.valor = novoValor;
    System.out.println("-------------------------------------------"+"\n");
  }

  public void novoEstoque(int novoEstoque){
    System.out.println("\n"+"-------------------------------------------");
    System.out.println("A nova quantidade no estoque desse produto foi atualizada!");
    //int novo = tec.nextInt();
    this.Estoque = novoEstoque;
    System.out.println("-------------------------------------------"+"\n");
  }
  public void incrementaEstoque(int aumentaEstoque){
    this.Estoque = aumentaEstoque+Estoque;
  }
  public void decrementaEstoque(int diminuiEstoque){
    if(Estoque>diminuiEstoque){
    this.Estoque = Estoque-diminuiEstoque;
    }else{
      this.Estoque = diminuiEstoque-Estoque;
    }
  }

}