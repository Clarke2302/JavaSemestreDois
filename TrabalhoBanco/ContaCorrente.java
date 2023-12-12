import java.util.ArrayList;

public class ContaCorrente extends ContaBancaria{
    
    private double taxasMensais;
    ArrayList<ContaCorrente> contasCorrentes;

    public ContaCorrente(Pessoa titular, Banco banco, int numConta, double saldo, String senha, double taxasMensais){
        super(titular,banco,numConta,saldo,senha);
        this.taxasMensais=taxasMensais;
    }

    public ContaCorrente(){

    }

    public void info(ArrayList<ContaCorrente> contasCorrentes,ArrayList<Pessoa> pessoasCadastradas){
        for(Pessoa a : pessoasCadastradas){
            for(ContaCorrente cc : contasCorrentes){
            System.out.println("\n"+"==========Info Conta Corrente=========="+"\n"
            +"Titular da Conta: "+a.getNome()+" "+a.getSobrenome()+"\n"
            +"Nome do Banco: "+cc.getBanco().getNomeBanco()+"\n"
            +"Número da Conta: "+cc.getNumConta()+"\n"
            +"Saldo: R$ "+cc.getSaldo()+"\n"
            +"Taxas Mensais: R$ "+cc.getTaxasMensais()+"\n"
            +"=======================================");
            }
        }
    }

    public void novoMes(){
        System.out.println("\n"+"Olá já se passou mais um mês, e estaremos recolhendo a taxa mensal desse mês hoje!");
        double novoSaldo = getSaldo() - taxasMensais;
        setSaldo(novoSaldo);
    }

    //Getters and Setters

    public double getTaxasMensais(){
        return taxasMensais;
    }
    public void setTaxasMensais(double novaTaxa){
        this.taxasMensais=novaTaxa;
    }
}
