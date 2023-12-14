import java.util.ArrayList;
import java.util.Scanner;

public abstract class ContaBancaria {
    
    private Pessoa titular;
    private Banco banco;
    private int numConta;
    double saldo = 0 ;
    private String senha;

    public ContaBancaria(Pessoa titular, Banco banco, int numConta, double saldo, String senha){
        this.titular=titular;
        this.banco=banco;
        this.numConta=numConta;
        this.saldo=saldo;
        this.senha=senha;
        
    }
    public ContaBancaria(){
        
    }
 //------------Sacar--------------------
    public void saque(Scanner tec,ArrayList<ContaBancaria> contas){
        System.out.println("\n"+":Menu Saque:");

        System.out.println("Digite o número da conta: ");
        int num = tec.nextInt();

        for(ContaBancaria cb : contas){

            if(cb.getNumConta() == num){

                if(verificaSenha(tec, contas)==true){
                
                System.out.println("Qual o valor a ser sacado: ");
                double sacar = tec.nextDouble();

                    if(sacar>cb.getSaldo()){
                        System.out.println("\n"+"Seu saldo é insuficiente para essa retirada!"+"\n"+"Digite um valor menor!");
                    }else if(cb.getSaldo()>sacar){
                        double novoSaldo = cb.getSaldo()-sacar;
                        cb.setSaldo(novoSaldo);
                
                    }
                }
            }
        }
    }

    public void saque(double sacar, Scanner tec, ArrayList<ContaBancaria> contas, int num){
        System.out.println("\n"+":Menu Saque:");

        for(ContaBancaria cb : contas){
            
            if(cb.getNumConta() == num){
        
            System.out.println("Agora precisamos que digite a sua senha: "+"\n");
            int senhhh = tec.nextInt();
            
                if(verificaSenha(senhhh,contas)==true){

                    if(sacar>cb.getSaldo()){
                        System.out.println("\n"+"Seu saldo é insuficiente para essa retirada!"+"\n"+"Digite um valor menor!");
                    }else if(cb.getSaldo()>sacar){
                        double novoSaldo = cb.getSaldo()-sacar;
                        cb.setSaldo(novoSaldo);
                    
                    }
                }
            }
        }
    }
    //-------------Depositar---------------
    public void deposito(Scanner tec,ArrayList<ContaBancaria> contas){
        System.out.println("\n"+":Menu Depósito:");

        System.out.println("Digite o número da conta: ");
            int num = tec.nextInt();
            
        
        for(ContaBancaria cb : contas){
            
            if(cb.getNumConta() == num){

                System.out.println("Qual o valor a ser depositado: ");
                double depositar = tec.nextDouble();

                if(depositar<10){
                    System.out.println("\n"+"Você não pode depositar um valor abaixo de R$ 10,00"+"\n"+"Digite um valor mínimo de R$ 10,00!");
                }else if(depositar>=10){
                    
                    double novoSaldo =saldo + depositar;
                    cb.setSaldo(novoSaldo);
                
                }
            }
        }
    }

    public void deposito(double depositar,ArrayList<ContaBancaria> contas, int num){
        System.out.println("\n"+":Menu Depósito:"+"\n");

        for(ContaBancaria cb : contas){
            
            if(cb.getNumConta() == num){

                if(depositar<10){
                    System.out.println("\n"+"Você não pode depositar um valor abaixo de R$ 10,00"+"\n"+"Digite um valor mínimo de R$ 10,00!");
                }else if(depositar>=10){
                    double novoSaldo =saldo + depositar;
                    cb.setSaldo(novoSaldo);
                
                }
            }
        }
    }
    //----------------Verificar Senha-------------------
    public boolean verificaSenha(Scanner tec,ArrayList<ContaBancaria> contas){
        System.out.println("\n"+"Digite a sua senha: ");
        String suaSenha = tec.next();
        
        for(ContaBancaria cb : contas){
            
            if(cb.getSenha().equalsIgnoreCase(suaSenha)){
                return true;
            }else{
                System.out.println("A senha está incorreta!");
                return false;
            }
        }
        return false;
        
    }

    public boolean verificaSenha(int senhaa,ArrayList<ContaBancaria> contas){
        String senhaEmString = String.valueOf(senhaa);

        for(ContaBancaria cb : contas){

            if(cb.getSenha().equalsIgnoreCase(senhaEmString)){
                return true;
            }else{
                System.out.println("A senha está incorreta!");
                return false;
            }
        }
        return true;
    }

    //Getters and Setters

    public Pessoa getTitular(){
        return titular;
    }
    public Banco getBanco(){
        return banco;
    }
    public int getNumConta(){
        return numConta;
    }
    public double getSaldo(){
        return saldo;
    }
    public String getSenha(){
        return senha;
    }

    public void setPessoa(Pessoa novoTitular){
        this.titular = novoTitular;
    }
    public void setBanco(Banco novoBanco){
        this.banco = novoBanco;
    }
    public void setNumConta(int novoNum){
        this.numConta = novoNum;
    }
    public void setSaldo(double novoSaldo){
        this.saldo = novoSaldo;
    }
    public void setSenha(String novaSenha){
        this.senha = novaSenha;
    }
}
