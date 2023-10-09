class Empresa {

  String nome;
  String CNPJ;
  String endereço;
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

}