import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Deve ser criada uma interface para usuário, onde seja possível
        //cadastrar bancos, pessoas e contas, bem como obter informações dos objetos!
        
        Scanner tec = new Scanner (System.in);

        ArrayList<Banco> bancosCadastrados= new ArrayList<>();
        ArrayList<Pessoa> pessoasCadastradas = new ArrayList<>();
        ArrayList<ContaCorrente> contasCorrentes= new ArrayList<>();
        ArrayList<ContaPoupanca> contasPoupancas= new ArrayList<>();

        ArrayList<ContaBancaria> contas= new ArrayList<>();

        Banco bb = new Banco();
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();
        Pessoa vi = new Pessoa();

        int tecla = 1;

        while(tecla!=0){
        System.out.println("\n"+"-------------Sistema Bancario----------------"+"\n"
        +"1 - Cadastrar Banco: "+"\n"
        +"2 - Cadastrar Pessoa: "+"\n"
        +"3 - Criar Conta Corrente ou Poupanca: "+"\n"
        +"4 - Info Conta Corrente: "+"\n"
        +"5 - Info Conta Poupanca: "+"\n"
        +"6 - Realizar Saque na Conta Corrente: "+"\n"
        +"7 - Realizar Depósito na Conta Corrente: "+"\n"
        +"8 - Realizar Saque na Conta Poupanca:"+"\n"
        +"9 - Realizar Depósito na Conta Poupanca:"+"\n"
        +"10 - Info Pessoas: "+"\n"
        +"11 - Info Contas Pessoa: "+"\n"
        +"12 - Info Banco: "+"\n"
        +"13 - Info Contas Bancárias: "+"\n"
        +"14 - Recolher Taxa Mensal da Conta Corrente: "+"\n"
        +"15 - Recolher Taxa Mensal da Conta Poupanca: "+"\n"
        +"0 - Sair do Sistema: "+"\n");

        System.out.printf("Digite: ");
        tecla = tec.nextInt();

            if(tecla == 1){ //funciona
                cadastraBanco(tec, bancosCadastrados);
            }
            if(tecla ==2){ //funciona
                cadastraPessoa(tec,pessoasCadastradas);
            }
            if(tecla == 3){ //funciona
                bb.criarConta(tec,pessoasCadastradas,bancosCadastrados,contasCorrentes,contasPoupancas,contas);
            }
            if(tecla == 4){ //funciona
                cc.info(contasCorrentes,pessoasCadastradas);
            }
            if(tecla == 5){ //funciona
                cp.info(contasPoupancas,pessoasCadastradas);
            }
            if(tecla == 6){ //senha não funciona
                cc.saque(tec);
            }
            if(tecla == 7){ //funciona
                cc.deposito(tec);
            }
            if(tecla == 8){
                cp.saque(20,tec);
            }
            if(tecla == 9){
                cp.deposito(400);
            }
            if(tecla == 10){
                vi.info(pessoasCadastradas); //funciona
            }
            if(tecla == 11){
                vi.infoContas("Giovana", pessoasCadastradas,contas);
            }
            if(tecla == 12){ //funciona
                bb.info(bancosCadastrados);
            }
            if(tecla == 13){
                bb.infoContas("Brasil", bancosCadastrados);
            }
            if(tecla == 14){
                cc.novoMes();
            }
            if(tecla == 15){
                cp.novoMes(cc);
            }
            if(tecla == 0){
                System.out.println("\n"+"Você está saindo de nosso sistema! Volte Sempre :)");
            }


        }

    }

    //Funções de Cadastro e tals

    public static void cadastraBanco(Scanner tec, ArrayList<Banco> bancosCadastrados){
        tec.nextLine(); //buffer
        System.out.println("\n"+"Bem-Vindo ao Cadastro de Banco: "+"\n"
        +"Digite o nome do Banco: ");
        String nomebanco = tec.nextLine();
        System.out.println("Digite o CNPJ: ");
        String cnpj = tec.nextLine();
        System.out.println("Digite o Número da conta: ");
        int numero = tec.nextInt();

        Banco bb = new Banco(nomebanco,cnpj,numero);
        bancosCadastrados.add(bb);

        System.out.println("\n"+"Banco criado!");
    }

    public static void cadastraPessoa(Scanner tec, ArrayList<Pessoa> pessoasCadastradas ){
        tec.nextLine(); //buffer
        System.out.println("\n"+"Bem-Vindo ao Cadastro de Pessoas: "+"\n"
        +"Digite o nome dessa pessoa: ");
        String nome = tec.nextLine();
        System.out.println("Agora o sobrenome: ");
        String sobrenome = tec.nextLine();
        System.out.println("Digite a idade dessa pessoa: ");
        int idade = tec.nextInt();
        tec.nextLine(); //buffer
        System.out.println("Digite o CPF: ");
        String cpf = tec.nextLine();

        Pessoa g = new Pessoa(nome,sobrenome,idade,cpf);
        pessoasCadastradas.add(g);

        System.out.println("\n"+"Pessoa cadastrada!");
    }
    


}
