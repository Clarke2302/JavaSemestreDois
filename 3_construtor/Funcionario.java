public class Funcionario{

    String nome;
    int idade;
    String cpf;
    String profissao;


Funcionario(String nome, int idade, String cpf, String profissao){
this.nome = nome;
this.idade = idade;
this.cpf = cpf;
this.profissao = profissao;
}

public void imprime(){
System.out.println("------------------------------------------");
System.out.println("\n");
System.out.printf("Nome: "+this.nome+"\n"+"Idade: "+this.idade+" anos"+"\n"+"CPF: "+this.cpf+"\n"+"Profissão: "+this.profissao);
System.out.println("\n");
System.out.println("------------------------------------------");
}



public static void main(String[]args){

Funcionario f1 = new Funcionario("Juliana", 25, "536.728.627-28","Designer");


f1.imprime();


    }
}