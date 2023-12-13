import java.util.ArrayList;
import java.util.Scanner;

public class Banco {
    String nome;
    String cnpj;
    int numConta;
    ArrayList<ContaBancaria> contasBancarias;

    public Banco(String nome,String cnpj,int numConta){
        this.nome=nome;
        this.cnpj = cnpj;
        this.numConta=numConta;
        this.contasBancarias = new ArrayList<>();
    }

    public Banco(){

    }

    public void info( ArrayList<Banco> bancosCadastrados){
        for(Banco bh : bancosCadastrados){
        System.out.println("\n"+"==========Info Banco=========="+"\n"
        +"Nome do Banco: "+bh.getNomeBanco()+"\n"
        +"CNPJ: "+bh.getCnpj()+"\n"
        +"Número da Conta: "+bh.getNumConta()+"\n");
        System.out.println("=======================================");
        }
    }

    public void infoContas(String nomeBanco,ArrayList<Banco> bancos){
        for(Banco ba : bancos){
            if(ba.getNomeBanco().equals(nomeBanco))
            System.out.println("\n"+"==========Info Contas Bancárias=========="+"\n"
            +"Nome do Banco: "+ba.getNomeBanco()+"\n"
            +"CNPJ: "+ba.getCnpj()+"\n"
            +"Número da Conta: "+ba.getNumConta()+"\n");
            System.out.println("=======================================");
        }
    }
    
    public void criarConta(Scanner tec,ArrayList<Pessoa> pessoasCadastradas,ArrayList<Banco> bancosCadastrados,
    ArrayList<ContaCorrente> contasCorrentes,ArrayList<ContaPoupanca> contasPoupancas, ArrayList<ContaBancaria> contas){
        tec.nextLine(); //buffer
        System.out.println("\n"+"Bem-Vindo à Criação de Conta: "+"\n"
        +"Que tipo de conta você deseja criar: "+"\n"
        +"1 - Conta Corrente:"+"\n"
        +"2 - Conta Poupanca:"+"\n");
        System.out.printf("Digite: ");
        int escolha = tec.nextInt();

        if(escolha == 1){
            tec.nextLine(); //buffer
        System.out.println("Digite o nome do titular: ");
        String nomeTit = tec.nextLine();
            for(Pessoa m : pessoasCadastradas){
                if(m.getNome().equalsIgnoreCase(nomeTit) || m.getSobrenome().equalsIgnoreCase(nomeTit)){
                    System.out.println("Agora digite o nome do Banco dessa pessoa: ");
                    String nomeBanco = tec.nextLine();
                    for(Banco i : bancosCadastrados){
                        if(i.getNomeBanco().equalsIgnoreCase(nomeBanco)){

                            System.out.println("Digite um Número para essa conta: ");
                            int numero = tec.nextInt();

                            tec.nextLine(); //buffer

                            System.out.println("Digite uma senha para essa conta:");
                            String senh = tec.nextLine();

                            ContaCorrente abo = new ContaCorrente(m,i,numero,0,senh,1.50);
                            contas.add(abo);
                            contasCorrentes.add(abo);

                            System.out.println("\n"+"Conta Corrente criada!");
                            break;
                        }else{
                            System.out.println("\n"+"Não encontramos esse banco no sistema!");
                        }
                    }

                }else{
                    System.out.println("\n"+"Não achamos essa pessoa no sistema!");
                }
            }
        }
        tec.nextLine(); //buffer
        if(escolha == 2){
            System.out.println("Digite o nome do titular: ");
            String nomeTit = tec.nextLine();
            for(Pessoa m : pessoasCadastradas){
                if(m.getNome().equalsIgnoreCase(nomeTit) || m.getSobrenome().equalsIgnoreCase(nomeTit)){
                    System.out.println("Agora digite o nome do Banco dessa pessoa: ");
                    String nomeBanco = tec.nextLine();
                    for(Banco i : bancosCadastrados){
                        if(i.getNomeBanco().equalsIgnoreCase(nomeBanco)){

                            System.out.println("Digite um Número para essa conta: ");
                            int numero = tec.nextInt();

                            tec.nextLine(); //buffer

                            System.out.println("Digite uma senha para essa conta:");
                            String senh = tec.nextLine();

                            ContaPoupanca abo = new ContaPoupanca(m,i,numero,0,senh,25,3);
                            contas.add(abo);
                            contasPoupancas.add(abo);

                            System.out.println("\n"+"Conta Poupanca criada!");

                            break;

                        }else{
                            System.out.println("\n"+"Não encontramos esse banco no sistema!");
                        }
                    }

                }else{
                    System.out.println("\n"+"Não achamos essa pessoa no sistema!");
                }
            }
        }

    }

    public void fecharConta(Scanner tec,ArrayList<ContaCorrente> contasCorrentes,ArrayList<ContaPoupanca> contasPoupancas){
        tec.nextLine();
        System.out.println("\n"+"Entramos no Sistema de Fechar uma Conta"+"\n"
        +"Escolha o tipo de conta que deseja fechar:"+"\n"
        +"1 - Conta Corrente: "+"\n"
        +"2 - Conta Poupanca: "+"\n");
        System.out.printf("Digite: ");
        int digite = tec.nextInt();

        if(digite ==1 ){
            tec.nextLine();

            System.out.println("Digite o nome do titular da conta: ");
            String nomee = tec.nextLine();

            for(ContaCorrente ccc : contasCorrentes) {
                if (ccc.getTitular().getNome().equalsIgnoreCase(nomee) || ccc.getTitular().getSobrenome().equalsIgnoreCase(nomee)) {
                    System.out.println("Digite o número da conta: ");
                    int num = tec.nextInt();

                    if (ccc.getNumConta()== num) {

                    System.out.println("Agora digite a senha da conta: ");
                    String sen = tec.nextLine();

                        if (ccc.getSenha() == sen) {
                            System.out.println("Você tem certeza que deseja fechar essa conta?"+"\n"+"Se sim digite 1:"+"\n" );
                            int digita = tec.nextInt();
                            if(digita == 1){
                                contasCorrentes.remove(ccc);
                                System.out.println("\n"+"Conta Fechada!");
                            }
                            
                        }else{
                        System.out.println("Sua senha ou número da conta estão incorretos!"+"\n"
                        +"Tente fechar a conta mais tarde!");
                        break;
                        }
                    }
                }
            }
            
        }

            if(digite==2 ){
                tec.nextLine();

                System.out.println("Digite o nome do titular da conta: ");
                String nomee = tec.nextLine();

                for(ContaPoupanca ccc : contasPoupancas) {
                    if (ccc.getTitular().getNome().equalsIgnoreCase(nomee) || ccc.getTitular().getSobrenome().equalsIgnoreCase(nomee)) {
                        System.out.println("Digite o número da conta: ");
                        int num = tec.nextInt();

                        if (ccc.getNumConta()== num) {

                        System.out.println("Agora digite a senha da conta: ");
                        String sen = tec.nextLine();

                            if (ccc.getSenha() == sen) {
                                System.out.println("Você tem certeza que deseja fechar essa conta?"+"\n"+"Se sim digite 1:"+"\n" );
                                int digita = tec.nextInt();
                                if(digita == 1){
                                    contasCorrentes.remove(ccc);
                                    System.out.println("\n"+"Conta Fechada!");
                                }
                                
                            }else{
                            System.out.println("Sua senha ou número da conta estão incorretos!"+"\n"
                            +"Tente fechar a conta mais tarde!");
                            break;
                    }
                }
            }
        }
    }
}

    //Getters and Setters

    public String getNomeBanco(){
        return nome;
    }
    public void setNomeBanco(String novoNome){
        this.nome=novoNome;
    }
    public String getCnpj(){
        return cnpj;
    }
    public void setCnpj(String novoCnpj){
        this.cnpj=novoCnpj;
    }
    public int getNumConta(){
        return numConta;
    }
    public void setIdade(int novoNum){
        this.numConta=novoNum;
    }


}
