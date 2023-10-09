import java.util.Scanner;
class Empresa {

  Scanner tec = new Scanner(System.in);

  String nome;
  String CNPJ;
  private String endereço;
  String serviço;

  Empresa(String nome, String CNPJ, String endereço, String serviço) {
    this.nome = nome;
    this.CNPJ = CNPJ;
    this.endereço = endereço;
    this.serviço = serviço;
  }

  public void infoEmpresa() {
    System.out.println("|-------------------------------------------|");
    System.out.println("   Empresa");
    System.out.println("Nome da Empresa: "+this.nome+"\n"+"CNPJ: "+ this.CNPJ+"\n"+ "Endereço: "+this.endereço+"\n"+"Serviço: "+this.serviço+"\n");

  };
  public void novoEndereco(String newAdress){
    System.out.println("\n"+"-------------------------------------------");
    System.out.println("Endereço atualizado!");
    //String novo = tec.nextLine();
    this.endereço = newAdress;
    System.out.println("-------------------------------------------"+"\n");
  }



}