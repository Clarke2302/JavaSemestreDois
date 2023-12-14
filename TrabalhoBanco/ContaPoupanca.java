import java.util.ArrayList;
import java.util.Scanner;

public class ContaPoupanca extends ContaBancaria{

    double rendimento;
    int saquesMensais;
    ArrayList<ContaPoupanca> contasPoupancas;

    public ContaPoupanca(Pessoa titular, Banco banco, int numConta, double saldo, String senha, double rendimento, int saquesMensais){
        super(titular,banco,numConta,saldo,senha);
        this.rendimento=rendimento;
        this.saquesMensais=saquesMensais;
    }
    public ContaPoupanca(){

    }

    public void info(ArrayList<ContaPoupanca> contasPoupancas,ArrayList<Pessoa> pessoasCadastradas){
        for(Pessoa a : pessoasCadastradas){
            for(ContaPoupanca cp : contasPoupancas){
                    System.out.println("\n" + "==========Info Conta Poupanca==========" + "\n"
                            + "Titular da Conta: " + a.getNome() + " " + a.getSobrenome() + "\n"
                            + "Nome do Banco: " + cp.getBanco().getNomeBanco() + "\n"
                            + "Número da Conta: " + cp.getNumConta() + "\n"
                            + "Saldo: R$ " + cp.getSaldo() + "\n"
                            + "Rendimento: " + cp.getRendimento() + "%" + "\n"
                            + "Saques Mensais permitidos: " + cp.getSaquesMensais() + "\n"
                            + "=======================================");
            }
        }
    }

    public void novoMes(ContaCorrente cc){
        System.out.println("\n"+"Olá já se passou mais um mês, e estaremos recolhendo a taxa mensal desse mês hoje!");
        double saldoCTaxas = getSaldo() - cc.getTaxasMensais();
        rendimento = (rendimento*100)/100;
        double saldoCRendimento = saldoCTaxas+rendimento;
        setSaldo(saldoCRendimento);

        setSaquesMensais(0);
    }

    public void saque(Scanner tec, ArrayList<ContaBancaria> contas){
        System.out.println("\n"+":Menu Saque:");

        for(ContaBancaria cb : contas){

            System.out.println("Digite o número da conta: ");
            int num = tec.nextInt();

            if(cb.getNumConta() == num){

                if(verificaSenha(tec,contas)==true){

                    if(getSaquesMensais()<3){
                
                    System.out.println("Qual o valor a ser sacado: ");
                    double sacar = tec.nextDouble();

                        if(sacar>getSaldo()){
                            System.out.println("\n"+"Seu saldo é insuficiente para essa retirada!"+"\n"+"Digite um valor menor!");
                        }else if(getSaldo()>sacar){
                            saldo -= sacar;
                            System.out.println("\n"+"Ok, tudo certo com o saque!"+"\n"+"Você sacou R$"+sacar+" seu saldo agora é de R$ "+saldo);
                        }
                    }else{
                        System.out.println("\n"+"Você atingiu o limite de saques mensais!"+"\n"+"Agora só poderá sacar no mês seguinte!");
                    }
                }
            }
        }
    }

    public void deposito(Scanner tec){
        System.out.println("\n"+":Menu Depósito:"+"\n"+
        "Qual o valor a ser depositado: ");
        double depositar = tec.nextDouble();

        if(depositar<10){
            System.out.println("\n"+"Você não pode depositar um valor abaixo de R$ 10,00"+"\n"+"Digite um valor mínimo de R$ 10,00!");
        }else if(depositar>=10){
            double novoSaldo = getSaldo() + depositar;
            setSaldo(novoSaldo);
            System.out.println("\n"+"Você depositou R$ "+depositar+" seu saldo agora é de R$ "+saldo);
        }
    }

    public void deposito(double depositar){
        System.out.println("\n"+":Menu Depósito:"+"\n");

        if(depositar<10){
            System.out.println("\n"+"Você não pode depositar um valor abaixo de R$ 10,00"+"\n"+"Digite um valor mínimo de R$ 10,00!");
        }else if(depositar>=10){
            double novoSaldo = getSaldo() + depositar;
            setSaldo(novoSaldo);
            System.out.println("\n"+"Você depositou R$ "+depositar+" seu saldo agora é de R$ "+saldo);
        }
    }

    //Getters and Setters

    public double getRendimento(){
        return rendimento;
    }
    public void setRendimento(double novoRendimento){
        this.rendimento=novoRendimento;
    }
    public int getSaquesMensais(){
        return saquesMensais;
    }
    public void setSaquesMensais(int novosMensais){
        this.rendimento=novosMensais;
    }
    
}
