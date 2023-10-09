class Main {
  public static void main(String[] args) {

    Empresa e = new Empresa("Panvel", "47.758.573/0001-54", "Rua dos Monges, 124","Venda de Medicamentos e produtos no geral.");
    Remedio r = new Remedio ("Fluxotan","Preta",34.90,"Cimex",3);
    Funcionario f = new Funcionario("Roberto", "Bilyes","637.738.728-27",1400.00,"Estoquista");
    Livro l = new Livro("As rosas cor de carmim","678-778-83907-8-1",64.90,"Jorge Gomes","Culturalta",5);

    e.infoEmpresa();
    r.infoRemedio();
    f.infoFuncionario();
    l.infoLivro();
    
  }
}