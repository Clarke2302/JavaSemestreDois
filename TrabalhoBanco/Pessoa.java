import java.util.ArrayList;

public class Pessoa {
    String nome;
    String sobrenome;
    int idade;
    String cpf;
    ArrayList<ContaBancaria> contasBancarias;

    public Pessoa(String nome,String sobrenome,int idade,String cpf){
        this.nome=nome;
        this.sobrenome=sobrenome;
        this.idade=idade;
        this.cpf=cpf;
        this.contasBancarias = new ArrayList<>();
    }

    public Pessoa(){

    }
        
    public void info(ArrayList<Pessoa> pessoasCadastradas){
        for(Pessoa a : pessoasCadastradas){
        System.out.println("\n"+"==========Info Pessoa=========="+"\n"
        +"Nome Completo: "+a.getNome()+" "+a.getSobrenome()+"\n"
        +"Idade: "+a.getIdade()+"\n"
        +"CPF: "+a.getCpf()+"\n"+
        "=======================================");
        }
    }

    public void infoContas(String nomePessoa,ArrayList<Pessoa> pessoasCadastradas,ArrayList<ContaBancaria> contas){
        for(ContaBancaria cb : contas){
            for(Pessoa a : pessoasCadastradas){
                    if(a.getNome().equals(nomePessoa)&& cb.getTitular().equals(a)){
                    System.out.println("\n"+"==========Info Contas Bancárias Pessoa=========="+"\n"
                    +"Titular da Conta: "+cb.getTitular().getNome()+"\n"
                    +"Nome do Banco: "+cb.getBanco().getNomeBanco()+"\n"
                    +"Número da Conta: "+cb.getNumConta()+"\n"
                    +"Saldo: R$ "+cb.getSaldo()+"\n"
                    +"=======================================");
                    }
                }
        }
    }


        //Getters and Setters

        public String getNome(){
            return nome;
        }
        public void setNome(String novoNome){
            this.nome=novoNome;
        }
        public String getSobrenome(){
            return sobrenome;
        }
        public void setSobrenome(String novoSobre){
            this.sobrenome=novoSobre;
        }
        public int getIdade(){
            return idade;
        }
        public void setIdade(int novoIdade){
            this.idade=novoIdade;
        }
        public String getCpf(){
            return cpf;
        }
        public void setCpf(String novoCpf){
            this.cpf=novoCpf;
        }
        
        
    
}