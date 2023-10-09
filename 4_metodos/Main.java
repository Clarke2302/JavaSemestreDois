class Main {
  public static void main(String[] args) {

    Empresa e = new Empresa("Panvel", "47.758.573/0001-54", "Rua dos Monges, 124","Venda de Medicamentos e produtos no geral.");
    Remedio r = new Remedio ("Fluxotan","Preta",34.90,"Cimex",3);
    Funcionario f = new Funcionario("Roberto", "Bilyes","637.738.728-27",1400.00,"Estoquista");
    Livro l = new Livro("As rosas cor de carmim","678-778-83907-8-1",64.90,"Jorge Gomes","Culturalta",5);

    //infos
    /*
    e.infoEmpresa();
    r.infoRemedio();
    f.infoFuncionario();
    l.infoLivro();
    */

    //Atualizando dados e os mostrando

    //empresa
    e.novoEndereco("Rua NotreDame, 609");
    e.infoEmpresa();

    //remédio
    r.novoValor(100);
    r.novoEstoque(9);
    r.incrementaEstoque(5);
    r.infoRemedio();
    r.decrementaEstoque(2);
    r.infoRemedio();

    //livro
    l.novoValor(60);
    l.novoEstoque(9);
    l.infoLivro();
    l.incrementaEstoque(6);
    l.decrementaEstoque(2);
    l.infoLivro();
    
    //funcionario

    f.novoSalario(3000);
    f.novoCargo("Gerente");
    f.infoFuncionario();


    
  }
}