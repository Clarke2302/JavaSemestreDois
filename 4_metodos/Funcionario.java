class Funcionario {

  String nome;
  String sobrenome;
  String cpf;
  double salario;
  String Cargo;

  Funcionario(String nome, String sobrenome, String cpf, double salario, String Cargo) {
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.cpf = cpf;
    this.salario = salario;
    this.Cargo = Cargo;
  }

  public void infoFuncionario() {
    System.out.println("|-------------------------------------------|");
    System.out.println("   Funcionário");
    System.out.println("Nome: "+this.nome+"\n"+"Sobrenome: "+ this.sobrenome+"\n"+ "CPF: "+this.cpf+"\n"+"Salário: R$"+this.salario+"0"+"\n"+"Cargo: "+this.Cargo);

  }

  public void novoSalario(double novoSal){
    this.salario = novoSal;
    System.out.println("\n"+"-------------------------------------------");
    System.out.println("Salário atualizado!");
    System.out.println("-------------------------------------------"+"\n");
  }
  public void novoCargo(String novoCargo){
    this.Cargo=novoCargo;
    System.out.println("-------------------------------------------"+"\n");
    System.out.println("Mudança de cargo feita!");
    System.out.println("-------------------------------------------"+"\n");

  }

}